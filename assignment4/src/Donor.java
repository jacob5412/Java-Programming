// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Donor {
    String name ,address,contact,bldgrp ,date;

    public static void main(String[] args) throws IOException{
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of donors: ");
        n = sc.nextInt();
        sc.nextLine();
        Donor arr[] = new Donor[n];                     // creating array of n donors

        FileWriter fw = new FileWriter("donations.txt");
    }
}


