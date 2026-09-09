package Exceptions;

class AgeRestriction extends RuntimeException{
    public AgeRestriction(String message){
        super(message);
    }
}

class AgeChecker{
    private int minAge;
    AgeChecker(int minAge){
        this.minAge = minAge;
    }
    void checkage(int age){
        if(age < minAge){
            throw new AgeRestriction("age must be greater than minAge");
        }
        System.out.print("accepted");
    }
}

public class Problem12_CustomUncheckedException {
    public static void main(String[] args){
        AgeChecker ch = new AgeChecker(20);
        try{
            ch.checkage(3);
        }catch(AgeRestriction e){
            System.out.print("Exception : " + e.getMessage());
        }
    }
}
