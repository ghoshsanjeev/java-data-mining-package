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

package org.jdmp.core.algorithm.basic;

import java.util.HashMap;
import java.util.Map;

import org.jdmp.core.algorithm.AbstractAlgorithm;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.core.sample.Sample;
import org.jdmp.core.variable.Variable;
import org.ujmp.core.Matrix;

public class CreateIris extends AbstractAlgorithm {
	private static final long serialVersionUID = 5005634034611593171L;

	public static final String DESCRIPTION = "generates the Iris flower DataSet";

	public CreateIris(Variable... variables) {
		super();
		setDescription(DESCRIPTION);
		addVariableKey(TARGET);
		setEdgeLabel(TARGET, "Target");
		setEdgeDirection(TARGET, EdgeDirection.Outgoing);
		setVariables(variables);
	}

	public Map<String, Object> calculateObjects(Map<String, Object> input) {
		Map<String, Object> result = new HashMap<String, Object>();

		ListDataSet iris = DataSet.Factory.emptyDataSet();
		iris.setLabel("Iris flower data set");
		iris.setMetaData(Sample.URL, "http://archive.ics.uci.edu/ml/datasets/Iris");
		iris.setDescription("Fisher's Iris data set is a multivariate data set introduced by Sir Ronald Aylmer Fisher (1936) as an example of discriminant analysis.");

		Sample s0 = Sample.Factory.emptySample();
		s0.put("SepalLength", 5.1);
		s0.put("SepalWidth", 3.5);
		s0.put("PetalLength", 1.4);
		s0.put("PetalWidth", 0.2);
		Matrix input0 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.5, 1.4, 0.2 }).transpose();
		s0.put(INPUT, input0);
		Matrix output0 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s0.put(TARGET, output0);
		s0.setLabel("Iris-setosa");
		s0.setId("iris-0");
		iris.add(s0);

		Sample s1 = Sample.Factory.emptySample();
		s1.put("SepalLength", 4.9);
		s1.put("SepalWidth", 3.0);
		s1.put("PetalLength", 1.4);
		s1.put("PetalWidth", 0.2);
		Matrix input1 = Matrix.Factory.linkToArray(new double[] { 4.9, 3.0, 1.4, 0.2 }).transpose();
		s1.put(INPUT, input1);
		Matrix output1 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s1.put(TARGET, output1);
		s1.setLabel("Iris-setosa");
		s1.setId("iris-1");
		iris.add(s1);

		Sample s2 = Sample.Factory.emptySample();
		s2.put("SepalLength", 4.7);
		s2.put("SepalWidth", 3.2);
		s2.put("PetalLength", 1.3);
		s2.put("PetalWidth", 0.2);
		Matrix input2 = Matrix.Factory.linkToArray(new double[] { 4.7, 3.2, 1.3, 0.2 }).transpose();
		s2.put(INPUT, input2);
		Matrix output2 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s2.put(TARGET, output2);
		s2.setLabel("Iris-setosa");
		s2.setId("iris-2");
		iris.add(s2);

		Sample s3 = Sample.Factory.emptySample();
		s3.put("SepalLength", 4.6);
		s3.put("SepalWidth", 3.1);
		s3.put("PetalLength", 1.5);
		s3.put("PetalWidth", 0.2);
		Matrix input3 = Matrix.Factory.linkToArray(new double[] { 4.6, 3.1, 1.5, 0.2 }).transpose();
		s3.put(INPUT, input3);
		Matrix output3 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s3.put(TARGET, output3);
		s3.setLabel("Iris-setosa");
		s3.setId("iris-3");
		iris.add(s3);

		Sample s4 = Sample.Factory.emptySample();
		s4.put("SepalLength", 5.0);
		s4.put("SepalWidth", 3.6);
		s4.put("PetalLength", 1.4);
		s4.put("PetalWidth", 0.2);
		Matrix input4 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.6, 1.4, 0.2 }).transpose();
		s4.put(INPUT, input4);
		Matrix output4 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s4.put(TARGET, output4);
		s4.setLabel("Iris-setosa");
		s4.setId("iris-4");
		iris.add(s4);

		Sample s5 = Sample.Factory.emptySample();
		s5.put("SepalLength", 5.4);
		s5.put("SepalWidth", 3.9);
		s5.put("PetalLength", 1.7);
		s5.put("PetalWidth", 0.4);
		Matrix input5 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.9, 1.7, 0.4 }).transpose();
		s5.put(INPUT, input5);
		Matrix output5 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s5.put(TARGET, output5);
		s5.setLabel("Iris-setosa");
		s5.setId("iris-5");
		iris.add(s5);

		Sample s6 = Sample.Factory.emptySample();
		s6.put("SepalLength", 4.6);
		s6.put("SepalWidth", 3.4);
		s6.put("PetalLength", 1.4);
		s6.put("PetalWidth", 0.3);
		Matrix input6 = Matrix.Factory.linkToArray(new double[] { 4.6, 3.4, 1.4, 0.3 }).transpose();
		s6.put(INPUT, input6);
		Matrix output6 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s6.put(TARGET, output6);
		s6.setLabel("Iris-setosa");
		s6.setId("iris-6");
		iris.add(s6);

		Sample s7 = Sample.Factory.emptySample();
		s7.put("SepalLength", 5.0);
		s7.put("SepalWidth", 3.4);
		s7.put("PetalLength", 1.5);
		s7.put("PetalWidth", 0.2);
		Matrix input7 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.4, 1.5, 0.2 }).transpose();
		s7.put(INPUT, input7);
		Matrix output7 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s7.put(TARGET, output7);
		s7.setLabel("Iris-setosa");
		s7.setId("iris-7");
		iris.add(s7);

		Sample s8 = Sample.Factory.emptySample();
		s8.put("SepalLength", 4.4);
		s8.put("SepalWidth", 2.9);
		s8.put("PetalLength", 1.4);
		s8.put("PetalWidth", 0.2);
		Matrix input8 = Matrix.Factory.linkToArray(new double[] { 4.4, 2.9, 1.4, 0.2 }).transpose();
		s8.put(INPUT, input8);
		Matrix output8 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s8.put(TARGET, output8);
		s8.setLabel("Iris-setosa");
		s8.setId("iris-8");
		iris.add(s8);

		Sample s9 = Sample.Factory.emptySample();
		s9.put("SepalLength", 4.9);
		s9.put("SepalWidth", 3.1);
		s9.put("PetalLength", 1.5);
		s9.put("PetalWidth", 0.1);
		Matrix input9 = Matrix.Factory.linkToArray(new double[] { 4.9, 3.1, 1.5, 0.1 }).transpose();
		s9.put(INPUT, input9);
		Matrix output9 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s9.put(TARGET, output9);
		s9.setLabel("Iris-setosa");
		s9.setId("iris-9");
		iris.add(s9);

		Sample s10 = Sample.Factory.emptySample();
		s10.put("SepalLength", 5.4);
		s10.put("SepalWidth", 3.7);
		s10.put("PetalLength", 1.5);
		s10.put("PetalWidth", 0.2);
		Matrix input10 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.7, 1.5, 0.2 })
				.transpose();
		s10.put(INPUT, input10);
		Matrix output10 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s10.put(TARGET, output10);
		s10.setLabel("Iris-setosa");
		s10.setId("iris-10");
		iris.add(s10);

		Sample s11 = Sample.Factory.emptySample();
		s11.put("SepalLength", 4.8);
		s11.put("SepalWidth", 3.4);
		s11.put("PetalLength", 1.6);
		s11.put("PetalWidth", 0.2);
		Matrix input11 = Matrix.Factory.linkToArray(new double[] { 4.8, 3.4, 1.6, 0.2 })
				.transpose();
		s11.put(INPUT, input11);
		Matrix output11 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s11.put(TARGET, output11);
		s11.setLabel("Iris-setosa");
		s11.setId("iris-11");
		iris.add(s11);

		Sample s12 = Sample.Factory.emptySample();
		s12.put("SepalLength", 4.8);
		s12.put("SepalWidth", 3.0);
		s12.put("PetalLength", 1.4);
		s12.put("PetalWidth", 0.1);
		Matrix input12 = Matrix.Factory.linkToArray(new double[] { 4.8, 3.0, 1.4, 0.1 })
				.transpose();
		s12.put(INPUT, input12);
		Matrix output12 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s12.put(TARGET, output12);
		s12.setLabel("Iris-setosa");
		s12.setId("iris-12");
		iris.add(s12);

		Sample s13 = Sample.Factory.emptySample();
		s13.put("SepalLength", 4.3);
		s13.put("SepalWidth", 3.0);
		s13.put("PetalLength", 1.1);
		s13.put("PetalWidth", 0.1);
		Matrix input13 = Matrix.Factory.linkToArray(new double[] { 4.3, 3.0, 1.1, 0.1 })
				.transpose();
		s13.put(INPUT, input13);
		Matrix output13 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s13.put(TARGET, output13);
		s13.setLabel("Iris-setosa");
		s13.setId("iris-13");
		iris.add(s13);

		Sample s14 = Sample.Factory.emptySample();
		s14.put("SepalLength", 5.8);
		s14.put("SepalWidth", 4.0);
		s14.put("PetalLength", 1.2);
		s14.put("PetalWidth", 0.2);
		Matrix input14 = Matrix.Factory.linkToArray(new double[] { 5.8, 4.0, 1.2, 0.2 })
				.transpose();
		s14.put(INPUT, input14);
		Matrix output14 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s14.put(TARGET, output14);
		s14.setLabel("Iris-setosa");
		s14.setId("iris-14");
		iris.add(s14);

		Sample s15 = Sample.Factory.emptySample();
		s15.put("SepalLength", 5.7);
		s15.put("SepalWidth", 4.4);
		s15.put("PetalLength", 1.5);
		s15.put("PetalWidth", 0.4);
		Matrix input15 = Matrix.Factory.linkToArray(new double[] { 5.7, 4.4, 1.5, 0.4 })
				.transpose();
		s15.put(INPUT, input15);
		Matrix output15 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s15.put(TARGET, output15);
		s15.setLabel("Iris-setosa");
		s15.setId("iris-15");
		iris.add(s15);

		Sample s16 = Sample.Factory.emptySample();
		s16.put("SepalLength", 5.4);
		s16.put("SepalWidth", 3.9);
		s16.put("PetalLength", 1.3);
		s16.put("PetalWidth", 0.4);
		Matrix input16 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.9, 1.3, 0.4 })
				.transpose();
		s16.put(INPUT, input16);
		Matrix output16 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s16.put(TARGET, output16);
		s16.setLabel("Iris-setosa");
		s16.setId("iris-16");
		iris.add(s16);

		Sample s17 = Sample.Factory.emptySample();
		s17.put("SepalLength", 5.1);
		s17.put("SepalWidth", 3.5);
		s17.put("PetalLength", 1.4);
		s17.put("PetalWidth", 0.3);
		Matrix input17 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.5, 1.4, 0.3 })
				.transpose();
		s17.put(INPUT, input17);
		Matrix output17 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s17.put(TARGET, output17);
		s17.setLabel("Iris-setosa");
		s17.setId("iris-17");
		iris.add(s17);

		Sample s18 = Sample.Factory.emptySample();
		s18.put("SepalLength", 5.7);
		s18.put("SepalWidth", 3.8);
		s18.put("PetalLength", 1.7);
		s18.put("PetalWidth", 0.3);
		Matrix input18 = Matrix.Factory.linkToArray(new double[] { 5.7, 3.8, 1.7, 0.3 })
				.transpose();
		s18.put(INPUT, input18);
		Matrix output18 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s18.put(TARGET, output18);
		s18.setLabel("Iris-setosa");
		s18.setId("iris-18");
		iris.add(s18);

		Sample s19 = Sample.Factory.emptySample();
		s19.put("SepalLength", 5.1);
		s19.put("SepalWidth", 3.8);
		s19.put("PetalLength", 1.5);
		s19.put("PetalWidth", 0.3);
		Matrix input19 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.8, 1.5, 0.3 })
				.transpose();
		s19.put(INPUT, input19);
		Matrix output19 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s19.put(TARGET, output19);
		s19.setLabel("Iris-setosa");
		s19.setId("iris-19");
		iris.add(s19);

		Sample s20 = Sample.Factory.emptySample();
		s20.put("SepalLength", 5.4);
		s20.put("SepalWidth", 3.4);
		s20.put("PetalLength", 1.7);
		s20.put("PetalWidth", 0.2);
		Matrix input20 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.4, 1.7, 0.2 })
				.transpose();
		s20.put(INPUT, input20);
		Matrix output20 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s20.put(TARGET, output20);
		s20.setLabel("Iris-setosa");
		s20.setId("iris-20");
		iris.add(s20);

		Sample s21 = Sample.Factory.emptySample();
		s21.put("SepalLength", 5.1);
		s21.put("SepalWidth", 3.7);
		s21.put("PetalLength", 1.5);
		s21.put("PetalWidth", 0.4);
		Matrix input21 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.7, 1.5, 0.4 })
				.transpose();
		s21.put(INPUT, input21);
		Matrix output21 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s21.put(TARGET, output21);
		s21.setLabel("Iris-setosa");
		s21.setId("iris-21");
		iris.add(s21);

		Sample s22 = Sample.Factory.emptySample();
		s22.put("SepalLength", 4.6);
		s22.put("SepalWidth", 3.6);
		s22.put("PetalLength", 1.0);
		s22.put("PetalWidth", 0.2);
		Matrix input22 = Matrix.Factory.linkToArray(new double[] { 4.6, 3.6, 1.0, 0.2 })
				.transpose();
		s22.put(INPUT, input22);
		Matrix output22 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s22.put(TARGET, output22);
		s22.setLabel("Iris-setosa");
		s22.setId("iris-22");
		iris.add(s22);

		Sample s23 = Sample.Factory.emptySample();
		s23.put("SepalLength", 5.1);
		s23.put("SepalWidth", 3.3);
		s23.put("PetalLength", 1.7);
		s23.put("PetalWidth", 0.5);
		Matrix input23 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.3, 1.7, 0.5 })
				.transpose();
		s23.put(INPUT, input23);
		Matrix output23 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s23.put(TARGET, output23);
		s23.setLabel("Iris-setosa");
		s23.setId("iris-23");
		iris.add(s23);

		Sample s24 = Sample.Factory.emptySample();
		s24.put("SepalLength", 4.8);
		s24.put("SepalWidth", 3.4);
		s24.put("PetalLength", 1.9);
		s24.put("PetalWidth", 0.2);
		Matrix input24 = Matrix.Factory.linkToArray(new double[] { 4.8, 3.4, 1.9, 0.2 })
				.transpose();
		s24.put(INPUT, input24);
		Matrix output24 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s24.put(TARGET, output24);
		s24.setLabel("Iris-setosa");
		s24.setId("iris-24");
		iris.add(s24);

		Sample s25 = Sample.Factory.emptySample();
		s25.put("SepalLength", 5.0);
		s25.put("SepalWidth", 3.0);
		s25.put("PetalLength", 1.6);
		s25.put("PetalWidth", 0.2);
		Matrix input25 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.0, 1.6, 0.2 })
				.transpose();
		s25.put(INPUT, input25);
		Matrix output25 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s25.put(TARGET, output25);
		s25.setLabel("Iris-setosa");
		s25.setId("iris-25");
		iris.add(s25);

		Sample s26 = Sample.Factory.emptySample();
		s26.put("SepalLength", 5.0);
		s26.put("SepalWidth", 3.4);
		s26.put("PetalLength", 1.6);
		s26.put("PetalWidth", 0.4);
		Matrix input26 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.4, 1.6, 0.4 })
				.transpose();
		s26.put(INPUT, input26);
		Matrix output26 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s26.put(TARGET, output26);
		s26.setLabel("Iris-setosa");
		s26.setId("iris-26");
		iris.add(s26);

		Sample s27 = Sample.Factory.emptySample();
		s27.put("SepalLength", 5.2);
		s27.put("SepalWidth", 3.5);
		s27.put("PetalLength", 1.5);
		s27.put("PetalWidth", 0.2);
		Matrix input27 = Matrix.Factory.linkToArray(new double[] { 5.2, 3.5, 1.5, 0.2 })
				.transpose();
		s27.put(INPUT, input27);
		Matrix output27 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s27.put(TARGET, output27);
		s27.setLabel("Iris-setosa");
		s27.setId("iris-27");
		iris.add(s27);

		Sample s28 = Sample.Factory.emptySample();
		s28.put("SepalLength", 5.2);
		s28.put("SepalWidth", 3.4);
		s28.put("PetalLength", 1.4);
		s28.put("PetalWidth", 0.2);
		Matrix input28 = Matrix.Factory.linkToArray(new double[] { 5.2, 3.4, 1.4, 0.2 })
				.transpose();
		s28.put(INPUT, input28);
		Matrix output28 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s28.put(TARGET, output28);
		s28.setLabel("Iris-setosa");
		s28.setId("iris-28");
		iris.add(s28);

		Sample s29 = Sample.Factory.emptySample();
		s29.put("SepalLength", 4.7);
		s29.put("SepalWidth", 3.2);
		s29.put("PetalLength", 1.6);
		s29.put("PetalWidth", 0.2);
		Matrix input29 = Matrix.Factory.linkToArray(new double[] { 4.7, 3.2, 1.6, 0.2 })
				.transpose();
		s29.put(INPUT, input29);
		Matrix output29 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s29.put(TARGET, output29);
		s29.setLabel("Iris-setosa");
		s29.setId("iris-29");
		iris.add(s29);

		Sample s30 = Sample.Factory.emptySample();
		s30.put("SepalLength", 4.8);
		s30.put("SepalWidth", 3.1);
		s30.put("PetalLength", 1.6);
		s30.put("PetalWidth", 0.2);
		Matrix input30 = Matrix.Factory.linkToArray(new double[] { 4.8, 3.1, 1.6, 0.2 })
				.transpose();
		s30.put(INPUT, input30);
		Matrix output30 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s30.put(TARGET, output30);
		s30.setLabel("Iris-setosa");
		s30.setId("iris-30");
		iris.add(s30);

		Sample s31 = Sample.Factory.emptySample();
		s31.put("SepalLength", 5.4);
		s31.put("SepalWidth", 3.4);
		s31.put("PetalLength", 1.5);
		s31.put("PetalWidth", 0.4);
		Matrix input31 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.4, 1.5, 0.4 })
				.transpose();
		s31.put(INPUT, input31);
		Matrix output31 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s31.put(TARGET, output31);
		s31.setLabel("Iris-setosa");
		s31.setId("iris-31");
		iris.add(s31);

		Sample s32 = Sample.Factory.emptySample();
		s32.put("SepalLength", 5.2);
		s32.put("SepalWidth", 4.1);
		s32.put("PetalLength", 1.5);
		s32.put("PetalWidth", 0.1);
		Matrix input32 = Matrix.Factory.linkToArray(new double[] { 5.2, 4.1, 1.5, 0.1 })
				.transpose();
		s32.put(INPUT, input32);
		Matrix output32 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s32.put(TARGET, output32);
		s32.setLabel("Iris-setosa");
		s32.setId("iris-32");
		iris.add(s32);

		Sample s33 = Sample.Factory.emptySample();
		s33.put("SepalLength", 5.5);
		s33.put("SepalWidth", 4.2);
		s33.put("PetalLength", 1.4);
		s33.put("PetalWidth", 0.2);
		Matrix input33 = Matrix.Factory.linkToArray(new double[] { 5.5, 4.2, 1.4, 0.2 })
				.transpose();
		s33.put(INPUT, input33);
		Matrix output33 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s33.put(TARGET, output33);
		s33.setLabel("Iris-setosa");
		s33.setId("iris-33");
		iris.add(s33);

		Sample s34 = Sample.Factory.emptySample();
		s34.put("SepalLength", 4.9);
		s34.put("SepalWidth", 3.1);
		s34.put("PetalLength", 1.5);
		s34.put("PetalWidth", 0.1);
		Matrix input34 = Matrix.Factory.linkToArray(new double[] { 4.9, 3.1, 1.5, 0.1 })
				.transpose();
		s34.put(INPUT, input34);
		Matrix output34 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s34.put(TARGET, output34);
		s34.setLabel("Iris-setosa");
		s34.setId("iris-34");
		iris.add(s34);

		Sample s35 = Sample.Factory.emptySample();
		s35.put("SepalLength", 5.0);
		s35.put("SepalWidth", 3.2);
		s35.put("PetalLength", 1.2);
		s35.put("PetalWidth", 0.2);
		Matrix input35 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.2, 1.2, 0.2 })
				.transpose();
		s35.put(INPUT, input35);
		Matrix output35 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s35.put(TARGET, output35);
		s35.setLabel("Iris-setosa");
		s35.setId("iris-35");
		iris.add(s35);

		Sample s36 = Sample.Factory.emptySample();
		s36.put("SepalLength", 5.5);
		s36.put("SepalWidth", 3.5);
		s36.put("PetalLength", 1.3);
		s36.put("PetalWidth", 0.2);
		Matrix input36 = Matrix.Factory.linkToArray(new double[] { 5.5, 3.5, 1.3, 0.2 })
				.transpose();
		s36.put(INPUT, input36);
		Matrix output36 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s36.put(TARGET, output36);
		s36.setLabel("Iris-setosa");
		s36.setId("iris-36");
		iris.add(s36);

		Sample s37 = Sample.Factory.emptySample();
		s37.put("SepalLength", 4.9);
		s37.put("SepalWidth", 3.1);
		s37.put("PetalLength", 1.5);
		s37.put("PetalWidth", 0.1);
		Matrix input37 = Matrix.Factory.linkToArray(new double[] { 4.9, 3.1, 1.5, 0.1 })
				.transpose();
		s37.put(INPUT, input37);
		Matrix output37 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s37.put(TARGET, output37);
		s37.setLabel("Iris-setosa");
		s37.setId("iris-37");
		iris.add(s37);

		Sample s38 = Sample.Factory.emptySample();
		s38.put("SepalLength", 4.4);
		s38.put("SepalWidth", 3.0);
		s38.put("PetalLength", 1.3);
		s38.put("PetalWidth", 0.2);
		Matrix input38 = Matrix.Factory.linkToArray(new double[] { 4.4, 3.0, 1.3, 0.2 })
				.transpose();
		s38.put(INPUT, input38);
		Matrix output38 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s38.put(TARGET, output38);
		s38.setLabel("Iris-setosa");
		s38.setId("iris-38");
		iris.add(s38);

		Sample s39 = Sample.Factory.emptySample();
		s39.put("SepalLength", 5.1);
		s39.put("SepalWidth", 3.4);
		s39.put("PetalLength", 1.5);
		s39.put("PetalWidth", 0.2);
		Matrix input39 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.4, 1.5, 0.2 })
				.transpose();
		s39.put(INPUT, input39);
		Matrix output39 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s39.put(TARGET, output39);
		s39.setLabel("Iris-setosa");
		s39.setId("iris-39");
		iris.add(s39);

		Sample s40 = Sample.Factory.emptySample();
		s40.put("SepalLength", 5.0);
		s40.put("SepalWidth", 3.5);
		s40.put("PetalLength", 1.3);
		s40.put("PetalWidth", 0.3);
		Matrix input40 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.5, 1.3, 0.3 })
				.transpose();
		s40.put(INPUT, input40);
		Matrix output40 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s40.put(TARGET, output40);
		s40.setLabel("Iris-setosa");
		s40.setId("iris-40");
		iris.add(s40);

		Sample s41 = Sample.Factory.emptySample();
		s41.put("SepalLength", 4.5);
		s41.put("SepalWidth", 2.3);
		s41.put("PetalLength", 1.3);
		s41.put("PetalWidth", 0.3);
		Matrix input41 = Matrix.Factory.linkToArray(new double[] { 4.5, 2.3, 1.3, 0.3 })
				.transpose();
		s41.put(INPUT, input41);
		Matrix output41 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s41.put(TARGET, output41);
		s41.setLabel("Iris-setosa");
		s41.setId("iris-41");
		iris.add(s41);

		Sample s42 = Sample.Factory.emptySample();
		s42.put("SepalLength", 4.4);
		s42.put("SepalWidth", 3.2);
		s42.put("PetalLength", 1.3);
		s42.put("PetalWidth", 0.2);
		Matrix input42 = Matrix.Factory.linkToArray(new double[] { 4.4, 3.2, 1.3, 0.2 })
				.transpose();
		s42.put(INPUT, input42);
		Matrix output42 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s42.put(TARGET, output42);
		s42.setLabel("Iris-setosa");
		s42.setId("iris-42");
		iris.add(s42);

		Sample s43 = Sample.Factory.emptySample();
		s43.put("SepalLength", 5.0);
		s43.put("SepalWidth", 3.5);
		s43.put("PetalLength", 1.6);
		s43.put("PetalWidth", 0.6);
		Matrix input43 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.5, 1.6, 0.6 })
				.transpose();
		s43.put(INPUT, input43);
		Matrix output43 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s43.put(TARGET, output43);
		s43.setLabel("Iris-setosa");
		s43.setId("iris-43");
		iris.add(s43);

		Sample s44 = Sample.Factory.emptySample();
		s44.put("SepalLength", 5.1);
		s44.put("SepalWidth", 3.8);
		s44.put("PetalLength", 1.9);
		s44.put("PetalWidth", 0.4);
		Matrix input44 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.8, 1.9, 0.4 })
				.transpose();
		s44.put(INPUT, input44);
		Matrix output44 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s44.put(TARGET, output44);
		s44.setLabel("Iris-setosa");
		s44.setId("iris-44");
		iris.add(s44);

		Sample s45 = Sample.Factory.emptySample();
		s45.put("SepalLength", 4.8);
		s45.put("SepalWidth", 3.0);
		s45.put("PetalLength", 1.4);
		s45.put("PetalWidth", 0.3);
		Matrix input45 = Matrix.Factory.linkToArray(new double[] { 4.8, 3.0, 1.4, 0.3 })
				.transpose();
		s45.put(INPUT, input45);
		Matrix output45 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s45.put(TARGET, output45);
		s45.setLabel("Iris-setosa");
		s45.setId("iris-45");
		iris.add(s45);

		Sample s46 = Sample.Factory.emptySample();
		s46.put("SepalLength", 5.1);
		s46.put("SepalWidth", 3.8);
		s46.put("PetalLength", 1.6);
		s46.put("PetalWidth", 0.2);
		Matrix input46 = Matrix.Factory.linkToArray(new double[] { 5.1, 3.8, 1.6, 0.2 })
				.transpose();
		s46.put(INPUT, input46);
		Matrix output46 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s46.put(TARGET, output46);
		s46.setLabel("Iris-setosa");
		s46.setId("iris-46");
		iris.add(s46);

		Sample s47 = Sample.Factory.emptySample();
		s47.put("SepalLength", 4.6);
		s47.put("SepalWidth", 3.2);
		s47.put("PetalLength", 1.4);
		s47.put("PetalWidth", 0.2);
		Matrix input47 = Matrix.Factory.linkToArray(new double[] { 4.6, 3.2, 1.4, 0.2 })
				.transpose();
		s47.put(INPUT, input47);
		Matrix output47 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s47.put(TARGET, output47);
		s47.setLabel("Iris-setosa");
		s47.setId("iris-47");
		iris.add(s47);

		Sample s48 = Sample.Factory.emptySample();
		s48.put("SepalLength", 5.3);
		s48.put("SepalWidth", 3.7);
		s48.put("PetalLength", 1.5);
		s48.put("PetalWidth", 0.2);
		Matrix input48 = Matrix.Factory.linkToArray(new double[] { 5.3, 3.7, 1.5, 0.2 })
				.transpose();
		s48.put(INPUT, input48);
		Matrix output48 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s48.put(TARGET, output48);
		s48.setLabel("Iris-setosa");
		s48.setId("iris-48");
		iris.add(s48);

		Sample s49 = Sample.Factory.emptySample();
		s49.put("SepalLength", 5.0);
		s49.put("SepalWidth", 3.3);
		s49.put("PetalLength", 1.4);
		s49.put("PetalWidth", 0.2);
		Matrix input49 = Matrix.Factory.linkToArray(new double[] { 5.0, 3.3, 1.4, 0.2 })
				.transpose();
		s49.put(INPUT, input49);
		Matrix output49 = Matrix.Factory.linkToArray(new double[] { 1, 0, 0 }).transpose();
		s49.put(TARGET, output49);
		s49.setLabel("Iris-setosa");
		s49.setId("iris-49");
		iris.add(s49);

		Sample s50 = Sample.Factory.emptySample();
		s50.put("SepalLength", 7.0);
		s50.put("SepalWidth", 3.2);
		s50.put("PetalLength", 4.7);
		s50.put("PetalWidth", 1.4);
		Matrix input50 = Matrix.Factory.linkToArray(new double[] { 7.0, 3.2, 4.7, 1.4 })
				.transpose();
		s50.put(INPUT, input50);
		Matrix output50 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s50.put(TARGET, output50);
		s50.setLabel("Iris-versicolor");
		s50.setId("iris-50");
		iris.add(s50);

		Sample s51 = Sample.Factory.emptySample();
		s51.put("SepalLength", 6.4);
		s51.put("SepalWidth", 3.2);
		s51.put("PetalLength", 4.5);
		s51.put("PetalWidth", 1.5);
		Matrix input51 = Matrix.Factory.linkToArray(new double[] { 6.4, 3.2, 4.5, 1.5 })
				.transpose();
		s51.put(INPUT, input51);
		Matrix output51 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s51.put(TARGET, output51);
		s51.setLabel("Iris-versicolor");
		s51.setId("iris-51");
		iris.add(s51);

		Sample s52 = Sample.Factory.emptySample();
		s52.put("SepalLength", 6.9);
		s52.put("SepalWidth", 3.1);
		s52.put("PetalLength", 4.9);
		s52.put("PetalWidth", 1.5);
		Matrix input52 = Matrix.Factory.linkToArray(new double[] { 6.9, 3.1, 4.9, 1.5 })
				.transpose();
		s52.put(INPUT, input52);
		Matrix output52 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s52.put(TARGET, output52);
		s52.setLabel("Iris-versicolor");
		s52.setId("iris-52");
		iris.add(s52);

		Sample s53 = Sample.Factory.emptySample();
		s53.put("SepalLength", 5.5);
		s53.put("SepalWidth", 2.3);
		s53.put("PetalLength", 4.0);
		s53.put("PetalWidth", 1.3);
		Matrix input53 = Matrix.Factory.linkToArray(new double[] { 5.5, 2.3, 4.0, 1.3 })
				.transpose();
		s53.put(INPUT, input53);
		Matrix output53 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s53.put(TARGET, output53);
		s53.setLabel("Iris-versicolor");
		s53.setId("iris-53");
		iris.add(s53);

		Sample s54 = Sample.Factory.emptySample();
		s54.put("SepalLength", 6.5);
		s54.put("SepalWidth", 2.8);
		s54.put("PetalLength", 4.6);
		s54.put("PetalWidth", 1.5);
		Matrix input54 = Matrix.Factory.linkToArray(new double[] { 6.5, 2.8, 4.6, 1.5 })
				.transpose();
		s54.put(INPUT, input54);
		Matrix output54 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s54.put(TARGET, output54);
		s54.setLabel("Iris-versicolor");
		s54.setId("iris-54");
		iris.add(s54);

		Sample s55 = Sample.Factory.emptySample();
		s55.put("SepalLength", 5.7);
		s55.put("SepalWidth", 2.8);
		s55.put("PetalLength", 4.5);
		s55.put("PetalWidth", 1.3);
		Matrix input55 = Matrix.Factory.linkToArray(new double[] { 5.7, 2.8, 4.5, 1.3 })
				.transpose();
		s55.put(INPUT, input55);
		Matrix output55 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s55.put(TARGET, output55);
		s55.setLabel("Iris-versicolor");
		s55.setId("iris-55");
		iris.add(s55);

		Sample s56 = Sample.Factory.emptySample();
		s56.put("SepalLength", 6.3);
		s56.put("SepalWidth", 3.3);
		s56.put("PetalLength", 4.7);
		s56.put("PetalWidth", 1.6);
		Matrix input56 = Matrix.Factory.linkToArray(new double[] { 6.3, 3.3, 4.7, 1.6 })
				.transpose();
		s56.put(INPUT, input56);
		Matrix output56 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s56.put(TARGET, output56);
		s56.setLabel("Iris-versicolor");
		s56.setId("iris-56");
		iris.add(s56);

		Sample s57 = Sample.Factory.emptySample();
		s57.put("SepalLength", 4.9);
		s57.put("SepalWidth", 2.4);
		s57.put("PetalLength", 3.3);
		s57.put("PetalWidth", 1.0);
		Matrix input57 = Matrix.Factory.linkToArray(new double[] { 4.9, 2.4, 3.3, 1.0 })
				.transpose();
		s57.put(INPUT, input57);
		Matrix output57 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s57.put(TARGET, output57);
		s57.setLabel("Iris-versicolor");
		s57.setId("iris-57");
		iris.add(s57);

		Sample s58 = Sample.Factory.emptySample();
		s58.put("SepalLength", 6.6);
		s58.put("SepalWidth", 2.9);
		s58.put("PetalLength", 4.6);
		s58.put("PetalWidth", 1.3);
		Matrix input58 = Matrix.Factory.linkToArray(new double[] { 6.6, 2.9, 4.6, 1.3 })
				.transpose();
		s58.put(INPUT, input58);
		Matrix output58 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s58.put(TARGET, output58);
		s58.setLabel("Iris-versicolor");
		s58.setId("iris-58");
		iris.add(s58);

		Sample s59 = Sample.Factory.emptySample();
		s59.put("SepalLength", 5.2);
		s59.put("SepalWidth", 2.7);
		s59.put("PetalLength", 3.9);
		s59.put("PetalWidth", 1.4);
		Matrix input59 = Matrix.Factory.linkToArray(new double[] { 5.2, 2.7, 3.9, 1.4 })
				.transpose();
		s59.put(INPUT, input59);
		Matrix output59 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s59.put(TARGET, output59);
		s59.setLabel("Iris-versicolor");
		s59.setId("iris-59");
		iris.add(s59);

		Sample s60 = Sample.Factory.emptySample();
		s60.put("SepalLength", 5.0);
		s60.put("SepalWidth", 2.0);
		s60.put("PetalLength", 3.5);
		s60.put("PetalWidth", 1.0);
		Matrix input60 = Matrix.Factory.linkToArray(new double[] { 5.0, 2.0, 3.5, 1.0 })
				.transpose();
		s60.put(INPUT, input60);
		Matrix output60 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s60.put(TARGET, output60);
		s60.setLabel("Iris-versicolor");
		s60.setId("iris-60");
		iris.add(s60);

		Sample s61 = Sample.Factory.emptySample();
		s61.put("SepalLength", 5.9);
		s61.put("SepalWidth", 3.0);
		s61.put("PetalLength", 4.2);
		s61.put("PetalWidth", 1.5);
		Matrix input61 = Matrix.Factory.linkToArray(new double[] { 5.9, 3.0, 4.2, 1.5 })
				.transpose();
		s61.put(INPUT, input61);
		Matrix output61 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s61.put(TARGET, output61);
		s61.setLabel("Iris-versicolor");
		s61.setId("iris-61");
		iris.add(s61);

		Sample s62 = Sample.Factory.emptySample();
		s62.put("SepalLength", 6.0);
		s62.put("SepalWidth", 2.2);
		s62.put("PetalLength", 4.0);
		s62.put("PetalWidth", 1.0);
		Matrix input62 = Matrix.Factory.linkToArray(new double[] { 6.0, 2.2, 4.0, 1.0 })
				.transpose();
		s62.put(INPUT, input62);
		Matrix output62 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s62.put(TARGET, output62);
		s62.setLabel("Iris-versicolor");
		s62.setId("iris-62");
		iris.add(s62);

		Sample s63 = Sample.Factory.emptySample();
		s63.put("SepalLength", 6.1);
		s63.put("SepalWidth", 2.9);
		s63.put("PetalLength", 4.7);
		s63.put("PetalWidth", 1.4);
		Matrix input63 = Matrix.Factory.linkToArray(new double[] { 6.1, 2.9, 4.7, 1.4 })
				.transpose();
		s63.put(INPUT, input63);
		Matrix output63 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s63.put(TARGET, output63);
		s63.setLabel("Iris-versicolor");
		s63.setId("iris-63");
		iris.add(s63);

		Sample s64 = Sample.Factory.emptySample();
		s64.put("SepalLength", 5.6);
		s64.put("SepalWidth", 2.9);
		s64.put("PetalLength", 3.6);
		s64.put("PetalWidth", 1.3);
		Matrix input64 = Matrix.Factory.linkToArray(new double[] { 5.6, 2.9, 3.6, 1.3 })
				.transpose();
		s64.put(INPUT, input64);
		Matrix output64 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s64.put(TARGET, output64);
		s64.setLabel("Iris-versicolor");
		s64.setId("iris-64");
		iris.add(s64);

		Sample s65 = Sample.Factory.emptySample();
		s65.put("SepalLength", 6.7);
		s65.put("SepalWidth", 3.1);
		s65.put("PetalLength", 4.4);
		s65.put("PetalWidth", 1.4);
		Matrix input65 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.1, 4.4, 1.4 })
				.transpose();
		s65.put(INPUT, input65);
		Matrix output65 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s65.put(TARGET, output65);
		s65.setLabel("Iris-versicolor");
		s65.setId("iris-65");
		iris.add(s65);

		Sample s66 = Sample.Factory.emptySample();
		s66.put("SepalLength", 5.6);
		s66.put("SepalWidth", 3.0);
		s66.put("PetalLength", 4.5);
		s66.put("PetalWidth", 1.5);
		Matrix input66 = Matrix.Factory.linkToArray(new double[] { 5.6, 3.0, 4.5, 1.5 })
				.transpose();
		s66.put(INPUT, input66);
		Matrix output66 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s66.put(TARGET, output66);
		s66.setLabel("Iris-versicolor");
		s66.setId("iris-66");
		iris.add(s66);

		Sample s67 = Sample.Factory.emptySample();
		s67.put("SepalLength", 5.8);
		s67.put("SepalWidth", 2.7);
		s67.put("PetalLength", 4.1);
		s67.put("PetalWidth", 1.0);
		Matrix input67 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.7, 4.1, 1.0 })
				.transpose();
		s67.put(INPUT, input67);
		Matrix output67 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s67.put(TARGET, output67);
		s67.setLabel("Iris-versicolor");
		s67.setId("iris-67");
		iris.add(s67);

		Sample s68 = Sample.Factory.emptySample();
		s68.put("SepalLength", 6.2);
		s68.put("SepalWidth", 2.2);
		s68.put("PetalLength", 4.5);
		s68.put("PetalWidth", 1.5);
		Matrix input68 = Matrix.Factory.linkToArray(new double[] { 6.2, 2.2, 4.5, 1.5 })
				.transpose();
		s68.put(INPUT, input68);
		Matrix output68 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s68.put(TARGET, output68);
		s68.setLabel("Iris-versicolor");
		s68.setId("iris-68");
		iris.add(s68);

		Sample s69 = Sample.Factory.emptySample();
		s69.put("SepalLength", 5.6);
		s69.put("SepalWidth", 2.5);
		s69.put("PetalLength", 3.9);
		s69.put("PetalWidth", 1.1);
		Matrix input69 = Matrix.Factory.linkToArray(new double[] { 5.6, 2.5, 3.9, 1.1 })
				.transpose();
		s69.put(INPUT, input69);
		Matrix output69 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s69.put(TARGET, output69);
		s69.setLabel("Iris-versicolor");
		s69.setId("iris-69");
		iris.add(s69);

		Sample s70 = Sample.Factory.emptySample();
		s70.put("SepalLength", 5.9);
		s70.put("SepalWidth", 3.2);
		s70.put("PetalLength", 4.8);
		s70.put("PetalWidth", 1.8);
		Matrix input70 = Matrix.Factory.linkToArray(new double[] { 5.9, 3.2, 4.8, 1.8 })
				.transpose();
		s70.put(INPUT, input70);
		Matrix output70 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s70.put(TARGET, output70);
		s70.setLabel("Iris-versicolor");
		s70.setId("iris-70");
		iris.add(s70);

		Sample s71 = Sample.Factory.emptySample();
		s71.put("SepalLength", 6.1);
		s71.put("SepalWidth", 2.8);
		s71.put("PetalLength", 4.0);
		s71.put("PetalWidth", 1.3);
		Matrix input71 = Matrix.Factory.linkToArray(new double[] { 6.1, 2.8, 4.0, 1.3 })
				.transpose();
		s71.put(INPUT, input71);
		Matrix output71 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s71.put(TARGET, output71);
		s71.setLabel("Iris-versicolor");
		s71.setId("iris-71");
		iris.add(s71);

		Sample s72 = Sample.Factory.emptySample();
		s72.put("SepalLength", 6.3);
		s72.put("SepalWidth", 2.5);
		s72.put("PetalLength", 4.9);
		s72.put("PetalWidth", 1.5);
		Matrix input72 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.5, 4.9, 1.5 })
				.transpose();
		s72.put(INPUT, input72);
		Matrix output72 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s72.put(TARGET, output72);
		s72.setLabel("Iris-versicolor");
		s72.setId("iris-72");
		iris.add(s72);

		Sample s73 = Sample.Factory.emptySample();
		s73.put("SepalLength", 6.1);
		s73.put("SepalWidth", 2.8);
		s73.put("PetalLength", 4.7);
		s73.put("PetalWidth", 1.2);
		Matrix input73 = Matrix.Factory.linkToArray(new double[] { 6.1, 2.8, 4.7, 1.2 })
				.transpose();
		s73.put(INPUT, input73);
		Matrix output73 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s73.put(TARGET, output73);
		s73.setLabel("Iris-versicolor");
		s73.setId("iris-73");
		iris.add(s73);

		Sample s74 = Sample.Factory.emptySample();
		s74.put("SepalLength", 6.4);
		s74.put("SepalWidth", 2.9);
		s74.put("PetalLength", 4.3);
		s74.put("PetalWidth", 1.3);
		Matrix input74 = Matrix.Factory.linkToArray(new double[] { 6.4, 2.9, 4.3, 1.3 })
				.transpose();
		s74.put(INPUT, input74);
		Matrix output74 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s74.put(TARGET, output74);
		s74.setLabel("Iris-versicolor");
		s74.setId("iris-74");
		iris.add(s74);

		Sample s75 = Sample.Factory.emptySample();
		s75.put("SepalLength", 6.6);
		s75.put("SepalWidth", 3.0);
		s75.put("PetalLength", 4.4);
		s75.put("PetalWidth", 1.4);
		Matrix input75 = Matrix.Factory.linkToArray(new double[] { 6.6, 3.0, 4.4, 1.4 })
				.transpose();
		s75.put(INPUT, input75);
		Matrix output75 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s75.put(TARGET, output75);
		s75.setLabel("Iris-versicolor");
		s75.setId("iris-75");
		iris.add(s75);

		Sample s76 = Sample.Factory.emptySample();
		s76.put("SepalLength", 6.8);
		s76.put("SepalWidth", 2.8);
		s76.put("PetalLength", 4.8);
		s76.put("PetalWidth", 1.4);
		Matrix input76 = Matrix.Factory.linkToArray(new double[] { 6.8, 2.8, 4.8, 1.4 })
				.transpose();
		s76.put(INPUT, input76);
		Matrix output76 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s76.put(TARGET, output76);
		s76.setLabel("Iris-versicolor");
		s76.setId("iris-76");
		iris.add(s76);

		Sample s77 = Sample.Factory.emptySample();
		s77.put("SepalLength", 6.7);
		s77.put("SepalWidth", 3.0);
		s77.put("PetalLength", 5.0);
		s77.put("PetalWidth", 1.7);
		Matrix input77 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.0, 5.0, 1.7 })
				.transpose();
		s77.put(INPUT, input77);
		Matrix output77 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s77.put(TARGET, output77);
		s77.setLabel("Iris-versicolor");
		s77.setId("iris-77");
		iris.add(s77);

		Sample s78 = Sample.Factory.emptySample();
		s78.put("SepalLength", 6.0);
		s78.put("SepalWidth", 2.9);
		s78.put("PetalLength", 4.5);
		s78.put("PetalWidth", 1.5);
		Matrix input78 = Matrix.Factory.linkToArray(new double[] { 6.0, 2.9, 4.5, 1.5 })
				.transpose();
		s78.put(INPUT, input78);
		Matrix output78 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s78.put(TARGET, output78);
		s78.setLabel("Iris-versicolor");
		s78.setId("iris-78");
		iris.add(s78);

		Sample s79 = Sample.Factory.emptySample();
		s79.put("SepalLength", 5.7);
		s79.put("SepalWidth", 2.6);
		s79.put("PetalLength", 3.5);
		s79.put("PetalWidth", 1.0);
		Matrix input79 = Matrix.Factory.linkToArray(new double[] { 5.7, 2.6, 3.5, 1.0 })
				.transpose();
		s79.put(INPUT, input79);
		Matrix output79 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s79.put(TARGET, output79);
		s79.setLabel("Iris-versicolor");
		s79.setId("iris-79");
		iris.add(s79);

		Sample s80 = Sample.Factory.emptySample();
		s80.put("SepalLength", 5.5);
		s80.put("SepalWidth", 2.4);
		s80.put("PetalLength", 3.8);
		s80.put("PetalWidth", 1.1);
		Matrix input80 = Matrix.Factory.linkToArray(new double[] { 5.5, 2.4, 3.8, 1.1 })
				.transpose();
		s80.put(INPUT, input80);
		Matrix output80 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s80.put(TARGET, output80);
		s80.setLabel("Iris-versicolor");
		s80.setId("iris-80");
		iris.add(s80);

		Sample s81 = Sample.Factory.emptySample();
		s81.put("SepalLength", 5.5);
		s81.put("SepalWidth", 2.4);
		s81.put("PetalLength", 3.7);
		s81.put("PetalWidth", 1.0);
		Matrix input81 = Matrix.Factory.linkToArray(new double[] { 5.5, 2.4, 3.7, 1.0 })
				.transpose();
		s81.put(INPUT, input81);
		Matrix output81 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s81.put(TARGET, output81);
		s81.setLabel("Iris-versicolor");
		s81.setId("iris-81");
		iris.add(s81);

		Sample s82 = Sample.Factory.emptySample();
		s82.put("SepalLength", 5.8);
		s82.put("SepalWidth", 2.7);
		s82.put("PetalLength", 3.9);
		s82.put("PetalWidth", 1.2);
		Matrix input82 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.7, 3.9, 1.2 })
				.transpose();
		s82.put(INPUT, input82);
		Matrix output82 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s82.put(TARGET, output82);
		s82.setLabel("Iris-versicolor");
		s82.setId("iris-82");
		iris.add(s82);

		Sample s83 = Sample.Factory.emptySample();
		s83.put("SepalLength", 6.0);
		s83.put("SepalWidth", 2.7);
		s83.put("PetalLength", 5.1);
		s83.put("PetalWidth", 1.6);
		Matrix input83 = Matrix.Factory.linkToArray(new double[] { 6.0, 2.7, 5.1, 1.6 })
				.transpose();
		s83.put(INPUT, input83);
		Matrix output83 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s83.put(TARGET, output83);
		s83.setLabel("Iris-versicolor");
		s83.setId("iris-83");
		iris.add(s83);

		Sample s84 = Sample.Factory.emptySample();
		s84.put("SepalLength", 5.4);
		s84.put("SepalWidth", 3.0);
		s84.put("PetalLength", 4.5);
		s84.put("PetalWidth", 1.5);
		Matrix input84 = Matrix.Factory.linkToArray(new double[] { 5.4, 3.0, 4.5, 1.5 })
				.transpose();
		s84.put(INPUT, input84);
		Matrix output84 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s84.put(TARGET, output84);
		s84.setLabel("Iris-versicolor");
		s84.setId("iris-84");
		iris.add(s84);

		Sample s85 = Sample.Factory.emptySample();
		s85.put("SepalLength", 6.0);
		s85.put("SepalWidth", 3.4);
		s85.put("PetalLength", 4.5);
		s85.put("PetalWidth", 1.6);
		Matrix input85 = Matrix.Factory.linkToArray(new double[] { 6.0, 3.4, 4.5, 1.6 })
				.transpose();
		s85.put(INPUT, input85);
		Matrix output85 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s85.put(TARGET, output85);
		s85.setLabel("Iris-versicolor");
		s85.setId("iris-85");
		iris.add(s85);

		Sample s86 = Sample.Factory.emptySample();
		s86.put("SepalLength", 6.7);
		s86.put("SepalWidth", 3.1);
		s86.put("PetalLength", 4.7);
		s86.put("PetalWidth", 1.5);
		Matrix input86 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.1, 4.7, 1.5 })
				.transpose();
		s86.put(INPUT, input86);
		Matrix output86 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s86.put(TARGET, output86);
		s86.setLabel("Iris-versicolor");
		s86.setId("iris-86");
		iris.add(s86);

		Sample s87 = Sample.Factory.emptySample();
		s87.put("SepalLength", 6.3);
		s87.put("SepalWidth", 2.3);
		s87.put("PetalLength", 4.4);
		s87.put("PetalWidth", 1.3);
		Matrix input87 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.3, 4.4, 1.3 })
				.transpose();
		s87.put(INPUT, input87);
		Matrix output87 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s87.put(TARGET, output87);
		s87.setLabel("Iris-versicolor");
		s87.setId("iris-87");
		iris.add(s87);

		Sample s88 = Sample.Factory.emptySample();
		s88.put("SepalLength", 5.6);
		s88.put("SepalWidth", 3.0);
		s88.put("PetalLength", 4.1);
		s88.put("PetalWidth", 1.3);
		Matrix input88 = Matrix.Factory.linkToArray(new double[] { 5.6, 3.0, 4.1, 1.3 })
				.transpose();
		s88.put(INPUT, input88);
		Matrix output88 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s88.put(TARGET, output88);
		s88.setLabel("Iris-versicolor");
		s88.setId("iris-88");
		iris.add(s88);

		Sample s89 = Sample.Factory.emptySample();
		s89.put("SepalLength", 5.5);
		s89.put("SepalWidth", 2.5);
		s89.put("PetalLength", 4.0);
		s89.put("PetalWidth", 1.3);
		Matrix input89 = Matrix.Factory.linkToArray(new double[] { 5.5, 2.5, 4.0, 1.3 })
				.transpose();
		s89.put(INPUT, input89);
		Matrix output89 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s89.put(TARGET, output89);
		s89.setLabel("Iris-versicolor");
		s89.setId("iris-89");
		iris.add(s89);

		Sample s90 = Sample.Factory.emptySample();
		s90.put("SepalLength", 5.5);
		s90.put("SepalWidth", 2.6);
		s90.put("PetalLength", 4.4);
		s90.put("PetalWidth", 1.2);
		Matrix input90 = Matrix.Factory.linkToArray(new double[] { 5.5, 2.6, 4.4, 1.2 })
				.transpose();
		s90.put(INPUT, input90);
		Matrix output90 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s90.put(TARGET, output90);
		s90.setLabel("Iris-versicolor");
		s90.setId("iris-90");
		iris.add(s90);

		Sample s91 = Sample.Factory.emptySample();
		s91.put("SepalLength", 6.1);
		s91.put("SepalWidth", 3.0);
		s91.put("PetalLength", 4.6);
		s91.put("PetalWidth", 1.4);
		Matrix input91 = Matrix.Factory.linkToArray(new double[] { 6.1, 3.0, 4.6, 1.4 })
				.transpose();
		s91.put(INPUT, input91);
		Matrix output91 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s91.put(TARGET, output91);
		s91.setLabel("Iris-versicolor");
		s91.setId("iris-91");
		iris.add(s91);

		Sample s92 = Sample.Factory.emptySample();
		s92.put("SepalLength", 5.8);
		s92.put("SepalWidth", 2.6);
		s92.put("PetalLength", 4.0);
		s92.put("PetalWidth", 1.2);
		Matrix input92 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.6, 4.0, 1.2 })
				.transpose();
		s92.put(INPUT, input92);
		Matrix output92 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s92.put(TARGET, output92);
		s92.setLabel("Iris-versicolor");
		s92.setId("iris-92");
		iris.add(s92);

		Sample s93 = Sample.Factory.emptySample();
		s93.put("SepalLength", 5.0);
		s93.put("SepalWidth", 2.3);
		s93.put("PetalLength", 3.3);
		s93.put("PetalWidth", 1.0);
		Matrix input93 = Matrix.Factory.linkToArray(new double[] { 5.0, 2.3, 3.3, 1.0 })
				.transpose();
		s93.put(INPUT, input93);
		Matrix output93 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s93.put(TARGET, output93);
		s93.setLabel("Iris-versicolor");
		s93.setId("iris-93");
		iris.add(s93);

		Sample s94 = Sample.Factory.emptySample();
		s94.put("SepalLength", 5.6);
		s94.put("SepalWidth", 2.7);
		s94.put("PetalLength", 4.2);
		s94.put("PetalWidth", 1.3);
		Matrix input94 = Matrix.Factory.linkToArray(new double[] { 5.6, 2.7, 4.2, 1.3 })
				.transpose();
		s94.put(INPUT, input94);
		Matrix output94 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s94.put(TARGET, output94);
		s94.setLabel("Iris-versicolor");
		s94.setId("iris-94");
		iris.add(s94);

		Sample s95 = Sample.Factory.emptySample();
		s95.put("SepalLength", 5.7);
		s95.put("SepalWidth", 3.0);
		s95.put("PetalLength", 4.2);
		s95.put("PetalWidth", 1.2);
		Matrix input95 = Matrix.Factory.linkToArray(new double[] { 5.7, 3.0, 4.2, 1.2 })
				.transpose();
		s95.put(INPUT, input95);
		Matrix output95 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s95.put(TARGET, output95);
		s95.setLabel("Iris-versicolor");
		s95.setId("iris-95");
		iris.add(s95);

		Sample s96 = Sample.Factory.emptySample();
		s96.put("SepalLength", 5.7);
		s96.put("SepalWidth", 2.9);
		s96.put("PetalLength", 4.2);
		s96.put("PetalWidth", 1.3);
		Matrix input96 = Matrix.Factory.linkToArray(new double[] { 5.7, 2.9, 4.2, 1.3 })
				.transpose();
		s96.put(INPUT, input96);
		Matrix output96 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s96.put(TARGET, output96);
		s96.setLabel("Iris-versicolor");
		s96.setId("iris-96");
		iris.add(s96);

		Sample s97 = Sample.Factory.emptySample();
		s97.put("SepalLength", 6.2);
		s97.put("SepalWidth", 2.9);
		s97.put("PetalLength", 4.3);
		s97.put("PetalWidth", 1.3);
		Matrix input97 = Matrix.Factory.linkToArray(new double[] { 6.2, 2.9, 4.3, 1.3 })
				.transpose();
		s97.put(INPUT, input97);
		Matrix output97 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s97.put(TARGET, output97);
		s97.setLabel("Iris-versicolor");
		s97.setId("iris-97");
		iris.add(s97);

		Sample s98 = Sample.Factory.emptySample();
		s98.put("SepalLength", 5.1);
		s98.put("SepalWidth", 2.5);
		s98.put("PetalLength", 3.0);
		s98.put("PetalWidth", 1.1);
		Matrix input98 = Matrix.Factory.linkToArray(new double[] { 5.1, 2.5, 3.0, 1.1 })
				.transpose();
		s98.put(INPUT, input98);
		Matrix output98 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s98.put(TARGET, output98);
		s98.setLabel("Iris-versicolor");
		s98.setId("iris-98");
		iris.add(s98);

		Sample s99 = Sample.Factory.emptySample();
		s99.put("SepalLength", 5.7);
		s99.put("SepalWidth", 2.8);
		s99.put("PetalLength", 4.1);
		s99.put("PetalWidth", 1.3);
		Matrix input99 = Matrix.Factory.linkToArray(new double[] { 5.7, 2.8, 4.1, 1.3 })
				.transpose();
		s99.put(INPUT, input99);
		Matrix output99 = Matrix.Factory.linkToArray(new double[] { 0, 1, 0 }).transpose();
		s99.put(TARGET, output99);
		s99.setLabel("Iris-versicolor");
		s99.setId("iris-99");
		iris.add(s99);

		Sample s100 = Sample.Factory.emptySample();
		s100.put("SepalLength", 6.3);
		s100.put("SepalWidth", 3.3);
		s100.put("PetalLength", 6.0);
		s100.put("PetalWidth", 2.5);
		Matrix input100 = Matrix.Factory.linkToArray(new double[] { 6.3, 3.3, 6.0, 2.5 })
				.transpose();
		s100.put(INPUT, input100);
		Matrix output100 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s100.put(TARGET, output100);
		s100.setLabel("Iris-virginica");
		s100.setId("iris-100");
		iris.add(s100);

		Sample s101 = Sample.Factory.emptySample();
		s101.put("SepalLength", 5.8);
		s101.put("SepalWidth", 2.7);
		s101.put("PetalLength", 5.1);
		s101.put("PetalWidth", 1.9);
		Matrix input101 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.7, 5.1, 1.9 })
				.transpose();
		s101.put(INPUT, input101);
		Matrix output101 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s101.put(TARGET, output101);
		s101.setLabel("Iris-virginica");
		s101.setId("iris-101");
		iris.add(s101);

		Sample s102 = Sample.Factory.emptySample();
		s102.put("SepalLength", 7.1);
		s102.put("SepalWidth", 3.0);
		s102.put("PetalLength", 5.9);
		s102.put("PetalWidth", 2.1);
		Matrix input102 = Matrix.Factory.linkToArray(new double[] { 7.1, 3.0, 5.9, 2.1 })
				.transpose();
		s102.put(INPUT, input102);
		Matrix output102 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s102.put(TARGET, output102);
		s102.setLabel("Iris-virginica");
		s102.setId("iris-102");
		iris.add(s102);

		Sample s103 = Sample.Factory.emptySample();
		s103.put("SepalLength", 6.3);
		s103.put("SepalWidth", 2.9);
		s103.put("PetalLength", 5.6);
		s103.put("PetalWidth", 1.8);
		Matrix input103 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.9, 5.6, 1.8 })
				.transpose();
		s103.put(INPUT, input103);
		Matrix output103 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s103.put(TARGET, output103);
		s103.setLabel("Iris-virginica");
		s103.setId("iris-103");
		iris.add(s103);

		Sample s104 = Sample.Factory.emptySample();
		s104.put("SepalLength", 6.5);
		s104.put("SepalWidth", 3.0);
		s104.put("PetalLength", 5.8);
		s104.put("PetalWidth", 2.2);
		Matrix input104 = Matrix.Factory.linkToArray(new double[] { 6.5, 3.0, 5.8, 2.2 })
				.transpose();
		s104.put(INPUT, input104);
		Matrix output104 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s104.put(TARGET, output104);
		s104.setLabel("Iris-virginica");
		s104.setId("iris-104");
		iris.add(s104);

		Sample s105 = Sample.Factory.emptySample();
		s105.put("SepalLength", 7.6);
		s105.put("SepalWidth", 3.0);
		s105.put("PetalLength", 6.6);
		s105.put("PetalWidth", 2.1);
		Matrix input105 = Matrix.Factory.linkToArray(new double[] { 7.6, 3.0, 6.6, 2.1 })
				.transpose();
		s105.put(INPUT, input105);
		Matrix output105 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s105.put(TARGET, output105);
		s105.setLabel("Iris-virginica");
		s105.setId("iris-105");
		iris.add(s105);

		Sample s106 = Sample.Factory.emptySample();
		s106.put("SepalLength", 4.9);
		s106.put("SepalWidth", 2.5);
		s106.put("PetalLength", 4.5);
		s106.put("PetalWidth", 1.7);
		Matrix input106 = Matrix.Factory.linkToArray(new double[] { 4.9, 2.5, 4.5, 1.7 })
				.transpose();
		s106.put(INPUT, input106);
		Matrix output106 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s106.put(TARGET, output106);
		s106.setLabel("Iris-virginica");
		s106.setId("iris-106");
		iris.add(s106);

		Sample s107 = Sample.Factory.emptySample();
		s107.put("SepalLength", 7.3);
		s107.put("SepalWidth", 2.9);
		s107.put("PetalLength", 6.3);
		s107.put("PetalWidth", 1.8);
		Matrix input107 = Matrix.Factory.linkToArray(new double[] { 7.3, 2.9, 6.3, 1.8 })
				.transpose();
		s107.put(INPUT, input107);
		Matrix output107 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s107.put(TARGET, output107);
		s107.setLabel("Iris-virginica");
		s107.setId("iris-107");
		iris.add(s107);

		Sample s108 = Sample.Factory.emptySample();
		s108.put("SepalLength", 6.7);
		s108.put("SepalWidth", 2.5);
		s108.put("PetalLength", 5.8);
		s108.put("PetalWidth", 1.8);
		Matrix input108 = Matrix.Factory.linkToArray(new double[] { 6.7, 2.5, 5.8, 1.8 })
				.transpose();
		s108.put(INPUT, input108);
		Matrix output108 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s108.put(TARGET, output108);
		s108.setLabel("Iris-virginica");
		s108.setId("iris-108");
		iris.add(s108);

		Sample s109 = Sample.Factory.emptySample();
		s109.put("SepalLength", 7.2);
		s109.put("SepalWidth", 3.6);
		s109.put("PetalLength", 6.1);
		s109.put("PetalWidth", 2.5);
		Matrix input109 = Matrix.Factory.linkToArray(new double[] { 7.2, 3.6, 6.1, 2.5 })
				.transpose();
		s109.put(INPUT, input109);
		Matrix output109 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s109.put(TARGET, output109);
		s109.setLabel("Iris-virginica");
		s109.setId("iris-109");
		iris.add(s109);

		Sample s110 = Sample.Factory.emptySample();
		s110.put("SepalLength", 6.5);
		s110.put("SepalWidth", 3.2);
		s110.put("PetalLength", 5.1);
		s110.put("PetalWidth", 2.0);
		Matrix input110 = Matrix.Factory.linkToArray(new double[] { 6.5, 3.2, 5.1, 2.0 })
				.transpose();
		s110.put(INPUT, input110);
		Matrix output110 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s110.put(TARGET, output110);
		s110.setLabel("Iris-virginica");
		s110.setId("iris-110");
		iris.add(s110);

		Sample s111 = Sample.Factory.emptySample();
		s111.put("SepalLength", 6.4);
		s111.put("SepalWidth", 2.7);
		s111.put("PetalLength", 5.3);
		s111.put("PetalWidth", 1.9);
		Matrix input111 = Matrix.Factory.linkToArray(new double[] { 6.4, 2.7, 5.3, 1.9 })
				.transpose();
		s111.put(INPUT, input111);
		Matrix output111 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s111.put(TARGET, output111);
		s111.setLabel("Iris-virginica");
		s111.setId("iris-111");
		iris.add(s111);

		Sample s112 = Sample.Factory.emptySample();
		s112.put("SepalLength", 6.8);
		s112.put("SepalWidth", 3.0);
		s112.put("PetalLength", 5.5);
		s112.put("PetalWidth", 2.1);
		Matrix input112 = Matrix.Factory.linkToArray(new double[] { 6.8, 3.0, 5.5, 2.1 })
				.transpose();
		s112.put(INPUT, input112);
		Matrix output112 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s112.put(TARGET, output112);
		s112.setLabel("Iris-virginica");
		s112.setId("iris-112");
		iris.add(s112);

		Sample s113 = Sample.Factory.emptySample();
		s113.put("SepalLength", 5.7);
		s113.put("SepalWidth", 2.5);
		s113.put("PetalLength", 5.0);
		s113.put("PetalWidth", 2.0);
		Matrix input113 = Matrix.Factory.linkToArray(new double[] { 5.7, 2.5, 5.0, 2.0 })
				.transpose();
		s113.put(INPUT, input113);
		Matrix output113 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s113.put(TARGET, output113);
		s113.setLabel("Iris-virginica");
		s113.setId("iris-113");
		iris.add(s113);

		Sample s114 = Sample.Factory.emptySample();
		s114.put("SepalLength", 5.8);
		s114.put("SepalWidth", 2.8);
		s114.put("PetalLength", 5.1);
		s114.put("PetalWidth", 2.4);
		Matrix input114 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.8, 5.1, 2.4 })
				.transpose();
		s114.put(INPUT, input114);
		Matrix output114 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s114.put(TARGET, output114);
		s114.setLabel("Iris-virginica");
		s114.setId("iris-114");
		iris.add(s114);

		Sample s115 = Sample.Factory.emptySample();
		s115.put("SepalLength", 6.4);
		s115.put("SepalWidth", 3.2);
		s115.put("PetalLength", 5.3);
		s115.put("PetalWidth", 2.3);
		Matrix input115 = Matrix.Factory.linkToArray(new double[] { 6.4, 3.2, 5.3, 2.3 })
				.transpose();
		s115.put(INPUT, input115);
		Matrix output115 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s115.put(TARGET, output115);
		s115.setLabel("Iris-virginica");
		s115.setId("iris-115");
		iris.add(s115);

		Sample s116 = Sample.Factory.emptySample();
		s116.put("SepalLength", 6.5);
		s116.put("SepalWidth", 3.0);
		s116.put("PetalLength", 5.5);
		s116.put("PetalWidth", 1.8);
		Matrix input116 = Matrix.Factory.linkToArray(new double[] { 6.5, 3.0, 5.5, 1.8 })
				.transpose();
		s116.put(INPUT, input116);
		Matrix output116 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s116.put(TARGET, output116);
		s116.setLabel("Iris-virginica");
		s116.setId("iris-116");
		iris.add(s116);

		Sample s117 = Sample.Factory.emptySample();
		s117.put("SepalLength", 7.7);
		s117.put("SepalWidth", 3.8);
		s117.put("PetalLength", 6.7);
		s117.put("PetalWidth", 2.2);
		Matrix input117 = Matrix.Factory.linkToArray(new double[] { 7.7, 3.8, 6.7, 2.2 })
				.transpose();
		s117.put(INPUT, input117);
		Matrix output117 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s117.put(TARGET, output117);
		s117.setLabel("Iris-virginica");
		s117.setId("iris-117");
		iris.add(s117);

		Sample s118 = Sample.Factory.emptySample();
		s118.put("SepalLength", 7.7);
		s118.put("SepalWidth", 2.6);
		s118.put("PetalLength", 6.9);
		s118.put("PetalWidth", 2.3);
		Matrix input118 = Matrix.Factory.linkToArray(new double[] { 7.7, 2.6, 6.9, 2.3 })
				.transpose();
		s118.put(INPUT, input118);
		Matrix output118 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s118.put(TARGET, output118);
		s118.setLabel("Iris-virginica");
		s118.setId("iris-118");
		iris.add(s118);

		Sample s119 = Sample.Factory.emptySample();
		s119.put("SepalLength", 6.0);
		s119.put("SepalWidth", 2.2);
		s119.put("PetalLength", 5.0);
		s119.put("PetalWidth", 1.5);
		Matrix input119 = Matrix.Factory.linkToArray(new double[] { 6.0, 2.2, 5.0, 1.5 })
				.transpose();
		s119.put(INPUT, input119);
		Matrix output119 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s119.put(TARGET, output119);
		s119.setLabel("Iris-virginica");
		s119.setId("iris-119");
		iris.add(s119);

		Sample s120 = Sample.Factory.emptySample();
		s120.put("SepalLength", 6.9);
		s120.put("SepalWidth", 3.2);
		s120.put("PetalLength", 5.7);
		s120.put("PetalWidth", 2.3);
		Matrix input120 = Matrix.Factory.linkToArray(new double[] { 6.9, 3.2, 5.7, 2.3 })
				.transpose();
		s120.put(INPUT, input120);
		Matrix output120 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s120.put(TARGET, output120);
		s120.setLabel("Iris-virginica");
		s120.setId("iris-120");
		iris.add(s120);

		Sample s121 = Sample.Factory.emptySample();
		s121.put("SepalLength", 5.6);
		s121.put("SepalWidth", 2.8);
		s121.put("PetalLength", 4.9);
		s121.put("PetalWidth", 2.0);
		Matrix input121 = Matrix.Factory.linkToArray(new double[] { 5.6, 2.8, 4.9, 2.0 })
				.transpose();
		s121.put(INPUT, input121);
		Matrix output121 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s121.put(TARGET, output121);
		s121.setLabel("Iris-virginica");
		s121.setId("iris-121");
		iris.add(s121);

		Sample s122 = Sample.Factory.emptySample();
		s122.put("SepalLength", 7.7);
		s122.put("SepalWidth", 2.8);
		s122.put("PetalLength", 6.7);
		s122.put("PetalWidth", 2.0);
		Matrix input122 = Matrix.Factory.linkToArray(new double[] { 7.7, 2.8, 6.7, 2.0 })
				.transpose();
		s122.put(INPUT, input122);
		Matrix output122 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s122.put(TARGET, output122);
		s122.setLabel("Iris-virginica");
		s122.setId("iris-122");
		iris.add(s122);

		Sample s123 = Sample.Factory.emptySample();
		s123.put("SepalLength", 6.3);
		s123.put("SepalWidth", 2.7);
		s123.put("PetalLength", 4.9);
		s123.put("PetalWidth", 1.8);
		Matrix input123 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.7, 4.9, 1.8 })
				.transpose();
		s123.put(INPUT, input123);
		Matrix output123 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s123.put(TARGET, output123);
		s123.setLabel("Iris-virginica");
		s123.setId("iris-123");
		iris.add(s123);

		Sample s124 = Sample.Factory.emptySample();
		s124.put("SepalLength", 6.7);
		s124.put("SepalWidth", 3.3);
		s124.put("PetalLength", 5.7);
		s124.put("PetalWidth", 2.1);
		Matrix input124 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.3, 5.7, 2.1 })
				.transpose();
		s124.put(INPUT, input124);
		Matrix output124 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s124.put(TARGET, output124);
		s124.setLabel("Iris-virginica");
		s124.setId("iris-124");
		iris.add(s124);

		Sample s125 = Sample.Factory.emptySample();
		s125.put("SepalLength", 7.2);
		s125.put("SepalWidth", 3.2);
		s125.put("PetalLength", 6.0);
		s125.put("PetalWidth", 1.8);
		Matrix input125 = Matrix.Factory.linkToArray(new double[] { 7.2, 3.2, 6.0, 1.8 })
				.transpose();
		s125.put(INPUT, input125);
		Matrix output125 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s125.put(TARGET, output125);
		s125.setLabel("Iris-virginica");
		s125.setId("iris-125");
		iris.add(s125);

		Sample s126 = Sample.Factory.emptySample();
		s126.put("SepalLength", 6.2);
		s126.put("SepalWidth", 2.8);
		s126.put("PetalLength", 4.8);
		s126.put("PetalWidth", 1.8);
		Matrix input126 = Matrix.Factory.linkToArray(new double[] { 6.2, 2.8, 4.8, 1.8 })
				.transpose();
		s126.put(INPUT, input126);
		Matrix output126 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s126.put(TARGET, output126);
		s126.setLabel("Iris-virginica");
		s126.setId("iris-126");
		iris.add(s126);

		Sample s127 = Sample.Factory.emptySample();
		s127.put("SepalLength", 6.1);
		s127.put("SepalWidth", 3.0);
		s127.put("PetalLength", 4.9);
		s127.put("PetalWidth", 1.8);
		Matrix input127 = Matrix.Factory.linkToArray(new double[] { 6.1, 3.0, 4.9, 1.8 })
				.transpose();
		s127.put(INPUT, input127);
		Matrix output127 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s127.put(TARGET, output127);
		s127.setLabel("Iris-virginica");
		s127.setId("iris-127");
		iris.add(s127);

		Sample s128 = Sample.Factory.emptySample();
		s128.put("SepalLength", 6.4);
		s128.put("SepalWidth", 2.8);
		s128.put("PetalLength", 5.6);
		s128.put("PetalWidth", 2.1);
		Matrix input128 = Matrix.Factory.linkToArray(new double[] { 6.4, 2.8, 5.6, 2.1 })
				.transpose();
		s128.put(INPUT, input128);
		Matrix output128 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s128.put(TARGET, output128);
		s128.setLabel("Iris-virginica");
		s128.setId("iris-128");
		iris.add(s128);

		Sample s129 = Sample.Factory.emptySample();
		s129.put("SepalLength", 7.2);
		s129.put("SepalWidth", 3.0);
		s129.put("PetalLength", 5.8);
		s129.put("PetalWidth", 1.6);
		Matrix input129 = Matrix.Factory.linkToArray(new double[] { 7.2, 3.0, 5.8, 1.6 })
				.transpose();
		s129.put(INPUT, input129);
		Matrix output129 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s129.put(TARGET, output129);
		s129.setLabel("Iris-virginica");
		s129.setId("iris-129");
		iris.add(s129);

		Sample s130 = Sample.Factory.emptySample();
		s130.put("SepalLength", 7.4);
		s130.put("SepalWidth", 2.8);
		s130.put("PetalLength", 6.1);
		s130.put("PetalWidth", 1.9);
		Matrix input130 = Matrix.Factory.linkToArray(new double[] { 7.4, 2.8, 6.1, 1.9 })
				.transpose();
		s130.put(INPUT, input130);
		Matrix output130 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s130.put(TARGET, output130);
		s130.setLabel("Iris-virginica");
		s130.setId("iris-130");
		iris.add(s130);

		Sample s131 = Sample.Factory.emptySample();
		s131.put("SepalLength", 7.9);
		s131.put("SepalWidth", 3.8);
		s131.put("PetalLength", 6.4);
		s131.put("PetalWidth", 2.0);
		Matrix input131 = Matrix.Factory.linkToArray(new double[] { 7.9, 3.8, 6.4, 2.0 })
				.transpose();
		s131.put(INPUT, input131);
		Matrix output131 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s131.put(TARGET, output131);
		s131.setLabel("Iris-virginica");
		s131.setId("iris-131");
		iris.add(s131);

		Sample s132 = Sample.Factory.emptySample();
		s132.put("SepalLength", 6.4);
		s132.put("SepalWidth", 2.8);
		s132.put("PetalLength", 5.6);
		s132.put("PetalWidth", 2.2);
		Matrix input132 = Matrix.Factory.linkToArray(new double[] { 6.4, 2.8, 5.6, 2.2 })
				.transpose();
		s132.put(INPUT, input132);
		Matrix output132 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s132.put(TARGET, output132);
		s132.setLabel("Iris-virginica");
		s132.setId("iris-132");
		iris.add(s132);

		Sample s133 = Sample.Factory.emptySample();
		s133.put("SepalLength", 6.3);
		s133.put("SepalWidth", 2.8);
		s133.put("PetalLength", 5.1);
		s133.put("PetalWidth", 1.5);
		Matrix input133 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.8, 5.1, 1.5 })
				.transpose();
		s133.put(INPUT, input133);
		Matrix output133 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s133.put(TARGET, output133);
		s133.setLabel("Iris-virginica");
		s133.setId("iris-133");
		iris.add(s133);

		Sample s134 = Sample.Factory.emptySample();
		s134.put("SepalLength", 6.1);
		s134.put("SepalWidth", 2.6);
		s134.put("PetalLength", 5.6);
		s134.put("PetalWidth", 1.4);
		Matrix input134 = Matrix.Factory.linkToArray(new double[] { 6.1, 2.6, 5.6, 1.4 })
				.transpose();
		s134.put(INPUT, input134);
		Matrix output134 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s134.put(TARGET, output134);
		s134.setLabel("Iris-virginica");
		s134.setId("iris-134");
		iris.add(s134);

		Sample s135 = Sample.Factory.emptySample();
		s135.put("SepalLength", 7.7);
		s135.put("SepalWidth", 3.0);
		s135.put("PetalLength", 6.1);
		s135.put("PetalWidth", 2.3);
		Matrix input135 = Matrix.Factory.linkToArray(new double[] { 7.7, 3.0, 6.1, 2.3 })
				.transpose();
		s135.put(INPUT, input135);
		Matrix output135 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s135.put(TARGET, output135);
		s135.setLabel("Iris-virginica");
		s135.setId("iris-135");
		iris.add(s135);

		Sample s136 = Sample.Factory.emptySample();
		s136.put("SepalLength", 6.3);
		s136.put("SepalWidth", 3.4);
		s136.put("PetalLength", 5.6);
		s136.put("PetalWidth", 2.4);
		Matrix input136 = Matrix.Factory.linkToArray(new double[] { 6.3, 3.4, 5.6, 2.4 })
				.transpose();
		s136.put(INPUT, input136);
		Matrix output136 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s136.put(TARGET, output136);
		s136.setLabel("Iris-virginica");
		s136.setId("iris-136");
		iris.add(s136);

		Sample s137 = Sample.Factory.emptySample();
		s137.put("SepalLength", 6.4);
		s137.put("SepalWidth", 3.1);
		s137.put("PetalLength", 5.5);
		s137.put("PetalWidth", 1.8);
		Matrix input137 = Matrix.Factory.linkToArray(new double[] { 6.4, 3.1, 5.5, 1.8 })
				.transpose();
		s137.put(INPUT, input137);
		Matrix output137 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s137.put(TARGET, output137);
		s137.setLabel("Iris-virginica");
		s137.setId("iris-137");
		iris.add(s137);

		Sample s138 = Sample.Factory.emptySample();
		s138.put("SepalLength", 6.0);
		s138.put("SepalWidth", 3.0);
		s138.put("PetalLength", 4.8);
		s138.put("PetalWidth", 1.8);
		Matrix input138 = Matrix.Factory.linkToArray(new double[] { 6.0, 3.0, 4.8, 1.8 })
				.transpose();
		s138.put(INPUT, input138);
		Matrix output138 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s138.put(TARGET, output138);
		s138.setLabel("Iris-virginica");
		s138.setId("iris-138");
		iris.add(s138);

		Sample s139 = Sample.Factory.emptySample();
		s139.put("SepalLength", 6.9);
		s139.put("SepalWidth", 3.1);
		s139.put("PetalLength", 5.4);
		s139.put("PetalWidth", 2.1);
		Matrix input139 = Matrix.Factory.linkToArray(new double[] { 6.9, 3.1, 5.4, 2.1 })
				.transpose();
		s139.put(INPUT, input139);
		Matrix output139 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s139.put(TARGET, output139);
		s139.setLabel("Iris-virginica");
		s139.setId("iris-139");
		iris.add(s139);

		Sample s140 = Sample.Factory.emptySample();
		s140.put("SepalLength", 6.7);
		s140.put("SepalWidth", 3.1);
		s140.put("PetalLength", 5.6);
		s140.put("PetalWidth", 2.4);
		Matrix input140 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.1, 5.6, 2.4 })
				.transpose();
		s140.put(INPUT, input140);
		Matrix output140 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s140.put(TARGET, output140);
		s140.setLabel("Iris-virginica");
		s140.setId("iris-140");
		iris.add(s140);

		Sample s141 = Sample.Factory.emptySample();
		s141.put("SepalLength", 6.9);
		s141.put("SepalWidth", 3.1);
		s141.put("PetalLength", 5.1);
		s141.put("PetalWidth", 2.3);
		Matrix input141 = Matrix.Factory.linkToArray(new double[] { 6.9, 3.1, 5.1, 2.3 })
				.transpose();
		s141.put(INPUT, input141);
		Matrix output141 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s141.put(TARGET, output141);
		s141.setLabel("Iris-virginica");
		s141.setId("iris-141");
		iris.add(s141);

		Sample s142 = Sample.Factory.emptySample();
		s142.put("SepalLength", 5.8);
		s142.put("SepalWidth", 2.7);
		s142.put("PetalLength", 5.1);
		s142.put("PetalWidth", 1.9);
		Matrix input142 = Matrix.Factory.linkToArray(new double[] { 5.8, 2.7, 5.1, 1.9 })
				.transpose();
		s142.put(INPUT, input142);
		Matrix output142 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s142.put(TARGET, output142);
		s142.setLabel("Iris-virginica");
		s142.setId("iris-142");
		iris.add(s142);

		Sample s143 = Sample.Factory.emptySample();
		s143.put("SepalLength", 6.8);
		s143.put("SepalWidth", 3.2);
		s143.put("PetalLength", 5.9);
		s143.put("PetalWidth", 2.3);
		Matrix input143 = Matrix.Factory.linkToArray(new double[] { 6.8, 3.2, 5.9, 2.3 })
				.transpose();
		s143.put(INPUT, input143);
		Matrix output143 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s143.put(TARGET, output143);
		s143.setLabel("Iris-virginica");
		s143.setId("iris-143");
		iris.add(s143);

		Sample s144 = Sample.Factory.emptySample();
		s144.put("SepalLength", 6.7);
		s144.put("SepalWidth", 3.3);
		s144.put("PetalLength", 5.7);
		s144.put("PetalWidth", 2.5);
		Matrix input144 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.3, 5.7, 2.5 })
				.transpose();
		s144.put(INPUT, input144);
		Matrix output144 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s144.put(TARGET, output144);
		s144.setLabel("Iris-virginica");
		s144.setId("iris-144");
		iris.add(s144);

		Sample s145 = Sample.Factory.emptySample();
		s145.put("SepalLength", 6.7);
		s145.put("SepalWidth", 3.0);
		s145.put("PetalLength", 5.2);
		s145.put("PetalWidth", 2.3);
		Matrix input145 = Matrix.Factory.linkToArray(new double[] { 6.7, 3.0, 5.2, 2.3 })
				.transpose();
		s145.put(INPUT, input145);
		Matrix output145 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s145.put(TARGET, output145);
		s145.setLabel("Iris-virginica");
		s145.setId("iris-145");
		iris.add(s145);

		Sample s146 = Sample.Factory.emptySample();
		s146.put("SepalLength", 6.3);
		s146.put("SepalWidth", 2.5);
		s146.put("PetalLength", 5.0);
		s146.put("PetalWidth", 1.9);
		Matrix input146 = Matrix.Factory.linkToArray(new double[] { 6.3, 2.5, 5.0, 1.9 })
				.transpose();
		s146.put(INPUT, input146);
		Matrix output146 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s146.put(TARGET, output146);
		s146.setLabel("Iris-virginica");
		s146.setId("iris-146");
		iris.add(s146);

		Sample s147 = Sample.Factory.emptySample();
		s147.put("SepalLength", 6.5);
		s147.put("SepalWidth", 3.0);
		s147.put("PetalLength", 5.2);
		s147.put("PetalWidth", 2.0);
		Matrix input147 = Matrix.Factory.linkToArray(new double[] { 6.5, 3.0, 5.2, 2.0 })
				.transpose();
		s147.put(INPUT, input147);
		Matrix output147 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s147.put(TARGET, output147);
		s147.setLabel("Iris-virginica");
		s147.setId("iris-147");
		iris.add(s147);

		Sample s148 = Sample.Factory.emptySample();
		s148.put("SepalLength", 6.2);
		s148.put("SepalWidth", 3.4);
		s148.put("PetalLength", 5.4);
		s148.put("PetalWidth", 2.3);
		Matrix input148 = Matrix.Factory.linkToArray(new double[] { 6.2, 3.4, 5.4, 2.3 })
				.transpose();
		s148.put(INPUT, input148);
		Matrix output148 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s148.put(TARGET, output148);
		s148.setLabel("Iris-virginica");
		s148.setId("iris-148");
		iris.add(s148);

		Sample s149 = Sample.Factory.emptySample();
		s149.put("SepalLength", 5.9);
		s149.put("SepalWidth", 3.0);
		s149.put("PetalLength", 5.1);
		s149.put("PetalWidth", 1.8);
		Matrix input149 = Matrix.Factory.linkToArray(new double[] { 5.9, 3.0, 5.1, 1.8 })
				.transpose();
		s149.put(INPUT, input149);
		Matrix output149 = Matrix.Factory.linkToArray(new double[] { 0, 0, 1 }).transpose();
		s149.put(TARGET, output149);
		s149.setLabel("Iris-virginica");
		s149.setId("iris-149");
		iris.add(s149);

		result.put(TARGET, iris);
		return result;
	}
}
