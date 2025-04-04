class Employee {
    protected String name;
    protected int empid;
    protected double salary;
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary increased by " + percentage + "%.");
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
class Manager extends Employee {
    private String department;
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary); 
        this.department = department;
    }
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        System.out.println("Employee Details:");
        emp1.display();
        emp1.increaseSalary(10); 
        System.out.println("Updated Salary: $" + emp1.getSalary());
        System.out.println();
        Manager mgr1 = new Manager("Alice Smith", 201, 70000, "Finance");
        System.out.println("Manager Details:");
        mgr1.display();
        mgr1.increaseSalary(15); 
        System.out.println("Updated Salary: $" + mgr1.getSalary());
    }
}
