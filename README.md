# Java Programming

This repository contains all the java programming assignments for the CSE1007 lab as of Winter'19.

## Lab Uploads
* [Surprise Assessment 1 (Encryption)](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/surprise_assessment_1.pdf)
* [Assessment 1 (Questions 1-4)](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/assessment_1.pdf)
* [CAT 1](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/java_CAT_1.pdf)
* [Surprise Assessment 2 (Exception Handling)](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/surprise_assessment_2.pdf)
* [Assessment 2 (Questions 5-7)](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/assessment_2.pdf)
* [CAT 2](https://github.com/jacobjohn2016/Java-Programming/blob/master/final_uploads/java_CAT_2.pdf)

## Assignment 1
1. WAP for finding the max and min among three numbers. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment1/src/minMaxThree.java)
2. WAP, which takes two integer operands and one operator from the user, performs the operation and then prints the result. (Consider the operators `+, - ,*, /, %` and use `switch` Statement) [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment1/src/calculator.java)
3. WAP to find the sum of individual digits of a positive integer and test given number is palindrome. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment1/src/palindrome.java)

## Assignment 2
1. Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment2/src/assignment2/multiDim.java)
    >Eg., If there are 4 batches in BTech - “CSE1007” course, read the count of the slow learners (who have scored <25) in each batch. Tutors should be assigned in the ratio of 1:4 (For every 4 slow learners, there should be one tutor). Determine the number of tutors for each batch. Create a 2-D jagged array with 4 rows to store the count of slow learners in the 4 batches. The number of columns in each row should be equal to the number of groups formed for that particular batch ( Eg., If there are 23 slow learners in a batch, then there should be 6 tutors and in the jagged array, the corresponding row should store  4, 4, 4, 4, 4,3). Use for-each loop to traverse the array and print the details. Also print the number of batches in which all tutors have exactly 4 students.
2. Write a program to demonstrate the knowledge of students in String handling. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment2/src/assignment2/StringHandle.java)
    >Eg., Write a program to read a chemical equation and find out the count of the reactants and the products. Also display the count of the number of molecules of each reactant and product.
    >Eg., For the equation, 2NaOH + H2SO4 -> Na2SO4+ 2H2O,  the O/P  should be as follows: (1) Reactants are 2 moles of NaOH,  1 mole of H2SO4. (2) Products are 1 mole of Na2SO4 and 2 moles of H2O.
3. Write a program to demonstrate the knowledge of students in Inheritance. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment2/src/assignment2/Bank.java)
    > Eg: Assume that a bank maintains two kinds of accounts for customers, one called as savings account and the other as current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should maintain a minimum balance and if the balance falls below this level, a service charge is imposed.

    Create a class account that stores customer name, account number and type of account. From this derive the classes cur_acct and sav_acct to make them more specific to their requirements. Include necessary member functions in order to achieve the following tasks :
    * Accept deposit from a customer and update the balance.
    * Display the balance
    * Compute and deposit interest.
    * Permit withdrawal and update the balance.
    * Check for the minimum balance, impose penalty, necessary, and update the balance.

## Assignment 3
1. Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. [TwinsPrime](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3/src/assignment3/TwinsPrime.java) and [Prime](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3/src/primespackage/Prime.java)
    >Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.
2. Write a program to demonstrate the knowledge of students in Java Exception handling. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3-intellij/src/ExcepHandle.java)
    >Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException.  If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’
3. Write a program to demonstrate the knowledge of students in multithreading. [MultiThreadVote](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3-intellij/src/MultiThreadVote.java) [Vote](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3-intellij/src/elections/Vote.java) [Count](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment3-intellij/src/elections/count.java)
    >Eg., Three students A, B and C of B.Tech- II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally share the task of counting the number of votes cast for all the three candidates. Use synchronized method or synchronized block to update the three count variables. The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.

## Assignment 4
1. Write a program to demonstrate the knowledge of students in File handling. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/assignment4/src/Donor.java)
    > Eg., Define a class ‘Donor’ to store the below mentioned details of  a blood donor.  Name, age, Address, Contact number, blood group, date of last donation Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file. Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.
2. Write a program to demonstrate the knowledge of students in working with Java collection framework.
    > Eg., Assume only a maximum of 3 courses can be registered by a student for week end semester classes.  Create a hashmap ‘h1’ with ‘n’ key-value pairs where keys are the names of students and values are the courses registered by them. Create another hashmap ‘h2’ with ‘m’key-value pairs where keys are the names of courses offered for B.Tech and values are the names of faculty handling the courses. Write appropriate code to:
    * Add or remove a student from h1
    * Iterate over the maps and display the key-value pairs stored in them
    * Given a student name, fetch the names of all those who teach him/her.
    * if the elements of h1 are:

        | Stud name | Courses registered       |
        | ----------| -------------------------|
        | A         | Python, Math, C          |
        | B         | C, C++                   |
        | C         | C++, Physics, Chemistry  |
    * And if the elements of h2 are:

        | Course Name | Faculty      |
        | ------------| -------------|
        | Python      | 111          |
        | Math        | 222          |
        | C           | 333          |
        | C++         | 444          |
    * For the student “B”, faculty should be displayed as 333 and 444.
3. Write a program to demonstrate the knowledge of students in GUI programming using JavaFX.

## Assignment 5
1. Write a program to demonstrate the knowledge of students in JDBC.
    >Eg: Create a student table with fields roll number, name, percentage. Insert values in the table. Display all the details of the student table in a tabular format on the screen.
2. Write a program to demonstrate the knowledge of students in Servlet programming.
    >Eg., Write a servlet which counts how many times a user has visited a web page. If the user is visiting the page for the first time, display a welcome message. If the user is re-visiting the page, display the number of times visited. (Use cookies)
3. Write a program to demonstrate the knowledge of students in handling HTTP Request and Response.
    >Eg: Write a program to create a shopping mall. User must be allowed to do purchase from two pages. Each page should have a page total. The third page should display a bill, which consists of a page total of whatever the purchase has been done and print the total. (Use HttpSession)

## Assignment 6
1. Write a program to demonstrate the knowledge of students in JSP.
    >Eg: Client sends user name and password to JSP on the Server. Server receives, validates and sends back the validation result to client as response.
2. Write a program to demonstrate the knowledge of students in JSP.
    >Eg: Create a JSP page for an online multiple choice test. The questions are randomly selected from a database and displayed on the screen. The choices are displayed using radio buttons. When the user clicks on next, the next question is displayed. When the user clicks on submit, display the total score on the screen.

## Extra Questions (Practice)
1. Write a program to accept an integer number and separate the digits with a $ sign. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/separateInt.java)
2. Write a program to continuously read input values from the user. The program should terminate if exactly three String values have been inputted. Display the count of integer values and float values entered so far. Also display the average of all integer values and all float values individually.[Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/ThreeInputs.java)
3. Create a class StudentGrade with member determineGrade( ) that accepts register number (String) and marks (float-type) of a student in all courses he has registered for a particular semester. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/StudentGradeMain.java)
4. Write a program to define a static method sum_Squares( ) to find the sum of the squares of the first 'n' natural numbers and a non-static method square_Sum( ) to find the square of the sum of those 'n' natural numbers. Invoke these methods frommain( ) method to evaluate the difference between the values returned by them. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/SquareSum.java)
5. The following list gives the amount of rainfall (in cms) recorded at a particular place for 12 month.
Store these values in an array. Find the average rainfall and display the count of the number of months in which the rainfall is more than the average. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/RainMain.java)
    >10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.
6. Write a program to print the following patterns using loops. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/Pattern.java)
```
1 2 3 4 5 6 7
  2 3 4 5 6 7
    3 4 5 6 7
      4 5 6 7
        5 6 7
          6 7
            7
          6 7
        5 6 7
      4 5 6 7
    3 4 5 6 7
  2 3 4 5 6 7
1 2 3 4 5 6 7
```
7. Write a program called NumberGuess to play the number guessing game. The program shall generate a random number between 0 and 99. The player inputs his/her guess and the program shall response with "Too higher", "Too lower" or "Congratulations! You got it.." accordingly. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/NumberGuess.java)
8. Create a class Film with string objects which stores name, language and lead_actor and category (action/drama/fiction/comedy). Also include an integer data member that stores the duration of the film. Include parameterized constructor, default constructor and accessory functions to film class. Film objects can be initialized either using a constructor or accessor functions. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/FilmMain.java)
9. Demonstrating multiple inheritance in Java. [Source](https://www.geeksforgeeks.org/java-and-multiple-inheritance/) [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/MultipleInheritance.java)
10. Write a program to demonstrate the knowledge of students in advanced concepts of Java string handling. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/Genes.java)
    >Eg., (Bioinformatics: finding genes) Biologists use a sequence of letters A, C, T, and G to model a genome. A gene is a substring of a genome that starts after a triplet ATG and ends before a triplet *TAG, TAA, or TGA*. Furthermore, the length of a gene string is a multiple of 3 and the gene does not contain any of the triplets ATG, TAG, TAA, and TGA. Write a program that prompts the user to enter a genome and displays all genes in the genome. If no gene is found in the input sequence, displays no gene. Here are the sample runs: done
```
Enter a genome string: TTATGTTTTAAGGATGGGGCGTTAGTT
O/P:    TTT
        GGGCGT
```
11. Write a program to demonstrate the knowledge of students in creation of abstract classes and working with abstract methods. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/AmusementParks.java)
    >Eg., Define an abstract class ‘Themepark’ and inherit 2 classes ‘Queensland’ and ‘Wonderla’ from the abstract class. In both the theme parks, the entrance fee for adults is Rs. 500 and for children it is Rs. 300. If a family buys ‘n’ adult tickets and ‘m’ children tickets, define a method in the abstract class to calculate the total cost. Also, declare an abstract method playGame() which must be redefined in the subclasses. In Queensland, there are a total of 30 games. Hence create a Boolean array named ‘Games’ of size 30 which initially stores false values for all the elements. If the player enters any game code that has already been played, a warning message should be displayed and the user should be asked for another choice.  In Wonderla, there are a total of 40 different games. Thus create an integer array with 40 elements. Here, the games can be replayed, until the user wants to quit. Finally display the total count of games that were repeated and count of the games which were not played at all. 
12. Write a program to demonstrate the knowledge of students in working with Inheritance. Create classes to implement the following hierarchy. [Ans](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/Hospital.java)
<p align="center">
  <img src="https://raw.githubusercontent.com/jacobjohn2016/Java-Programming/master/Images/1.png" width="250" alt="class diagram">
</p>
    Include data members and member functions as given in the table below.
<p align="center">
  <img src="https://raw.githubusercontent.com/jacobjohn2016/Java-Programming/master/Images/2.png" width="750" alt="specifications">
</p>

12. Create Exception class called BookQuantityNotAvailableException and use it in the class called “Store” which is described by its bookId title, author, price and quantityAvailable. Include a method called purchase() taking the purchase quantity as a parameter and update the quantityAvailable appropriately. Create a package containing the Store and a Exception class. Write a java program to test the working of the Store class. [Book](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/Library/Book.java) [Store](https://github.com/jacobjohn2016/Java-Programming/blob/master/extra-assignment/src/Store.java)

13. You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method `long power(int, int)`. This method takes two integers, n and p, as parameters and finds n<sup>p</sup>. If either n or p is negative, then the method must throw an exception which says "n and p should not be negative". Also, if both n and p are zero, then the method must throw an exception which says " n and p should not be zero " Complete the function power in `class MyCalculator` and return the appropriate result after the power operation or an appropriate exception as detailed above.
    
14. Write a Java program to Print alternate numbers using 2 Threads.