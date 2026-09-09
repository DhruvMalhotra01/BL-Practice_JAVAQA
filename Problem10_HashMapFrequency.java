import java.util.HashMap;
import java.util.Map;

public class Problem10_HashMapFrequency {

    public static void main(String[] args) {

        String sentence =
                "the cat sat on the mat";


        String[] words =
                sentence.split(" ");


        Map<String, Integer> frequency =
                new HashMap<>();


        for (String word : words) {

            frequency.put(
                    word,
                    frequency.getOrDefault(word, 0) + 1
            );
        }


        System.out.println(frequency);
    }
}