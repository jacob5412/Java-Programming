/*
Write a program called NumberGuess to play the number guessing game.
The program shall generate a random number between 0 and 99.
The player inputs his/her guess and the program shall response with "Too higher",
"Too lower" or "Congratulations! You got it.." accordingly.
 */

import java.util.*;

class RandInt {
    public static int number() {
        Random rand = new Random();
        int n = rand.nextInt(99) + 0;
        return n;
    }
}

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int gen = RandInt.number(); // class to generate random number

        for (i = 0; i < 3; i++) {
            System.out.print("Enter a number (0-99): ");
            int n = sc.nextInt();
            if (n > gen)
                System.out.println("Too High!");
            else if (n < gen)
                System.out.println("Too Low!");
            else if (n == gen) {
                System.out.println("Congratulations! You got it!");
                break;
            }
            System.out.println((2 - i) + " tries remaining");
        }
        sc.close(); // Closing Scanner class

        if (i == 3)
            System.out.println("-----Game Over-----");
    }

}
