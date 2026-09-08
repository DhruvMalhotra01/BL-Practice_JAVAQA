package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    void testAddition() {

        assertEquals(5, calculator.add(2, 3));

        assertEquals(0, calculator.add(-5, 5));

        assertEquals(-8, calculator.add(-5, -3));
    }


    @Test
    void testSubtraction() {

        assertEquals(2, calculator.subtract(5, 3));

        assertEquals(-8, calculator.subtract(-5, 3));

        assertEquals(5, calculator.subtract(5, 0));
    }


    @Test
    void testMultiplication() {

        assertEquals(6, calculator.multiply(2, 3));

        assertEquals(0, calculator.multiply(10, 0));

        assertEquals(6, calculator.multiply(-2, -3));
    }


    @Test
    void testDivision() {

        assertEquals(2.0, calculator.divide(10, 5));

        assertEquals(-2.0, calculator.divide(-10, 5));
    }


    @Test
    void testDivisionByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}