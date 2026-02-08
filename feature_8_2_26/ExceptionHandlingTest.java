package feature_8_2_26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivideByZeroThrowsException() {

        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    mathUtils.divide(10, 0);
                });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivideNormally() {
        assertEquals(5, mathUtils.divide(10, 2));
    }
}

class MathUtils {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

