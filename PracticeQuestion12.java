public class PracticeQuestion12 {

    public static void main(String[] args) {

        String str = "character";

        int uniqueCount = 0;

        for (char c : str.toCharArray()) {
            uniqueCount ^= c - 'a' + 1;
        }
        System.out.println("Unique character = " + (char) (uniqueCount + 1));

        // int[] frequency = new int[256];

        // // Count frequency of each character
        // for (int i = 0; i < str.length(); i++) {

        //     char ch = str.charAt(i);

        //     frequency[ch]++;
        // }

        // // Find first character with frequency 1
        // for (int i = 0; i < str.length(); i++) {

        //     char ch = str.charAt(i);

        //     if (frequency[ch] == 1) {

        //         System.out.println("First non-repeating character = " + ch);
        //         break;
        //     }
        // }
    }
}