import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem04_UsernameValidation {

    public static void main(String[] args) {

        String username = "Dhruv_123";

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {

            System.out.println("Valid Username");

        } else {

            System.out.println("Invalid Username");
        }
    }
}