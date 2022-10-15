# Java Programming

This repository contains all the java programming assignments for the CSE1007 lab as of Winter'19. It contains simple programs all the way to very advanced ones for practice. This repo also includes specific instructions on how to execute certain programs.

## Assignment 1
1. WAP for finding the max and min among three numbers. [Ans](/assignment1/src/minMaxThree.java)
2. WAP, which takes two integer operands and one operator from the user, performs the operation and then prints the result. (Consider the operators `+, - ,*, /, %` and use `switch` Statement) [Ans](/assignment1/src/calculator.java)
3. WAP to find the sum of individual digits of a positive integer and test given number is palindrome. [Ans](/assignment1/src/palindrome.java)

## Assignment 2
1. Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs. [Ans](/assignment2/src/assignment2/multiDim.java)
    >Eg., If there are 4 batches in BTech - “CSE1007” course, read the count of the slow learners (who have scored <25) in each batch. Tutors should be assigned in the ratio of 1:4 (For every 4 slow learners, there should be one tutor). Determine the number of tutors for each batch. Create a 2-D jagged array with 4 rows to store the count of slow learners in the 4 batches. The number of columns in each row should be equal to the number of groups formed for that particular batch ( Eg., If there are 23 slow learners in a batch, then there should be 6 tutors and in the jagged array, the corresponding row should store  4, 4, 4, 4, 4,3). Use for-each loop to traverse the array and print the details. Also print the number of batches in which all tutors have exactly 4 students.
2. Write a program to demonstrate the knowledge of students in String handling. [Ans](/assignment2/src/assignment2/StringHandle.java)
    >Eg., Write a program to read a chemical equation and find out the count of the reactants and the products. Also display the count of the number of molecules of each reactant and product.
    >Eg., For the equation, 2NaOH + H2SO4 -> Na2SO4+ 2H2O,  the O/P  should be as follows: (1) Reactants are 2 moles of NaOH,  1 mole of H2SO4. (2) Products are 1 mole of Na2SO4 and 2 moles of H2O.
3. Write a program to demonstrate the knowledge of students in Inheritance. [Ans](/assignment2/src/assignment2/Bank.java)
    > Eg: Assume that a bank maintains two kinds of accounts for customers, one called as savings account and the other as current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should maintain a minimum balance and if the balance falls below this level, a service charge is imposed.

    Create a class account that stores customer name, account number and type of account. From this derive the classes cur_acct and sav_acct to make them more specific to their requirements. Include necessary member functions in order to achieve the following tasks :
    * Accept deposit from a customer and update the balance.
    * Display the balance
    * Compute and deposit interest.
    * Permit withdrawal and update the balance.
    * Check for the minimum balance, impose penalty, necessary, and update the balance.

## Assignment 3
1. Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. [TwinsPrime](/assignment3/src/assignment3/TwinsPrime.java) and [Prime](/assignment3/src/primespackage/Prime.java)
    >Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.
2. Write a program to demonstrate the knowledge of students in Java Exception handling. [Ans](/assignment3-intellij/src/ExcepHandle.java)
    >Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException.  If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’
3. Write a program to demonstrate the knowledge of students in multithreading. [MultiThreadVote](/assignment3-intellij/src/MultiThreadVote.java) [Vote](/assignment3-intellij/src/elections/Vote.java) [Count](/assignment3-intellij/src/elections/count.java)
    >Eg., Three students A, B and C of B.Tech- II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally share the task of counting the number of votes cast for all the three candidates. Use synchronized method or synchronized block to update the three count variables. The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.

## Assignment 4
1. Write a program to demonstrate the knowledge of students in File handling. [Ans](/FAT-Practice/src/Donations.java)
    > Eg., Define a class ‘Donor’ to store the below mentioned details of  a blood donor.  Name, age, Address, Contact number, blood group, date of last donation Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file. Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.
    
    [Alternative Ans](/assignment4/src/Donor.java): 
    _If you're running the "alternative ans", then please refer [instructions on how to run](/assignment4/JodaTimeDonor.md) if you do not know how to add the [jodatime](https://github.com/JodaOrg/joda-time/releases) jar files to your system._

    Or copy the output below:

    <p align="center">
    <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/3-donors-output.png" alt="Donors output" width="600">
    </p>

2. Write a program to demonstrate the knowledge of students in working with Java collection framework. [Ans](/FAT-Practice/src/MapsPractice.java)
    > Eg., Assume only a maximum of 3 courses can be registered by a student for week end semester classes.  Create a hashmap ‘h1’ with ‘n’ key-value pairs where keys are the names of students and values are the courses registered by them. Create another hashmap ‘h2’ with ‘m’key-value pairs where keys are the names of courses offered for B.Tech and values are the names of faculty handling the courses. Write appropriate code to:
    * Add or remove a student from h1
    * Iterate over the maps and display the key-value pairs stored in them
    * Given a student name, fetch the names of all those who teach him/her.
    * if the elements of h1 are:

        | Stud name | Courses registered      |
        | --------- | ----------------------- |
        | A         | Python, Math, C         |
        | B         | C, C++                  |
        | C         | C++, Physics, Chemistry |
    * And if the elements of h2 are:

        | Course Name | Faculty |
        | ----------- | ------- |
        | Python      | 111     |
        | Math        | 222     |
        | C           | 333     |
        | C++         | 444     |
    * For the student “B”, faculty should be displayed as 333 and 444.

## Assignment 5
1. Write a program to demonstrate the knowledge of students in creating and deploying applets. [Ans](/Applets/src/myApplet.java)
    >Eg., Draw a ball, filled with default color. Move the ball from top to bottom of the window continuously with its color changed for every one second. The new color of the ball for the next second should be obtained by adding 20 to the current value of Red component, for the second time by adding 20 to the blue component, and for the third time by adding 20 to the blue component, till all reach the final limit 225, after which the process should be repeated with the default color.
    <p align="center">
      <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/4-applets.png" alt="Applets" width="600">
    </p>
2. Write a program to demonstrate the knowledge of students in Java Network Programming.
    * [udpBaseServer_2.java](/Socket-Programming/src/udpBaseServer_2.java): Server side
      1. `Run` this **first**
      2. Wait for client to send data
      3. Will Calculate checksum on received data
      4. Displays "Success" or "Failure" accordingly
    * [udpBaseClient_2.java](/Socket-Programming/src/udpBaseClient_2.java): Client side
      1. `Run` this **next**
      2. Input the number of data to be send
      3. Enter data line by line
      4. Wait for checksum to be calculated and sent
    > Eg., Develop a UDP based client-server application to notify the client about the integrity of data sent from its side. Use checksum to do this.
    <p align="center">
      <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/5-RMI-OP.png" alt="RMI Output" width="600">
    </p>
    
3. Write a program to demonstrate the knowledge of students in Remote method invocation.
    * [Modder.java](/RMI/src/Multiples/Modder.java): Remote Interface
    * [ModderRemote.java](/RMI/src/Multiples/ModderRemote.java): Provide the implementation of the remote interface
    * [MyServer.java](/RMI/src/Multiples/MyServer.java): Create and run server application
    * [MyClient.java](/RMI/src/Multiples/MyClient.java): Create and run client application
    > Eg., Develop an RMI application to invoke a remote method that takes two numbers and returns true if one number is an exact multiple of the other and false otherwise.

    ```
    Sample test cases:
    -------------------
    5 and 25 -> true
    26 and 13 -> true
    4 and 18 -> false
    ```

    * Client:
        <p align="center">
        <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/6-CS-C.png" alt="CS Client" width="600">
        </p>
    * Server:
        <p align="center">
        <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/6-CS-S.png" alt="CS Server" width="600">
        </p>

## Assignment 6
1. Write a program to demonstrate the knowledge of students in Servlet programming.
    >Eg., Assume two cookies are created whenever a VIT student visits the VIT webpage-one for his/her name and the other for his campus. For subsequent visits, he/she should be greeted with the message similar to the one below.

    ```
    “Hi Ajay from Chennai Campus!!”.
    ```

    * [output](https://jacob5412.github.io/Java-Programming/Servlet-Programming/)
    * [web.xml](/Servlet-Programming/WebContent/WEB-INF/web.xml): File for mapping URL
    * [Hello.html](/Servlet-Programming/WebContent/Hello.html): Initial html landing page. **Run this file on the server**.
    * [HelloForm.java](/Servlet-Programming/src/HelloForm.java): Intilializing cookies
    * [ReadCookies.java](/Servlet-Programming/src/ReadCookies.java): Reading Cookies Servlet
    * [DeleteCookies.java](/Servlet-Programming/src/DeleteCookies.java): Deleting Cookies Servlet.

## [JDBC Introduction](/JDBC-Practice)
1. [First JDBC Program](/JDBC-Practice/src/FirstJDBC.java): Connecting to MySQL and extracting results from query.
2. [Batch Processing](/JDBC-Practice/src/BatchProcessingExample.java): Executing queries as batches.

## [Socket Programming Introduction](/Socket-Programming)
**Note:** Always run server program before client.
1. [Client Program](/Socket-Programming/src/FirstClient.java): Sends request and a message.
2. [Server Program](/Socket-Programming/src/FirstServer.java): Listens on port and prints message to console.
3. [Client Program for simple chat application](/Socket-Programming/src/MyClient1.java)
4. [Server Program for simple chat application](/Socket-Programming/src/MyServer1.java)

## [Servlet Programming - Introduction](/BeginnersBookDemo)
1. [Hello.html](/BeginnersBookDemo/WebContent/Hello.html): This is the input form
2. [HelloFormPost.java](/BeginnersBookDemo/src/HelloFormPost.java): Servlet for getting form data and displaying.
3. [web.xml](/BeginnersBookDemo/WebContent/WEB-INF/web.xml): For mapping servlet URL.

## [Servlet Programming - Login with Database](/LoginLogout/LoginLogoutDB)

_Recommended IDE_ is Netbeans. I wasn't able to link the database successfully with neither Eclipse nor IntelliJ.

1. [index.html](/LoginLogout/LoginLogoutDB/web/index.html): input form
2. [FirstServlet.java](/LoginLogout/LoginLogoutDB/src/java/FirstServlet.java): authenticates the username and password
3. [WelcomeServlet.java](/LoginLogout/LoginLogoutDB/src/java/WelcomeServlet.java): displays welcome message to registered user
4. [web.xml](/LoginLogout/LoginLogoutDB/web/WEB-INF/web.xml): For mapping servlet files to URL.

## [Digital Assignment](https://jacob5412.github.io/Java-Programming/Digital-Assignment/)

## Extra Questions (Practice)
1. Write a program to accept an integer number and separate the digits with a $ sign. [Ans](/extra-assignment/src/separateInt.java)
2. Write a program to continuously read input values from the user. The program should terminate if exactly three String values have been inputted. Display the count of integer values and float values entered so far. Also display the average of all integer values and all float values individually.[Ans](/extra-assignment/src/ThreeInputs.java)
3. Create a class StudentGrade with member determineGrade( ) that accepts register number (String) and marks (float-type) of a student in all courses he has registered for a particular semester. [Ans](/extra-assignment/src/StudentGradeMain.java)
4. Write a program to define a static method sum_Squares( ) to find the sum of the squares of the first 'n' natural numbers and a non-static method square_Sum( ) to find the square of the sum of those 'n' natural numbers. Invoke these methods frommain( ) method to evaluate the difference between the values returned by them. [Ans](/extra-assignment/src/SquareSum.java)
5. The following list gives the amount of rainfall (in cms) recorded at a particular place for 12 month.
Store these values in an array. Find the average rainfall and display the count of the number of months in which the rainfall is more than the average. [Ans](/extra-assignment/src/RainMain.java)
    >10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.
6. Write a program to print the following patterns using loops. [Ans](/extra-assignment/src/Pattern.java)

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

1. Write a program called NumberGuess to play the number guessing game. The program shall generate a random number between 0 and 99. The player inputs his/her guess and the program shall response with "Too higher", "Too lower" or "Congratulations! You got it.." accordingly. [Ans](/extra-assignment/src/NumberGuess.java)
2. Create a class Film with string objects which stores name, language and lead_actor and category (action/drama/fiction/comedy). Also include an integer data member that stores the duration of the film. Include parameterized constructor, default constructor and accessory functions to film class. Film objects can be initialized either using a constructor or accessor functions. [Ans](/extra-assignment/src/FilmMain.java)
3. Demonstrating multiple inheritance in Java. [Source](https://www.geeksforgeeks.org/java-and-multiple-inheritance/) [Ans](/extra-assignment/src/MultipleInheritance.java)
4.  Write a program to demonstrate the knowledge of students in advanced concepts of Java string handling. [Ans](/extra-assignment/src/Genes.java)
    >Eg., (Bioinformatics: finding genes) Biologists use a sequence of letters A, C, T, and G to model a genome. A gene is a substring of a genome that starts after a triplet ATG and ends before a triplet *TAG, TAA, or TGA*. Furthermore, the length of a gene string is a multiple of 3 and the gene does not contain any of the triplets ATG, TAG, TAA, and TGA. Write a program that prompts the user to enter a genome and displays all genes in the genome. If no gene is found in the input sequence, displays no gene. Here are the sample runs: done
```
Enter a genome string: TTATGTTTTAAGGATGGGGCGTTAGTT
O/P:    TTT
        GGGCGT
```
11. Write a program to demonstrate the knowledge of students in creation of abstract classes and working with abstract methods. [Ans](/extra-assignment/src/AmusementParks.java)
    >Eg., Define an abstract class ‘Themepark’ and inherit 2 classes ‘Queensland’ and ‘Wonderla’ from the abstract class. In both the theme parks, the entrance fee for adults is Rs. 500 and for children it is Rs. 300. If a family buys ‘n’ adult tickets and ‘m’ children tickets, define a method in the abstract class to calculate the total cost. Also, declare an abstract method playGame() which must be redefined in the subclasses. In Queensland, there are a total of 30 games. Hence create a Boolean array named ‘Games’ of size 30 which initially stores false values for all the elements. If the player enters any game code that has already been played, a warning message should be displayed and the user should be asked for another choice.  In Wonderla, there are a total of 40 different games. Thus create an integer array with 40 elements. Here, the games can be replayed, until the user wants to quit. Finally display the total count of games that were repeated and count of the games which were not played at all. 
    
12. Write a program to demonstrate the knowledge of students in working with Inheritance. Create classes to implement the following hierarchy. [Ans](/extra-assignment/src/Hospital.java)
    <p align="center">
      <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/1.png" width="250" alt="class diagram">
    </p>
    Include data members and member functions as given in the table below.
    <p align="center">
      <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/Images/2.png" width="750"       alt="specifications">
    </p>

13. Create Exception class called BookQuantityNotAvailableException and use it in the class called “Store” which is described by its bookId title, author, price and quantityAvailable. Include a method called purchase() taking the purchase quantity as a parameter and update the quantityAvailable appropriately. Create a package containing the Store and a Exception class. Write a java program to test the working of the Store class. [Book](/extra-assignment/src/Library/Book.java) [Store](/extra-assignment/src/Store.java)

14. You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method `long power(int, int)`. This method takes two integers, n and p, as parameters and finds n<sup>p</sup>. If either n or p is negative, then the method must throw an exception which says "n and p should not be negative". Also, if both n and p are zero, then the method must throw an exception which says " n and p should not be zero " Complete the function power in `class MyCalculator` and return the appropriate result after the power operation or an appropriate exception as detailed above. [Ans](/CAT2/src/MyCalculator.java)
    
15. Write a Java program to Print alternate numbers using 2 Threads. [Ans](/CAT2/src/AlternateNumbers.java)

16. Write a program to generate the Tribonacci sequence. (Tribonacci numbers are a sequence of
numbers `T(n)` similar to Fibonacci numbers, except that a number is formed by adding the three
previous numbers, i.e., `T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2`). [Ans](/extra-assignment/src/Tribonacci.java)

17. Student volunteers from three batches of B.Tech are selected to ensure the smooth conduct of a Technical event. Assume that only 4 volunteers from batch1, 3 volunteers from batch2, 1 volunteer from batch3 are selected. Create a 2-D ragged array of strings to store their register numbers batch wise. The first row stores register numbers of the volunteers in batch1, second row – batch2 and so forth. Use for-each loop to traverse the array elements.[Ans](/FAT-Practice/src/volunteers.java)

18. An ISBN (International Standard Book Number) consists of 10 digits d1d2d3d4d5d6d7d8d9d10. The last digit d10 is a checksum, which is calculated from the other nine digits using the following formula: `(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)% 11`.
    * If the checksum is 10, the last digit is denoted X according to the ISBN convention. For the input 013601267, the program should display 0136012671.
    * Define a package ‘Package1’ with the class ‘NumberManipulation’ which contains an integer array (size 9) as its instance variable and two methods `extractDigits( )` and `findLastDigit( )`. The `extractDigits( )` method must take an integer number as argument and extract the individual digits of the number and store them in the 9-element integer array. The method `findLastDigit( )` should find out the 10th digit using the above formula and return it. [NumberManipulation.java](/FAT-Practice/src/Package1/NumberManipulation.java)
    * Define a main class outside of the package created above and read the 9-digit number as a String. Throw a user defined exception "InvalidInputException" if the length of the input String is not exactly 9 digits and prompt the user to enter the input again. If valid, convert the input into integer and pass it to the method `extractDigits( )` and also invoke `findLastDigit( )` method which would return the last digit. If the last digit is 10, append ‘X’ to the original string else append the digit itself’ and display the ISBN number. [ISBN.java](/FAT-Practice/src/ISBN.java)

19. VIT honors its employees with 100% attendance in an academic year with a certificate of appreciation. Assume there are 2000 employees. Create an array to store their attendance percentage. The array can be populated with random numbers. Create two threads so that thread1 determines the total count of employees eligible for certificate in the first half of the array and thread2 in second half of the array. The `main( )` has to wait till both the threads complete their task and arrive at a final count indicating the total number of employees eligible for the certificate of appreciation. [VIThonors.java](/FAT-Practice/src/VITHonors.java)

20. Write a function that merges two sorted arrays in descending order. This code will take the following inputs in the sequence mentioned here: 
    * The size of the first sorted array.
    * The size of the second sorted array.
    * Elements of the first sorted array.
    * Elements of the second sorted array.
[merge_sorted_arrays.java](/extra-assignment/src/merge_sorted_arrays.java)

21. Find the first positive integer `M` (where `1 <= M <= N`) such that when `M` is used as the array index, the result from the array is the the integer `M` itself. i.e. `A[M] = M`
    * With a known length `N`
    * The array is sorted in an ascending order
    * The array holds distinct integers (i.e. there are no repeating numbers)
    * The array is 1-indexed, i.e. the first element is stored in `A[1]` (not `A[0]`)
[binay_index_search.java](/extra-assignment/src/binay_index_search.java)

## Contributions
* Initial Author - [jacob5412](github.com/jacob5412)
* [varunreddy24](github.com/varunreddy24)
    - [Extra Questions (Practice)](#extra-questions-practice) - Question 8
* [Mariamsvarkey](github.com/Mariamsvarkey)
    - [Extra Questions (Practice)](#extra-questions-practice) - Question 16
