public class Problem07_MaskCardNumber {

    public static void main(String[] args) {

        String cardNumber = "1234567812345678";

        String maskedNumber =
                cardNumber.substring(0, cardNumber.length() - 4)
                         .replaceAll("\\d", "*")
                + cardNumber.substring(cardNumber.length() - 4);

        System.out.println(maskedNumber);
    }
}