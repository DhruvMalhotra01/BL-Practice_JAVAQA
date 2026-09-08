public class StringUtils {

    public boolean isPalindrome(String text) {

        String reversed = reverse(text);

        return text.equalsIgnoreCase(reversed);
    }


    public String reverse(String text) {

        return new StringBuilder(text).reverse().toString();
    }
}