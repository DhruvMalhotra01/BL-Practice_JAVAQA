package Exceptions;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount { 
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance for this withdrawal");
        }
        balance -= amount;
        System.out.println("withdraw successful");
        System.out.println(
                "Remaining balance: " + balance
        );
    }
}

public class Problem11_CustomCheckedException {
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000);
        try{
            account.withdraw(1500);
        }catch(InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException: "+e.getMessage());
        }
    }
}
