import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();

        String[] words = s1.split(" ");
        String[] latin = new String[words.length];
        StringBuffer temp = new StringBuffer(); // string buffer to reverse string

        for (i = 0; i < words.length; i++) {
            temp.delete(0, temp.length()); // deleting previous reversed string
            latin[i] = ""; // creating an empty string object
            latin[i] += 'a'; // appending initial 'a' character first
            temp.append(words[i]); // reversing the string
            temp.reverse();
            latin[i] += temp; // appending reverse string
            latin[i] += 'a'; // adding last 'a' character
            System.out.print(latin[i] + " "); // printing pig latin
        }
    }
}
