class Worker {
    protected String name;
    protected double salaryRate;
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours) {
        return salaryRate * hours;
    }
    public void display() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: $" + salaryRate + " per hour");
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return salaryRate * daysWorked * 8;
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int hours) {
        return salaryRate * 40; 
    }
}
public class WorkerMain {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John Doe", 15.0);
        SalariedWorker salariedWorker = new SalariedWorker("Alice Smith", 20.0);
        System.out.println("Daily Worker:");
        dailyWorker.display();
        System.out.println("Weekly Pay (for 48 hours worked): $" + dailyWorker.computePay(48)); 
        System.out.println();
        System.out.println("Salaried Worker:");
        salariedWorker.display();
        System.out.println("Weekly Pay (for any hours): $" + salariedWorker.computePay(50)); 
    }
}
