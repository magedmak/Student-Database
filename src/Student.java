import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String listOfCourses = "";
    private int tuitionBalance = 0;
    private final int COST_OF_COURSE = 600;
    private static int ID = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.print("First Name: ");
        this.firstName = scan.nextLine();
        System.out.print("Last Name: ");
        this.lastName = scan.nextLine();
        System.out.println("(1=>Freshmen | 2=>Sophomore | 3=>Junior | 4=>Senior)");
        System.out.print("Class Level: ");
        this.gradeYear = scan.nextInt();
        getStudentID();
    }

    // Generate an ID
    public void getStudentID(){
        ID++;
        this.studentID = gradeYear + "" + ID;
    }

    // Enroll in Courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String courseName = scan.nextLine();
            if(!courseName.equals("Q")){
                listOfCourses += "\n  " + courseName;
                tuitionBalance += COST_OF_COURSE;
            }
            else {
                break;
            }
        } while(true);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Current Balance: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("Tuition Payment: $");
        int payment = scan.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public void showInfo(){
        System.out.println("\nName: " + firstName + " " + lastName +
                        "\nClass Level: " + gradeYear +
                        "\nStudent ID: " + studentID +
                        "\nCourses Enrolled: " + listOfCourses +
                        "\nBalance: $" + tuitionBalance);
    }
}
