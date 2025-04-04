abstract class Employee {       // Abstract class Employee
    protected String name;
    protected String role;
    public Employee(String name, String role) {     // Constructor
        this.name = name;
        this.role = role;
    }
    public abstract double calculateSalary();       // Abstract methods
    public abstract void displayDetails();
}
class Manager extends Employee {        // Manager class with a fixed salary
    private double fixedSalary;
    public Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + calculateSalary());
    }
}
class Developer extends Employee {      // Developer class with hourly wage
    private double hourlyRate;
    private int hoursWorked;
    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + calculateSalary());
    }
}
public class EmployeeTest {     // Main class to test functionality
    public static void main(String[] args) {
        Manager manager = new Manager("Hemant", 7000);
        Developer developer = new Developer("Deepak", 50, 160);
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();
        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}
