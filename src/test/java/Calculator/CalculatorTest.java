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


    }

