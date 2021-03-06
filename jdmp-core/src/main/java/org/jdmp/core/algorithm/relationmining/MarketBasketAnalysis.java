/*
 * Copyright (C) 2008-2016 by Holger Arndt
 *
 * This file is part of the Java Data Mining Package (JDMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * JDMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JDMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JDMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.jdmp.core.algorithm.relationmining;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jdmp.core.dataset.DefaultListDataSet;
import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.core.sample.RelationalSample;
import org.jdmp.core.sample.Sample;
import org.ujmp.core.Matrix;
import org.ujmp.core.mapmatrix.DefaultMapMatrix;
import org.ujmp.core.mapmatrix.MapMatrix;
import org.ujmp.core.objectmatrix.stub.AbstractDenseObjectMatrix2D;

public class MarketBasketAnalysis extends AbstractRelationMiner {

	private final MapMatrix product1ToIds = new DefaultMapMatrix();

	private final MapMatrix product2ToIds = new DefaultMapMatrix();

	private int minSupport = 10;

	public ListDataSet calculate(ListDataSet dataSet) throws Exception {
		product1ToIds.setLabel("Product 1 Ids");
		product2ToIds.setLabel("Product 2 Ids");

		Matrix product1Count = new CountMatrix(product1ToIds);
		product1Count.setLabel("Product 1 Count");

		Matrix product2Count = new CountMatrix(product2ToIds);
		product2Count.setLabel("Product 2 Count");

		for (int r = 0; r < dataSet.size(); r++) {

			if (r % 1000 == 0) {
				System.out.println(r + " of " + dataSet.size());
			}
			RelationalSample s = (RelationalSample) dataSet.get(r);
			Collection<?> products = s.getObjects();
			if (products.size() != 0) {
				addProduct1Count(products, r);
				addProduct2Count(products, r);
			}
		}

		return calculateP(minSupport);
	}

	public static void main(String[] args) throws Exception {
		Matrix data = Matrix.Factory.linkTo().file("/home/arndt/muenchen/totale2.txt").asDenseCSV();
		// data.showGUI();

		ListDataSet orig = new DefaultListDataSet();

		// for (int r = 0; r < 10000; r++) {
		for (int r = 0; r < data.getRowCount(); r++) {

			if (r % 1000 == 0) {
				System.out.println(r + " of " + data.getRowCount());
			}

			Collection<?> products = getProductsInLine(data, r);
			if (products.size() != 0) {
				RelationalSample s = Sample.Factory.relationalSample(products);
				orig.add(s);
			}
		}

		MarketBasketAnalysis mba = new MarketBasketAnalysis();
		orig.showGUI();
		ListDataSet ds = mba.calculate(orig);
		ds.showGUI();
	}

	private ListDataSet calculateP(int minSupport) throws Exception {
		ListDataSet ds = new DefaultListDataSet();

		for (Object o : product2ToIds.keySet()) {
			Set<String> set = (Set<String>) (o);
			int count = ((List) product2ToIds.get(set)).size();
			if (count >= minSupport) {

				System.out.println("===========================");
				System.out.println(set + ": " + count);
				Iterator it = set.iterator();
				String prod1 = (String) it.next();
				String prod2 = (String) it.next();

				double p1 = getP(prod1, prod2);
				double p2 = getP(prod2, prod1);

				System.out.println(prod1 + " => " + prod2 + ": " + p1);
				System.out.println(prod2 + " => " + prod1 + ": " + p2);

				RelationalSample s12 = Sample.Factory.relationalSample(prod1 + " => " + prod2);
				s12.addObject(prod1);
				s12.addObject(prod2);
				s12.put(Sample.COUNT, Matrix.Factory.linkToValue(count));
				s12.put(Sample.PROBABILITY, Matrix.Factory.linkToValue(p1));
				s12.put("From", prod1);
				s12.put("To", prod2);
				ds.add(s12);

				RelationalSample s21 = Sample.Factory.relationalSample(prod2 + " => " + prod1);
				s21.addObject(prod1);
				s21.addObject(prod2);
				s21.put(Sample.COUNT, Matrix.Factory.linkToValue(count));
				s21.put(Sample.PROBABILITY, Matrix.Factory.linkToValue(p2));
				s21.put("From", prod2);
				s21.put("To", prod1);
				ds.add(s21);

			}
		}

		return ds;
	}

	private int getCount(String p1, String p2) {
		Set<String> set = new HashSet<String>(2);
		set.add(p1.intern());
		set.add(p2.intern());
		List<Integer> ids = (List<Integer>) product2ToIds.get(set);

		if (ids != null) {
			return ids.size();
		} else {
			return 0;
		}
	}

	private double getP(String p1, String p2) {
		List<Integer> idsSingle = (List<Integer>) product1ToIds.get(p1.intern());
		int countTotal = 0;
		if (idsSingle != null) {
			countTotal = idsSingle.size();
		}
		int countPairwise = getCount(p1, p2);
		return (double) countPairwise / countTotal;

	}

	private void addProduct1Count(Collection<?> products, int row) {
		// products must occur only once in set
		products = new HashSet<Object>(products);

		// skip sets with only one product
		if (products.size() < 2) {
			return;
		}

		for (Object s : products) {
			List<Integer> ids = (List<Integer>) product1ToIds.get(s);
			if (ids == null) {
				ids = new ArrayList<Integer>(1);
			}
			ids.add(row);
			product1ToIds.put(s, ids);
		}
	}

	private List<Set<?>> getPerm2(Collection<?> products) {
		List<?> productList = new ArrayList<Object>(products);
		List<Set<?>> permList = new ArrayList<Set<?>>();

		for (int i1 = 0; i1 < productList.size(); i1++) {
			for (int i2 = i1 + 1; i2 < productList.size(); i2++) {
				Set<Object> product2Set = new HashSet<Object>(2);
				product2Set.add(productList.get(i1));
				product2Set.add(productList.get(i2));
				permList.add(product2Set);
			}
		}

		return permList;
	}

	private void addProduct2Count(Collection<?> products, int row) {
		// products must occur only once in set
		products = new HashSet<Object>(products);

		if (products.size() < 2) {
			return;
		}

		List<Object> productList = new ArrayList<Object>(products);

		List<Set<?>> perm2 = getPerm2(products);

		for (Collection<?> s : perm2) {
			List<Integer> ids = (List<Integer>) product2ToIds.get(s);
			if (ids == null) {
				ids = new ArrayList<Integer>(1);
			}
			ids.add(row);
			product2ToIds.put(s, ids);
		}
	}

	private static Collection<?> getProductsInLine(Matrix data, long row) {
		Set<Object> products = new HashSet<Object>();
		for (int c = 1; c < data.getColumnCount(); c++) {
			String prod = data.getAsString(row, c);
			if (prod != null) {
				prod = prod.trim().intern();
				if (prod.length() != 0) {
					products.add(prod);
				}
			}
		}
		return products;
	}

	public int getMinSupport() {
		return minSupport;
	}

	public void setMinSupport(int minSupport) {
		this.minSupport = minSupport;
	}

}

class CountMatrix extends AbstractDenseObjectMatrix2D {
	private static final long serialVersionUID = -3985951298755499721L;

	Matrix matrix = null;

	public CountMatrix(Matrix source) {
		super(source.getRowCount(), source.getColumnCount());
		this.matrix = source;
	}

	public Object getObject(int row, int column) {
		return getObject((long) row, (long) column);
	}

	public Object getObject(long row, long column) {
		Object o = matrix.getAsObject(row, column);
		if (column == 0) {
			return o;
		} else {
			return ((Collection) o).size();
		}
	}

	public void setObject(Object value, long row, long column) {
	}

	public void setObject(Object value, int row, int column) {
	}

	public long[] getSize() {
		return matrix.getSize();
	}

}
