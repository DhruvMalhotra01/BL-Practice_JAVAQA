public class PracticeQuestion7 {

    public static void main(String[] args) {

        int[] arr = {12, 45, 3, 67, 21};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}