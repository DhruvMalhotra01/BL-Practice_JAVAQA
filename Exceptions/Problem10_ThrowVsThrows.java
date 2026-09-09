package Exceptions;

public class Problem10_ThrowVsThrows {
    static void checkAge(int age) throws Exception{
        if(age < 18){
            throw new Exception("Age must be 18 above");
        }
        System.out.print("You are eligible");
    }
    public static void main(String[] args){
        try{
            checkAge(16);
        }
        catch(Exception e){
            System.out.print("Exception"+e.getMessage());
        }
    }
}
