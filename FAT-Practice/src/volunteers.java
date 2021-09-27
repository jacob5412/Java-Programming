import java.util.Scanner;

public class volunteers {
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        String batches[][] = new String[3][];

        System.out.println("Selecting batch 1 students: ");
        batches[0] = new String[4];
        for(i = 0; i < 4; i++){
            System.out.print("Enter reg. no. " + (i+1) + ": ");
            batches[0][i] = sc.nextLine();
        }

        System.out.println("Selecting batch 2 students: ");
        batches[1] = new String[3];
        for(i = 0; i < 3; i++){
            System.out.print("Enter reg. no. " + (i+1) + ": ");
            batches[1][i] = sc.nextLine();
        }

        System.out.println("Selecting batch 1 students: ");
        batches[2] = new String[1];
        for(i = 0; i < 1; i++){
            System.out.print("Enter reg. no. " + (i+1) + ": ");
            batches[2][i] = sc.nextLine();
        }

        System.out.println("\n" + "Batch 1 students are: ");
        for(i = 0; i < 4; i++)
            System.out.print(batches[0][i] + "\t");

        System.out.println("\n" + "Batch 2 students are: ");
        for(i = 0; i < 3; i++)
            System.out.print(batches[1][i] + "\t");

        System.out.println("\n" + "Batch 3 students are: ");
        for(i = 0; i < 1; i++)
            System.out.print(batches[2][i] + "\t");
    }
}
