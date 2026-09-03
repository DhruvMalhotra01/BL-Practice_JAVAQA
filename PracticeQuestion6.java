public class PracticeQuestion6 {

    public static void main(String[] args) {

        int number = 9425;
        int sum = 0;

        do {
            int digit = number % 10;

            sum = sum + digit;

            number = number / 10;

        } while (number != 0);

        System.out.println("Sum of Digits = " + sum);
    }
}