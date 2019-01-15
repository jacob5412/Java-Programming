import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type something: ");
        String s1 = sc.nextLine();
        System.out.println("Hello World");
        System.out.println("Is this working?");
        System.out.println("You typed, " + s1);
    }
}
