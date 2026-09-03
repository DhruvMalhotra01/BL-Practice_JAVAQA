;
public class PracticeQuestion5 {

    public static void main(String[] args) {

        int number = 121;

        String str = Integer.toString(number);
        System.out.print(str.equals(new StringBuilder(str).reverse().toString()));
        // int original = number;
        // int reversed = 0;

        // do {
        //     int digit = number % 10;

        //     reversed = reversed * 10 + digit;

        //     number = number / 10;

        // } while (number != 0);

        // if (original == reversed) {
        //     System.out.println(original + " is a palindrome number");
        // } else {
        //     System.out.println(original + " is not a palindrome number");
        // }
    }
}