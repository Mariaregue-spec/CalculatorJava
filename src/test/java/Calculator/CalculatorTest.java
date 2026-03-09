package Calculator;

import org.example.Calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "2.0, 3.0, 5.0",
            "-5.0, 2.0, -3.0",
            "2.5, 3.5, 6.0"
    })
    void testAdd(double a, double b, double expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "5.5, 2.0, 3.5",
            "2.0, 5.5, -3.5",
            "-3.0, -2.0, -1.0"
    })
    void testSubtract(double a, double b, double expected) {
        assertEquals(expected, calculator.subtract(a, b));
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2.5, 2.0, 5.0",
            "-2.0, 3.0, -6.0",
            "5.5, 0.0, 0.0"
    })
    void testMultiply(double a, double b, double expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "7.0, 2.0, 3.5",
            "-6.0, 2.0, -3.0",
            "5.5, 0.5, 11.0"
    })
    void testDivide(double a, double b, double expected) {
        assertEquals(expected, calculator.divide(a, b));
    }
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(5.0, 0.0));
    }
}
//        @Test
//        void testSubtractWithDecimals() {
//            Calculator calculator = new Calculator();
//            double result = calculator.subtract(5.5, 2.0);
//            assertEquals(3.5, result);
//        }
//
//        @Test
//        void testSubtractNegativeResult() {
//           Calculator calculator = new Calculator();
//            double result = calculator.subtract(2.0, 5.5);
//            assertEquals(-3.5, result);
//        }
//        @Test
//        void testMultiplyWithDecimals() {
//            Calculator calculator = new Calculator();
//            double result = calculator.multiply(2.5, 2.0);
//            assertEquals(5.0, result);
//        }
//
//        @Test
//        void testMultiplyNegativeResult() {
//          Calculator calculator = new Calculator();
//            double result = calculator.multiply(-2.0, 3.0);
//            assertEquals(-6.0, result);
//        }
//        @Test
//        void testMultiplyByZero() {
//            Calculator calculator = new Calculator();
//            double result = calculator.multiply(5.5, 0);
//            assertEquals(0.0, result);
//        }
//        @Test
//        void testDivideWithDecimals() {
//            Calculator calculator = new Calculator();
//            double result = calculator.divide(7.0, 2.0);
//            assertEquals(3.5, result);
//        }
//
//        @Test
//        void testDivideNegativeResult() {
//            Calculator calculator = new Calculator();
//            double result = calculator.divide(-6.0, 2.0);
//            assertEquals(-3.0, result);
//        }
//        @Test
//        void testDivideByZero() {
//            Calculator calculator = new Calculator();
//            double result = calculator.divide(5.0, 0.0);
//            assertTrue(Double.isInfinite(result));
//        }
//    }

