package Multiples;

import java.rmi.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of data: ");
        int n = sc.nextInt();
        System.out.println("Enter data separated by space: ");

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int j = sc.nextInt();
            sc.nextLine();
            try {
                Modder stub = (Modder) Naming.lookup("rmi://localhost:1900" + "/sonoo");
                System.out.println(stub.modd(k, j));

            } catch (Exception e) {
            }
        }

    }
}
