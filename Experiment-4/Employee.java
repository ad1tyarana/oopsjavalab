import java.util.Scanner;
class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double salary;
    static int totalEmployees = 0;
    static double Total_salary=0;
    public Employee() {
        this.employeeID = "Unknown";
        this.name = "Unknown";
        this.department = "Unknown";
        this.salary = 0.0;
        totalEmployees++;
    }
    public Employee(String employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
        Total_salary+=salary;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void displayTotalEmployees() {
        System.out.println("\nTotal number of employees: " + totalEmployees);
        System.out.println("Total expenditure by the company: " + Total_salary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[numberOfEmployees];
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            String empID = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(empID, name, department, salary);
        }
        Employee.displayTotalEmployees();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Information:");
            employees[i].displayEmployeeInfo();
        }
        scanner.close();
    }
}
