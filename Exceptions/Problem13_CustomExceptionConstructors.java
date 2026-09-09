package Exceptions;

class InvalidInputException
        extends Exception {

    // Default constructor
    public InvalidInputException() {

        super("Invalid input");
    }


    // Parameterized constructor
    public InvalidInputException(String message) {

        super(message);
    }
}


public class Problem13_CustomExceptionConstructors {

    public static void main(String[] args) {

        try {

            throw new InvalidInputException();

        }
        catch (InvalidInputException e) {

            System.out.println(
                    "Default constructor: "
                    + e.getMessage()
            );
        }


        try {

            throw new InvalidInputException(
                    "Age cannot be negative"
            );

        }
        catch (InvalidInputException e) {

            System.out.println(
                    "Parameterized constructor: "
                    + e.getMessage()
            );
        }
    }
}
