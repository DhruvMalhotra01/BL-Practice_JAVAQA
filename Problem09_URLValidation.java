import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem09_URLValidation {

    public static void main(String[] args) {

        String url = "https://www.example.com";

        String regex =
                "^https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/.*)?$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(url);

        if (matcher.matches()) {

            System.out.println("Valid URL");

        } else {

            System.out.println("Invalid URL");
        }
    }
}