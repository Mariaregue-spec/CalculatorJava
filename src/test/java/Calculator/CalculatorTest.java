package Calculator;

import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class CalculatorTest {

        @Test
        void testSumar() {
            Calculator calculator = new Calculator();
            int resultado = calculator.sumar(2,3);
            assertEquals(5, resultado);
        }

    }

