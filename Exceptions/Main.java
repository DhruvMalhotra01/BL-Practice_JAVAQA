package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 10,b = 0;
        try{
            int c = a / b;
            System.out.print(c);
        }
        catch(InputMismatchException e){
            System.out.print(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.print(e.getMessage());
        }
        finally{
            System.out.print("Code executed");
        }
    }
}
