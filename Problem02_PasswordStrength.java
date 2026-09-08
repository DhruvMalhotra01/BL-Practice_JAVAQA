import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02_PasswordStrength {

    public static void main(String[] args) {

        String password = "Java@123";

        String regex =
                "^(?=.*[A-Z])" +
                "(?=.*[a-z])" +
                "(?=.*\\d)" +
                "(?=.*[@#$%^&+=!])" +
                ".{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {

            System.out.println("Strong Password");

        } else {

            System.out.println("Weak Password");
        }
    }
}