import java.util.List;

public class Problem17_UpperBoundedWildcard {

    static double sumOfList(
            List<? extends Number> numbers) {

        double sum = 0;


        for (Number number : numbers) {

            sum += number.doubleValue();
        }


        return sum;
    }


    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 20, 30);


        double sum = sumOfList(numbers);


        System.out.println(
                "Sum = " + sum
        );
    }
}