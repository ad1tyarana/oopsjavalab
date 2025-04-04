class Student {
    String name;
    int age;
    public Student() {             // Default constructor
        this.name = "Unknown";
        this.age = 18;
    }
    public Student(String name, int age) {      // Parameterized constructor
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("HARSH VARDHAN", 20);
        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println("\nStudent 2 Details:");
        student2.display();
    }
}
