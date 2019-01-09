package assignment2;
import java.util.Scanner;

public class multiDim {

	public static void main(String[] args) {
        int i, j;
        double t;

		// Declaring 2-D array with 4 rows 
        int arr[][] = new int[4][]; 
  
        // input for each batch
        Scanner sc = new Scanner(System.in);
        for(i = 0; i < arr.length; i++){
            System.out.print("Enter number of students for batch" + (i+1) + ": ");
            t = sc.nextDouble();
            arr[i] = new int[(int)Math.ceil(t/4)];
            for(j = 0; j < arr[i].length; j++)
            {
                if(t >= 4)
                    arr[i][j] = 4;
                else
                    arr[i][j] = (int)t;
                t = t - 4;
            }
        }
  
        // Displaying the values of 2D Jagged array 
        int cfour = 0;
        System.out.println("Contents of 2D Jagged Array"); 
        for (i = 0; i < arr.length; i++) { 
            for (j = 0; j < arr[i].length; j++) {
            		System.out.print(arr[i][j] + " ");
            		if(arr[i][j] == 4)
            			cfour++;
            }
            System.out.println(); 
        }

        System.out.println("Number of tutors with 4 students are: " + cfour );
    }
}
