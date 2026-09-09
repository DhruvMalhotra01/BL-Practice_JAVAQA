import java.util.HashSet;
import java.util.Set;

public class Problem07_HashSetDuplicates {

    public static void main(String[] args) {

        int[] numbers = {
                1, 2, 2, 3, 4, 4, 5
        };


        Set<Integer> uniqueNumbers =
                new HashSet<>();


        for (int number : numbers) {

            uniqueNumbers.add(number);
        }


        System.out.println(
                "Unique elements: "
                + uniqueNumbers
        );
    }
}