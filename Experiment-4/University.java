import java.util.Scanner;
class University {
    static String universityName = "UNIVERSITY OF PETROLEUM AND ENERGY STUDIES"; // Static variable
    String studentName; // Non-static variable
    public University(String studentName) {     // default constructor
        this.studentName = studentName;}
    public static void displayUniversityName() {        //method to display university name
        System.out.println("University: " + universityName);
    }
    public void displayStudentName() {      //method to display student name
        System.out.println("Student: " + studentName);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no_student = scanner.nextInt();
        University[] student = new University[no_student];
        System.out.print("\n");
        scanner.nextLine();
        for (int i = 0; i < no_student; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String S_name = scanner.nextLine();
            student[i] = new University(S_name);
        }
        System.out.print("\n");
        for (int i = 0; i < no_student; i++) {
            University.displayUniversityName(); 
            student[i].displayStudentName();
        }
        universityName = "UPES"; //changing the static variable
        System.out.print("\n");
        for (int i = 0; i < no_student; i++) {
            University.displayUniversityName();
            student[i].displayStudentName();
        }
        scanner.close(); // Close the scanner
    }
}
