import java.util.Scanner;
import java.util.regex.Pattern;
public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String regex = "^[6-9]{3}+[0-9]{7}$";
        if (Pattern.matches(regex, number)) {
            System.out.print("Valid Number");
        }else{
            System.out.print("Invalid Number");
        }
    }
}
