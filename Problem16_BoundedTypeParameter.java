public class Problem16_BoundedTypeParameter {

    static <T extends Number> T findMax(T[] numbers) {

        T max = numbers[0];


        for (T number : numbers) {

            if (number.doubleValue()
                    > max.doubleValue()) {

                max = number;
            }
        }


        return max;
    }


    public static void main(String[] args) {

        Integer[] numbers = {
                12, 45, 3, 67, 21
        };


        Integer maximum =
                findMax(numbers);


        System.out.println(
                "Maximum = " + maximum
        );
    }
}