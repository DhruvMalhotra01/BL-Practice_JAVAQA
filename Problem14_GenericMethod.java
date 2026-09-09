public class Problem14_GenericMethod {

    static <T> void printArray(T[] array) {

        for (T element : array) {

            System.out.println(element);
        }
    }


    public static void main(String[] args) {

        Integer[] numbers = {
                10, 20, 30
        };


        String[] names = {
                "Raj", "Amit", "Neha"
        };


        System.out.println("Numbers:");

        printArray(numbers);


        System.out.println("\nNames:");

        printArray(names);
    }
}