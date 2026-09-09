package Exceptions;
import java.util.InputMismatchException;

public class Problem03_MultipleCatch {
    public static void main(String[] args){
        int a = 10;
        int b = 2;

        try{
            int c = a/b;
            System.out.println("Result: " + c);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }catch (InputMismatchException e){
            System.out.println("Error: Invalid input.");
        }finally{
            System.out.println("Execution completed.");
        }
    }
}
