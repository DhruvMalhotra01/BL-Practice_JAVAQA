package Exceptions;

public class Problem01_ArithmeticException {
    public static void main(String[] args){
        int a = 10;
        int b = 1;
        try{
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
