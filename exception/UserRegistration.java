package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static void validateUser(String name, int age, String email)
            throws InvalidUserDataException {

        // Validate name
        if (name == null || name.trim().isEmpty()) {

            throw new InvalidUserDataException(
                    "Name cannot be empty"
            );
        }

        // Validate age
        if (age < 0) {

            throw new InvalidUserDataException(
                    "Age cannot be negative"
            );
        }

        // Validate email
        String emailRegex =
                "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (!Pattern.matches(emailRegex, email)) {

            throw new InvalidUserDataException(
                    "Invalid email format"
            );
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();


            validateUser(name, age, email);

            System.out.println("Registration successful!");

        }
        catch (InvalidUserDataException e) {

            System.out.println("Registration failed: " + e.getMessage());

        }
        finally {

            scanner.close();

            System.out.println("Registration process completed.");
        }
    }
}