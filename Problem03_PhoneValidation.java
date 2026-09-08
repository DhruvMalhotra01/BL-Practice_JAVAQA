import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem03_PhoneValidation {

    public static void main(String[] args) {

        String phone = "+91-9876543210";

        String regex = "^(\\+91[- ]?)?[6-9][0-9]{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {

            System.out.println("Valid Phone Number");

        } else {

            System.out.println("Invalid Phone Number");
        }
    }
}