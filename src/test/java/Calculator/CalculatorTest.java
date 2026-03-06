package Calculator;

import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class CalculatorTest {

        @Test
        void testAddWithDecimals() {
            Calculator calculator = new Calculator();
            double result = calculator.add(2.5, 3.5);
            assertEquals(6.0, result);
        }

        @Test
        void testAddNegativeResult() {
            Calculator calculator = new Calculator();
            double result = calculator.add(-5.5, 2.0);
            assertEquals(-3.5, result);
        }
        @Test
        void testSubtractWithDecimals() {
            Calculator calculator = new Calculator();
            double result = calculator.subtract(5.5, 2.0);
            assertEquals(3.5, result);
        }

        @Test
        void testSubtractNegativeResult() {
            Calculator calculator = new Calculator();
            double result = calculator.subtract(2.0, 5.5);
            assertEquals(-3.5, result);
        }
        @Test
        void testMultiplyWithDecimals() {
            Calculator calculator = new Calculator();
            double result = calculator.multiply(2.5, 2.0);
            assertEquals(5.0, result);
        }

        @Test
        void testMultiplyNegativeResult() {
            Calculator calculator = new Calculator();
            double result = calculator.multiply(-2.0, 3.0);
            assertEquals(-6.0, result);
        }
        @Test
        void testMultiplyByZero() {
            Calculator calculator = new Calculator();
            double result = calculator.multiply(5.5, 0);
            assertEquals(0.0, result);
        }
        @Test
        void testDivideWithDecimals() {
            Calculator calculator = new Calculator();
            double result = calculator.divide(7.0, 2.0);
            assertEquals(3.5, result);
        }

        @Test
        void testDivideNegativeResult() {
            Calculator calculator = new Calculator();
            double result = calculator.divide(-6.0, 2.0);
            assertEquals(-3.0, result);
        }
        @Test
        void testDivideByZero() {
            Calculator calculator = new Calculator();
            double result = calculator.divide(5.0, 0.0);
            assertTrue(Double.isInfinite(result));
        }
    }

