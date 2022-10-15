/*
 * https://www.baeldung.com/apache-commons-math
 */

package AdvancedMath;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Stats {
    public static void main(String[] args) {
        double[] values = new double[] { 65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32 };
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();
        System.out.println("Mean " + mean);
        System.out.println("Median " + median);
        System.out.println("Standard Deviation " + standardDeviation);

        NormalDistribution normalDistribution = new NormalDistribution(10, 3);
        double randomValue = normalDistribution.sample();
        System.out.println("Random number: " + randomValue);
    }
}
