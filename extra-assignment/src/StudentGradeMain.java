/*
 * Create a class StudentGrade with member determineGrade( ) that accepts
 * register number (String) and marks (float-type) of a student in all
 * courses he has registered for a particular semester.
 */

class StudentGrade {
    public static void determineGrade(String reg, Float[] marks){
        if(marks.length == 0) {
            System.out.println("Grades for " + reg);
            System.out.println("You have not registered for any course");
            return;
        }
        else {
            System.out.println("Grades for " + reg);
            for (Float m : marks) {
                if (m >= 90 & m <= 100)
                    System.out.println("Grade 'S' for " + m);
                else if (m >= 80 & m <= 89)
                    System.out.println("Grade 'A' for " + m);
                else if (m >= 70 & m <= 79)
                    System.out.println("Grade 'B' for " + m);
                else if (m >= 60 & m <= 69)
                    System.out.println("Grade 'C' for " + m);
                else if (m >= 55 & m <= 59)
                    System.out.println("Grade 'D' for " + m);
                else if (m >= 50 & m <= 54)
                    System.out.println("Grade 'E' for " + m);
                else if (m <= 50)
                    System.out.println("Grade 'D' for " + m);
            }
            return;
        }
    }
}

public class StudentGradeMain {
    public static void main(String[] args) {

        Float[] marks1 = {10.0f,20.0f,30.0f};
        StudentGrade.determineGrade("100", marks1);
        System.out.println("\n");

        Float[] marks2 = {};
        StudentGrade.determineGrade("200", marks2);
        System.out.println("\n");

        Float[] marks3 = {100f,20f,50f};
        StudentGrade.determineGrade("300", marks3);
        System.out.println("\n");

        Float[] marks4 = {98f,12.2f,89f,10f};
        StudentGrade.determineGrade("400", marks4);
    }
}
