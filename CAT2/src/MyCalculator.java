
/*
 * Complete the function power in class MyCalculator and return the appropriate result
 * after the power operation or an appropriate exception as detailed above.
 */
import java.util.Scanner;

public class MyCalculator {
    static long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negavtive");
        } else {
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            p = sc.nextInt();
            try {
                System.out.println(MyCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
