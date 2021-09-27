/*
 * The following list gives the amount of rainfall (in cms) recorded at a particular place for 12 months
 * 10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.
 * Store these values in an array. Find the average rainfall and display the count of the number of
 * months in which the rainfall is more than the average.
 */

public class RainMain {
    public static void main(String[] args) {
        Float[] rain = {10.2f, 11.9f, 8.0f, 11.2f, 10.8f, 6.9f, 8.2f, 11.5f, 10.4f, 8.7f, 7.8f, 7.5f};

        float sum = 0;

        for(int i = 0; i < 12; i++)
            sum += rain[i];

        float avg = sum/12;

        System.out.println("Average rainfall is " + avg);

        for(int i = 0; i < 12; i++)
        {
            if(rain[i] > avg)
                System.out.println("Rainfall of month " + (i+1) + " is higher than average.");
        }
    }
}

