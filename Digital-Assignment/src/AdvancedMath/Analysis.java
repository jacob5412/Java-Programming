package AdvancedMath;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.linear.*;

public class Analysis {
    public static void main(String[] args) {
        UnivariateFunction function = v -> Math.pow(v, 2) - 2;
        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1.0e-12, 1.0e-8, 5);
        double c = solver.solve(100, function, -10.0, 10.0, 0);

        System.out.println("Root is: " + c);

        UnivariateFunction function2 = v -> v;
        UnivariateIntegrator integrator = new SimpsonIntegrator(1.0e-12, 1.0e-8, 1, 32);
        double i = integrator.integrate(100, function2, 0, 10);

        System.out.println("Integral is: " + i);

        RealMatrix a = new Array2DRowRealMatrix(
                new double[][] { { 2, 3, -2 }, { -1, 7, 6 }, { 4, -3, -5 } },
                false);
        RealVector b = new ArrayRealVector(new double[] { 1, -2, 1 }, false);

        DecompositionSolver solver2 = new LUDecomposition(a).getSolver();

        RealVector solution = solver2.solve(b);

        System.out.println("Solution of linear equation is: " + solution);
    }
}
