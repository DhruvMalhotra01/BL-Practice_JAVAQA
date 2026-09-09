import java.util.Set;
import java.util.TreeSet;

public class Problem09_TreeSet {

    public static void main(String[] args) {

        Set<Integer> numbers =
                new TreeSet<>();


        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(3);
        numbers.add(29);


        System.out.println(numbers);
    }
}