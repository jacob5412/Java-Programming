import java.util.Scanner;

class testPalindrome{
	testPalindrome(int n){
		int j = 0, i = 1, r;
		boolean flag = false;
		while(n > 0) {
			r = n%10;
			n = n/10;
			j = j*i + r;
			i = i*10;
			
			if(j == n)
			{
				System.out.println("Number is a Palindrome");
				flag = true;
				break;
			}
		}
		if(flag == false)
			System.out.println("Number is not a Palindrome");
	}
}

class digitSum{
	digitSum(int n){
		int sum = 0, r;
		while(n > 0){
			r = n%10;
			n = n/10;
			sum += r;
		}

		System.out.println("Sum of digits are: " + sum);
	}
	
}

public class palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		new digitSum(num);
		new testPalindrome(num);

		in.close();
	}

}
