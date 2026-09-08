package exception;

public class BankAccount {

    private double balance;


    public BankAccount(double balance) {

        this.balance = balance;
    }


    public void deposit(double amount) {

        if (amount <= 0) {

            System.out.println("Deposit amount must be greater than zero");
            return;
        }

        balance += amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }


    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {

            System.out.println("Withdrawal amount must be greater than zero");
            return;
        }

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: " + balance
            );
        }

        balance -= amount;

        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }


    public double getBalance() {

        return balance;
    }
}