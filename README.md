# Student Database Management System
This program allows users to create and manage a database of student records. It provides the following features:

- Create new student records
- Enroll students in courses
- View and pay tuition balances
- View personal and enrollment information for each student

## Usage
To use the Student Database Application, follow these steps:

- Download the source code and open it in a Java development environment such as Eclipse or IntelliJ.
- Run the StudentDatabaseApp class to start the program.  
    To run the StudentDatabaseApp class, you will need to have the Java Development Kit (JDK) installed on your computer.
    1. Open a terminal or command prompt.
    2. Navigate to the directory where the StudentDatabaseApp.java file is located.
    3. Run the javac command to compile the Java source code into a class file:
    ~~~
    javac StudentDatabaseApp.java
    ~~~
    This will create a new StudentDatabaseApp.class file in the directory.
    4. Run the java command to start the program:
    ~~~
    java StudentDatabaseApp.class
    ~~~
- Follow the prompts to add new students to the database, enroll them in courses, and pay tuition.
- At any time, you can view the summary information for a student by entering their ID.
- When you are finished, you can exit the program by entering 'Q' at the appropriate prompt.

Here is an example of how to use the program:
~~~
Number of Students to add: 2

---------------------------------------------
First Name: John
Last Name: Smith
(1=>Freshmen | 2=>Sophomore | 3=>Junior | 4=>Senior)
Class Level: 1
Enter course to enroll (Q to quit): Math
Enter course to enroll (Q to quit): English
Enter course to enroll (Q to quit): Q
Current Balance: $1200
Tuition Payment: $1000
Thank you for your payment of $1000
Current Balance: $200

---------------------------------------------
First Name: Jane
Last Name: Doe
(1=>Freshmen | 2=>Sophomore | 3=>Junior | 4=>Senior)
Class Level: 4
Enter course to enroll (Q to quit): History
Enter course to enroll (Q to quit): Science
Enter course to enroll (Q to quit): Q
Current Balance: $1800
Tuition Payment: $1800
Thank you for your payment of $1800
Current Balance: $0

Name: John Smith
Class Level: 1
Student ID: 11002
Courses Enrolled: 
  Math
  English
Balance: $200

Name: Jane Doe
Class Level: 4
Student ID: 14003
Courses Enrolled: 
  History
  Science
Balance: $0
~~~

## Limitations
There are a few limitations to the current version of the Student Database Application:

- It can only store and manage a fixed number of student records at a time. If the database becomes full, no more students can be added until some records are deleted or the program is modified to increase the maximum number of students.
- It does not have any security measures in place to prevent unauthorized access or tampering with the student records.
- It does not have any provisions for handling errors or invalid input, such as when a user enters a non-numeric value when a number is expected.
- It does not have any means of storing or retrieving student records between sessions, so all data is lost when the program is closed.
- It does not have any means of generating reports or performing advanced searches on the student records.

## Conclusion
The Student Database Application is a useful tool for creating and managing a database of student records. It allows users to add new students, enroll them in courses, view and pay tuition balances, and view a summary of each student's personal and enrollment information. While it has some limitations, it provides a solid foundation for further development and customization. With a few additional features and some proper handling of errors and security, it could be a powerful tool for schools and educational institutions.
