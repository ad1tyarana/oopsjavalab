import java.util.Scanner;
class Course {
    String courseName;
    String courseCode;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int no_subjects = scanner.nextInt();
        scanner.nextLine();
        Course[] courses = new Course[no_subjects];
        for (int i = 0; i < no_subjects; i++) {
            System.out.print("Enter the name of the course: ");
            String course = scanner.nextLine();
            System.out.print("Enter the course code: ");
            String course_code = scanner.nextLine();
            courses[i] = new Course(course, course_code);
        }
        System.out.println("\nCourse Details:");
        for (int i = 0; i < no_subjects; i++) {
            courses[i].displayCourseDetails();
            System.out.println();
        }
        scanner.close();
    }
}
