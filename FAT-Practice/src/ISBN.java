import Package1.NumberManipulation;

import java.util.Scanner;

class InvalidInputException extends Exception {
    InvalidInputException(String msg) {
        super(msg);
    }
}

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String is = sc.nextLine();
        try {
            if (is.length() != 9) {
                throw new InvalidInputException("ISBN must be exactly 9 digits");
            } else {
                NumberManipulation n = new NumberManipulation();
                Integer i = Integer.parseInt(is);
                n.extractDigits(i);
                System.out.println("Last digit = " + n.findLastDigit());
                System.out.println("New ISBN = " + is + n.findLastDigit());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
