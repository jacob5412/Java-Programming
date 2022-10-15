import java.util.*;

public class MapsPractice {
    public static void main(String[] args) {
        HashMap<String, List<String>> h1 = new LinkedHashMap<>();
        HashMap<String, String> h2 = new LinkedHashMap<>();

        // Check if HashMap is empty
        System.out.println("is studentsMapping empty?: " + h1.isEmpty());
        System.out.println("is studentsMapping empty?: " + h2.isEmpty());

        // creating list of subjects and adding to hash map
        List<String> subjects = Arrays.asList("Python", "Math", "C");
        h1.put("A", subjects);
        subjects = Arrays.asList("C", "C++");
        h1.put("B", subjects);
        subjects = Arrays.asList("C++", "Physics", "Chemistry");
        h1.put("C", subjects);

        // creating hashmap of faculty
        h2.put("Python", "111");
        h2.put("Math", "222");
        h2.put("C", "333");
        h2.put("C++", "444");

        // displaying all students and subjects
        for (Map.Entry m : h1.entrySet()) {
            System.out.println(m.getKey());
            subjects = (List<String>) m.getValue();
            for (String s : subjects)
                System.out.print(s + " ");
            System.out.println();
        }
        // displaying all subjects and faculty
        for (Map.Entry m : h2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a student: ");
        String s = "B";

        System.out.println("Faculties are: ");
        for (Map.Entry m : h1.entrySet()) {
            if (m.getKey().equals(s)) {
                for (Map.Entry m2 : h2.entrySet()) {
                    subjects = (List<String>) m.getValue();
                    if (subjects.contains(m2.getKey()))
                        System.out.println(m2.getValue());
                }
            }
        }
    }
}
