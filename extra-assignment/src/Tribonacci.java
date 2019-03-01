import java.io.*;
import java.util.*;
public class Tribonacci {
    static int tri(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        else
            return tri(n - 1) + tri(n - 2) + tri(n - 3);
    }

    static void tribe(int n) {
        if (n == 1)
            System.out.print("1");
        else if (n == 2)
            System.out.print("1 1");
        else if (n == 3)
            System.out.print("1 1 2");
        else {
            System.out.print("1 1 2 ");
            for (int a = 4; a <= n; a++) {
                System.out.print(tri(a - 1) + tri(a - 2) + tri(a - 3));
                System.out.print(" ");
            }
        }
    }

    public static void main(String args[]) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        tribe(n);
    }
}