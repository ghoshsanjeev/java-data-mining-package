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

package org.jdmp.core.algorithm.classification.meta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jdmp.core.algorithm.classification.AbstractClassifier;
import org.jdmp.core.algorithm.classification.Classifier;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.core.sample.Sample;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation.Ret;
import org.ujmp.core.exception.NotImplementedException;

public class MultiClassClassifier extends AbstractClassifier {
    private static final long serialVersionUID = 466059743021340944L;

    private Classifier singleClassClassifier = null;

    private int classCount = 0;

    private boolean twoColumns = false;

    private final List<Classifier> singleClassClassifiers = new ArrayList<Classifier>();

    public MultiClassClassifier(Classifier singleClassClassifier, boolean twoColumns) {
        super();
        setLabel("MultiClassClassifier [" + singleClassClassifier.toString() + "]");
        this.singleClassClassifier = singleClassClassifier;
        this.twoColumns = twoColumns;
    }

    public void predictOne(Sample sample) {
        double[] results = new double[classCount];
        for (int i = 0; i < classCount; i++) {
            Classifier c = singleClassClassifiers.get(i);
            Sample clone = sample.clone();
            c.predictOne(clone);
            results[i] = clone.getAsMatrix(PREDICTED).getAsDouble(0, 0);
        }
        sample.put(PREDICTED, Matrix.Factory.linkToArray(results).transpose());
    }

    public void reset() {
        singleClassClassifiers.clear();
    }

    public void trainAll(ListDataSet dataSet) {
        reset();
        classCount = getClassCount(dataSet);

        for (int i = 0; i < classCount; i++) {
            System.out.println("Training class " + i);
            Classifier c = singleClassClassifier.emptyCopy();
            singleClassClassifiers.add(c);
            Matrix input = dataSet.getInputMatrix();
            Matrix target = dataSet.getTargetMatrix().selectColumns(Ret.LINK, i);
            if (twoColumns) {
                Matrix target2 = target.minus(1).abs(Ret.NEW);
                target = Matrix.Factory.horCat(target, target2);
            }
            ListDataSet ds = DataSet.Factory.linkToInputAndTarget(input, target);
            c.trainAll(ds);
        }

    }

    @Override
    public void trainBatch(Collection<Sample> samples) {
        throw new NotImplementedException();
    }

    public Classifier emptyCopy() {
        return new MultiClassClassifier(singleClassClassifier, twoColumns);
    }
}
