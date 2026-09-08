package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");

        String password = scanner.nextLine();


        String regex =
                "^(?=.*[A-Z])"
                + "(?=.*[a-z])"
                + "(?=.*\\d)"
                + "(?=.*[@#$%^&+=!])"
                + ".{8,}$";


        if (Pattern.matches(regex, password)) {

            System.out.println("Strong password");

        } else {

            System.out.println(
                    "Password does not meet the required pattern"
            );
        }


        scanner.close();
    }
}