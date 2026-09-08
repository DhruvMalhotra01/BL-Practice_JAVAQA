public class BankAccount {

    private double balance;


    public BankAccount(double balance) {

        this.balance = balance;
    }


    public void withdraw(double amount) {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        balance = balance - amount;
    }


    public double getBalance() {

        return balance;
    }
}