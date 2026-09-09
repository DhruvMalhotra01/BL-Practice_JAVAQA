import java.util.Map;
import java.util.TreeMap;

public class Problem12_TreeMap {

    public static void main(String[] args) {

        Map<String, Integer> students =
                new TreeMap<>();


        students.put("Raj", 85);
        students.put("Amit", 92);
        students.put("Neha", 78);
        students.put("Dhruv", 90);


        System.out.println(students);
    }
}