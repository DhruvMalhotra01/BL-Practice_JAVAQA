class Calculator {

    int multiply(int a, int b) {

        return a * b;
    }

    double multiply(double a, double b) {

        return a * b;
    }

    long multiply(long a, long b) {

        return a * b;
    }
}


public class Problem03_OverloadingTypePromotion {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.multiply(2, 3));

        System.out.println(calculator.multiply(2.5, 4.0));

        System.out.println(calculator.multiply(2L, 3L));

        // Type promotion example
        System.out.println(calculator.multiply(2, 3L));
    }
}