public class BankingApplication {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);


        try {

            account.deposit(2000);

            account.withdraw(3000);

            account.withdraw(10000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println("Transaction failed: "
                    + e.getMessage());

        }
        finally {

            System.out.println(
                    "Transaction process completed."
            );

            System.out.println(
                    "Final balance: " + account.getBalance()
            );
        }
    }
}