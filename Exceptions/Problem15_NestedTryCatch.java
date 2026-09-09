package Exceptions;

public class Problem15_NestedTryCatch {
    public static void main(String[] args){
        try{
            System.out.println("Outer try started");
            try{
                int[] numbers = {10,20,30};
                System.out.println(numbers[2]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner catch: Invalid array index");
            }
            int result = 10 / 1;
            System.out.print(result);
        }
        catch(ArithmeticException e){
            System.out.println("Outer catch: Cannot devide by zero");
        }
    }
}
