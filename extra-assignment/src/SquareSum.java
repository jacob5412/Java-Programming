/*
 * Write a program to define a static method sum_Squares( ) to find the sum of the
 * squares of the first 'n' natural numbers and a non-static method square_Sum( ) to
 * find the square of the sum of those 'n' natural numbers. Invoke these methods from
 * main( ) method to evaluate the difference between the values returned by them.
 */

import java.util.*;

class SumDigits {
    public static int sum_Squares(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++)
            sum += i * i;
        return sum;
    }

    public int square_Sum(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++)
            sum += i;
        return sum * sum;
    }
}

public class SquareSum {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Sum of squares of " + num + " using static method is " + SumDigits.sum_Squares(num));
        System.out
                .println("Square of sum of  " + num + " using non-static method is " + new SumDigits().square_Sum(num));
    }
}
