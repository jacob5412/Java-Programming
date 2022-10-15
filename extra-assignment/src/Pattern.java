/*
 * Write a program to print the following patterns using loops.
 */

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (k = i - 1; k > 0; k--) {
                System.out.print(" " + "\t");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }

        for (i = n - 1; i > 0; i--) {
            for (k = i - 1; k > 0; k--) {
                System.out.print(" " + "\t");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }

    }
}
