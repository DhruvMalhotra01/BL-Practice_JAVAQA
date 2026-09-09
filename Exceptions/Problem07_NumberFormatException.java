package Exceptions;

public class Problem07_NumberFormatException {
    public static void main(String[] args){

        
        String value = "12h3";
        try{
            int number = Integer.parseInt(value);
            System.out.print(number);
        }
        catch(NumberFormatException e){
            System.out.print("not a valid format ");
        }
    }
}
