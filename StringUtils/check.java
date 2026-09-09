package StringUtils;
import java.util.*;
public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string");
        String s = sc.next();
        System.out.print(isPalindrome(s)?"True" : "False");
    }
    public static boolean isPalindrome(String s){
        int right = s.length()-1;
        int left = 0;
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
