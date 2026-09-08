package junit;

public class StringUtils {

    public String reverse(String text) {

        return new StringBuilder(text)
                .reverse()
                .toString();
    }


    public boolean isPalindrome(String text) {

        String reversed = reverse(text);

        return text.equalsIgnoreCase(reversed);
    }
}