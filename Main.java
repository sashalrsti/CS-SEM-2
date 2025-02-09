public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("5869786", "Anastasia Larasati", 5000.0);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current balance (Bank Account): $" + account.checkBalance());

        SavingsAccount savings = new SavingsAccount("9786978", "Anastasia Larasati", 2000.0, 0.05);
        savings.deposit(550);
        savings.applyInterest();
        System.out.println("Current balance (Savings Account): $" + savings.checkBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: $" + amount);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void depositSavings(double amount) {
       balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrew: $" + amount);
        } else {
            System.out.println("Please check your balance or enter a valid amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }


    public void applyInterest() {
        double interest = checkBalance() * interestRate;
        depositSavings(interest);
        System.out.println("Amount of interest applied: $" + interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}