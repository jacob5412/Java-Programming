package jdmp;/*
             * Copyright (C) 2008-2015 by Holger Arndt
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

import org.jdmp.core.algorithm.classification.bayes.NaiveBayesClassifier;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;

public class NaiveBayesClassificationExample {

    public static void main(String[] args) {

        // load example data set
        ListDataSet dataSet = DataSet.Factory.IRIS();

        // create a classifier
        NaiveBayesClassifier classifier = new NaiveBayesClassifier();

        // train the classifier using all data
        classifier.trainAll(dataSet);

        // use the classifier to make predictions
        classifier.predictAll(dataSet);

        // get the results
        double accurary = dataSet.getAccuracy();

        System.out.println("accuracy: " + accurary);
    }
}