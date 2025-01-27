public class GradeSheet {
    public static void main(String[] args) {
        // Header with decorative border
        System.out.println("*******************************************");
        System.out.println("\t\tSTUDENT GRADE SHEET");
        System.out.println("*******************************************\n");

        // Student Information
        System.out.println("Student Name:\tAditya Rana");
        System.out.println("Roll Number:\t500122511");
        System.out.println("Batch:\t\tCSE-IOT-1\n");

        // Subject-wise Grades
        System.out.println("*************** GRADES ***************");
        System.out.println("Subject\t\tMarks\tGrade");
        System.out.println("----------------------------------------");
        System.out.println("Mathematics\t85\tB");
        System.out.println("Physics\t\t92\tA");
        System.out.println("Chemistry\t88\tB");
        System.out.println("English\t\t95\tA");
        System.out.println("Computer\t90\tA");
        System.out.println("----------------------------------------\n");

        // Final Result
        System.out.println("**************** RESULT ****************");
        System.out.println("Total Marks:\t450/500");
        System.out.println("Percentage:\t90%");
        System.out.println("Final Grade:\tA");
        System.out.println("*******************************************");
    }
}
