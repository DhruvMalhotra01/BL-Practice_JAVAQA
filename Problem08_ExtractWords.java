import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem08_ExtractWords {

    public static void main(String[] args) {

        String sentence = "Java is powerful, simple and object-oriented!";

        Pattern pattern = Pattern.compile("[A-Za-z]+");

        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {

            System.out.println(matcher.group());
        }
    }
}