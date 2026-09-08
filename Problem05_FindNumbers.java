import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem05_FindNumbers {

    public static void main(String[] args) {

        String sentence = "I have 2 apples and 15 oranges";

        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {

            System.out.println(matcher.group());
        }
    }
}