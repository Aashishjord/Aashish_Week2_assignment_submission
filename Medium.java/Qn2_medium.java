class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrl.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Qn2_medium {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aashish Shrestha", "12345", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayAccountInfo();
        BankAccount account2 = new BankAccount("Lionel Messi", "67890", 2000);
        account2.deposit(1000);
        account2.withdraw(3000);
        account2.displayAccountInfo();
    }
}
