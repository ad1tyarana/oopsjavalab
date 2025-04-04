interface Bank {        // Bank interface
    void deposit(double amount);
    void withdraw(double amount);
}
class Account implements Bank {         // Account class implementing Bank interface
    private double balance;
    public Account(double initialBalance) {     // Constructor to initialize balance
        this.balance = initialBalance;
    }
    @Override           // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override           // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayBalance() {      // Method to display balance
        System.out.println("Current Balance: " + balance);
    }
}
public class BankDemo {     // Main class
    public static void main(String[] args) {
        Account myAccount = new Account(1000); // Initial balance
        System.out.println("Initial Account Balance:");
        myAccount.displayBalance();
        System.out.println();

        myAccount.deposit(500);
        myAccount.displayBalance();
        System.out.println();

        myAccount.withdraw(300);
        myAccount.displayBalance();
        System.out.println();

        myAccount.withdraw(1500); // Attempting to withdraw more than balance
        myAccount.displayBalance();
    }
}
