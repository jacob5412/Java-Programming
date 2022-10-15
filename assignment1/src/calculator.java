import java.util.Scanner;

/**
 * @author jacobjohn
 *
 */

class calculate {

	public float add(float n1, float n2) {
		return n1 + n2;
	}

	public float sub(float n1, float n2) {
		return n1 - n2;
	}

	public float mul(float n1, float n2) {
		return n1 * n2;
	}

	public float div(float n1, float n2) {
		return n1 / n2;
	}

	public float mod(float n1, float n2) {
		return n1 % n2;
	}
}

public class calculator {

	public static void main(String[] args) {
		System.out.println("The Simple Calculator Application");
		System.out.println("1. +" + "\n" + "2. -" + "\n" + "3. *" + "\n" + "4. /" + "\n" + "5. %");
		System.out.print("Enter your choice: ");

		Scanner in = new Scanner(System.in);
		int cal = in.nextInt();

		System.out.print("Enter operand 1: ");
		float oper1 = in.nextInt();
		System.out.print("Enter operand 2: ");
		float oper2 = in.nextInt();

		calculate calc = new calculate();

		switch (cal) {
			case 1:
				System.out.println("Answer: " + calc.add(oper1, oper2));
				break;
			case 2:
				System.out.println("Answer: " + calc.sub(oper1, oper2));
				break;
			case 3:
				System.out.println("Answer: " + calc.mul(oper1, oper2));
				break;
			case 4:
				System.out.println("Answer: " + calc.div(oper1, oper2));
				break;
			case 5:
				System.out.println("Answer: " + calc.mod(oper1, oper2));
				break;

		}
		in.close();
	}

}
