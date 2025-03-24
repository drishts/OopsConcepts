
class BankAccount {
    private double balance; // Private variable (can't be accessed directly)

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Public setter method to modify balance safely
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money safely
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

 public class DataEncapsulationExample2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Creating object with initial balance

        // Accessing balance using getter
        System.out.println("Initial Balance: " + account.getBalance());

        // Modifying balance using deposit and withdraw methods
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

