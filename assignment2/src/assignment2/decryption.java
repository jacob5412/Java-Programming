package assignment2;

/*They have asked you to write a program that encrypts their data so that it can be transmitted
more securely. Your program should read a four-digit integer and encrypt it as follows:
Replace each digit by (the sum of that digit plus 7) modulus 10. Then, swap the first
digit with the third, swap the second digit with the fourth and print the encrypted integer.
Write a separate program that inputs an encrypted four-digit integer and decrypts it to
form the original n.*/

import java.util.Scanner;

public class decryption {

    public static void main(String[] args) {
        int first, second, third, fourth, n, t;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
        } while (n / 1000 == 0 || n / 10000 != 0);

        input.close();

        first = n / 1000;
        second = n / 100 % 10;
        third = n / 10 % 10;
        fourth = n % 10;

        if (first <= 6 && first >= 0)
            first = first + 10;
        if (second <= 6 && second >= 0)
            second = second + 10;
        if (third <= 6 && third >= 0)
            third = third + 10;
        if (fourth <= 6 && fourth >= 0)
            fourth = fourth + 10;

        first = first - 7;
        second = second - 7;
        third = third - 7;
        fourth = fourth - 7;

        t = first;
        first = third * 1000;
        third = t * 10;

        t = second;
        second = fourth * 100;
        fourth = t;

        System.out.printf("The Decrypted n is %d\n",
                first + second + third + fourth);
    }

}
