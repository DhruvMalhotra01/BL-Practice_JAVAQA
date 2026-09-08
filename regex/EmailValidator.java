package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email: ");

        String email = scanner.nextLine();


        String regex =
                "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


        boolean valid = Pattern.matches(regex, email);


        if (valid) {

            System.out.println("Valid email address");

        } else {

            System.out.println("Invalid email address");
        }


        scanner.close();
    }
}