/*
 * Jacob John
 */

package assignment3;

import java.util.Scanner;
import primespackage.Prime;

public class TwinsPrime {
	public static void main(String args[]) {
		int i;
		
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println("Twin prime numbers are: ");
		//checking twins prime
		for(i = n1; i <= n2; i++) {
			if(Prime.checkPrime(i) & Prime.checkPrime(i+2))
			{
				System.out.println("(" + i + "," + (i+2) + ")");
			}
		}
	}
}
