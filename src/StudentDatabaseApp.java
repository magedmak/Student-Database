import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many new students we want to add
        System.out.print("Number of Students to add: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        Student [] studentsList = new Student[numberOfStudents];


        // Create n number of new students
        for(int i=0; i<numberOfStudents; i++){
            studentsList[i] = new Student();
            studentsList[i].enroll();
            studentsList[i].payTuition();

        }
        for(int i=0; i<numberOfStudents; i++) studentsList[i].showInfo();
    }
}
