/*
 * Write a program to accept an integer number
 * and separate the digits with a $ sign.
 */

import java.util.*;

public class separateInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        sc.close();

        String sep = s.replace("", " $ ");

        System.out.println("Separated digits are: " + sep);
    }
}
