import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem06_DateValidation {

    public static void main(String[] args) {

        String date = "25-12-2024";

        String regex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {

            System.out.println("Matches the date format");

        } else {

            System.out.println("Does not match the date format");
        }
    }
}