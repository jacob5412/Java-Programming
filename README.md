# Java Programming

This repository contains all the java programming assignments for the CSE1007 lab as of Winter'19.

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
1. Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. 
    >Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.
2. Write a program to demonstrate the knowledge of students in Java Exception handling.
    >Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException.  If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’
3. Write a program to demonstrate the knowledge of students in multithreading.
    >Eg., Three students A, B and C of B.Tech- II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally share the task of counting the number of votes cast for all the three candidates. Use synchronized method or synchronized block to update the three count variables. The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.

## Assignment 4
1. Write a program to demonstrate the knowledge of students in File handling.
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