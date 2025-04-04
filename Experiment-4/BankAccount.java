import java.util.Scanner;
class BankAccount {
    private double balance;  // private variable
    public void deposit(double amount) {        // Public method to deposit funds
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    protected void withdraw(double amount) {        // Protected method to withdraw funds
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void checkBalance() {       // Default access method to check the balance
        System.out.println("Current balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();        //BankAccount object
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit:");
        double dep= scanner.nextDouble();
        account.deposit(dep);
        account.checkBalance();
        System.out.print("Enter the amount you want to withdraw:");
        double debit= scanner.nextDouble();
        account.withdraw(debit);
        account.checkBalance();
    }
}
