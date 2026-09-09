package Exceptions;

public class Problem08_ThrowKeyword {
    static void validateAge(int age){
        if(age < 0){
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
        }
        System.out.print("age is" + age);
    }
    public static void main(String[] args){
        try{
            validateAge(-5);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
