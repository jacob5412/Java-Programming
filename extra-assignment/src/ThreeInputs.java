/*
 * Write a program to continuously read input values from the user.
 * The program should terminate if exactly three String values have been inputted.
 * Display the count of integer values and float values entered so far.
 * Also display the average of all integer values and all float values individually.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Check {
    public static boolean CheckInt(float n){
        if(Math.round(n) == n)
            return true;        //if fractional part is 0, then integer
        else
            return false;       //else float
    }
}


public class ThreeInputs {
    public static void main(String[] args) {
        int i, nInt = 0, nFloat = 0;
        float iavg = 0, favg = 0;

        Scanner sc = new Scanner(System.in);
        String[] num1;
        Float[] num2 = new Float[10];

        Pattern p = Pattern.compile("[0-9]*\\.?[0-9]+");

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        num1 = s.split(" ");

        for(i = 0; i < num1.length; i++)
        {
            Matcher m = p.matcher(num1[i]);
            while(m.find())
                num2[i] = Float.valueOf(m.group());

        }

        for(i = 0; i < 3; i++)
        {
            if(Check.CheckInt(num2[i]))
            {
                nInt += 1;
                iavg += num2[i];
            }
            else
            {
                nFloat += 1;
                favg += num2[i];
            }
        }


        System.out.println("Number of Float Values: " + nFloat + " Average is: " + (favg/nFloat));
        System.out.println("Number of Int Values: " + nInt + " Average is: " + (iavg/nInt));


    }
}

