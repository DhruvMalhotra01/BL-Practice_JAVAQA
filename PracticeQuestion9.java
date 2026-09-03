public class PracticeQuestion9 {

    public static void main(String[] args) {

        int[] arr = {12, 45, 3, 67, 21};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array Elements = " + sum);
    }
}