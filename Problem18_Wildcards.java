import java.util.ArrayList;
import java.util.List;

public class Problem18_Wildcards {


    // ==========================================
    // UNBOUNDED WILDCARD
    // ==========================================

    static void printList(List<?> list) {

        for (Object item : list) {

            System.out.println(item);
        }
    }


    // ==========================================
    // LOWER BOUNDED WILDCARD
    // ==========================================

    static void addNumbers(
            List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }


    public static void main(String[] args) {


        // Unbounded wildcard

        List<String> names =
                List.of("Raj", "Amit", "Neha");


        System.out.println("Names:");

        printList(names);


        // Lower bounded wildcard

        List<Number> numbers =
                new ArrayList<>();


        addNumbers(numbers);


        System.out.println(
                "\nNumbers: " + numbers
        );
    }
}