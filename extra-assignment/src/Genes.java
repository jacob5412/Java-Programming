/*
 * Write a program to demonstrate the knowledge of
 * students in advanced concepts of Java string handling.
 * Sample input/output:
 * 1. TTATGTTTTAAGGATGGGGCGTTAGTT - TTT, GGGCGT
 * 2. TTTATGTTTATG - TTT
 * 3. TTTATGATF - No Genes
 */

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sequence: ");
        String in = sc.nextLine();

        String[] arr = in.split("ATG|TAG|TAA|TGA");

        System.out.println("Gene sequence is: ");
        int found = 0;
        if(in.indexOf(arr[0]) != 0)
        {
            System.out.println(arr[0]);
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length()%3 == 0)
            {
                found = 1;
                System.out.println(arr[i]);
            }
        }
        if(found == 0)
            System.out.println("No genes");
    }
}
