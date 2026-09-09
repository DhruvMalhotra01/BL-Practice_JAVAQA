import java.util.HashMap;
import java.util.Map;

public class Problem11_MapEntrySet {

    public static void main(String[] args) {

        Map<String, Integer> students =
                new HashMap<>();


        students.put("Raj", 85);
        students.put("Amit", 92);
        students.put("Neha", 78);


        for (Map.Entry<String, Integer> entry
                : students.entrySet()) {

            System.out.println(
                    "Name: " + entry.getKey()
                    + ", Marks: " + entry.getValue()
            );
        }
    }
}