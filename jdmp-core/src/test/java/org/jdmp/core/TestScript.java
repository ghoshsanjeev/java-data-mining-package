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

package org.jdmp.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.core.module.Module;
import org.jdmp.core.module.ModuleFactory;
import org.jdmp.core.sample.Sample;
import org.jdmp.core.script.Result;
import org.junit.Test;
import org.ujmp.core.Matrix;

public class TestScript {

	@Test
	public void testPlus() throws Exception {
		Module m = ModuleFactory.emptyModule();
		m.execute("a=[1,2,3;4,5,6]");
		m.execute("b=[4,5,6;1,2,3]");
		Result r = m.execute("a+b");
		m.execute("c=a+b");

		Matrix rm = (Matrix) r.getObject();
		Matrix vm = m.getVariableMap().get("c").getLast();
		Matrix expected = Matrix.Factory.linkToArray(new double[][] { { 5, 7, 9 }, { 5, 7, 9 } });

		assertEquals(expected, rm);
		assertEquals(expected, vm);
	}

	@Test
	public void testIris() throws Exception {
		Result r = execute("iris");
		Object o = r.getObject();
		assertTrue(o instanceof ListDataSet);
		ListDataSet ds = (ListDataSet) o;
		assertEquals(150, ds.size());
	}

	@Test
	public void testHenon() throws Exception {
		Result r = execute("henon(100,10,5)");
		Object o = r.getObject();
		assertTrue(o instanceof ListDataSet);
		ListDataSet ds = (ListDataSet) o;
		assertEquals(100, ds.size());
		Sample s = ds.get(0);
		long input = s.getAsMatrix(Sample.INPUT).getColumnCount();
		long target = s.getAsMatrix(Sample.TARGET).getColumnCount();
		assertEquals(10, input);
		assertEquals(5, target);
	}

	private Result execute(String s) throws Exception {
		Module m = ModuleFactory.emptyModule();
		return m.execute(s);
	}
}
