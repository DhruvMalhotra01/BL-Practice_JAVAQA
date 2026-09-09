import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem08_LinkedHashSet {

    public static void main(String[] args) {

        int[] numbers = {
                30, 10, 20, 10, 30, 40
        };


        Set<Integer> hashSet =
                new HashSet<>();


        Set<Integer> linkedHashSet =
                new LinkedHashSet<>();


        for (int number : numbers) {

            hashSet.add(number);

            linkedHashSet.add(number);
        }


        System.out.println(
                "HashSet: " + hashSet
        );


        System.out.println(
                "LinkedHashSet: " + linkedHashSet
        );
    }
}