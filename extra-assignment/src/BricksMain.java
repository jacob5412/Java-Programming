import java.util.Scanner;

class BricksMain {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int turn = 1;
        while (n > 0) {
            if (n <= turn) {
                System.out.println("Patlu");
                break;
            }
            n = n - turn;

            if (n <= (turn * 2)) {
                System.out.println("Motu");
                break;
            }
            n = n - (turn * 2);
            turn++;
        }
    }
}