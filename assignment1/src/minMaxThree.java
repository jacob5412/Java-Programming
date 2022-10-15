import java.util.Scanner;
//Program to find min and max from three numbers

public class minMaxThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = in.nextInt();
		System.out.print("Enter second number: ");
		int n2 = in.nextInt();
		System.out.print("Enter third number: ");
		int n3 = in.nextInt();

		if (n1 > n2 & n1 > n3)
			System.out.println("Max is " + n1);
		else if (n2 > n1 & n2 > n3)
			System.out.println("Max is " + n2);
		else
			System.out.println("Max is " + n3);

		if (n1 < n2 & n1 < n3)
			System.out.println("Min is " + n1);
		else if (n2 < n1 & n2 < n3)
			System.out.println("Min is " + n2);
		else
			System.out.println("Min is " + n3);
		in.close();
	}

}
