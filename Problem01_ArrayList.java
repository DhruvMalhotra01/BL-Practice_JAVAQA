import java.util.ArrayList;

public class Problem01_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After adding: " + fruits);


        // Update an element
        fruits.set(1, "Orange");

        System.out.println("After update: " + fruits);


        // Remove an element
        fruits.remove("Orange");

        System.out.println("After remove: " + fruits);


        // Iterate through the list
        System.out.println("Fruits:");

        for (String fruit : fruits) {

            System.out.println(fruit);
        }
    }
}