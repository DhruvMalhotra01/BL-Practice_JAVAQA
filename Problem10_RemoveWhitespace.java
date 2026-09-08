public class Problem10_RemoveWhitespace {

    public static void main(String[] args) {

        String sentence = "Java    is     very    fun";

        String result = sentence.trim().replaceAll("\\s+", " ");

        System.out.println(result);
    }
}