import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GPTest {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
       double a = 2.0;
       double b = 3.0;
       double expected = 5.0;
       double result = calculator.sum(a, b);
       assertEquals(expected, result, 0.0001);
    }
    
    @Test
    public void testSubtraction() {
       double a = 5.0;
       double b = 2.0;
       double expected = 3.0;
       double result = calculator.subtraction(a, b);
       assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testFatorialSubtractionIntegration() {
        int a = 5;
        int b = 2;
        int expected = 118;
        int result = (int) calculator.subtraction(calculator.fatorial(a),
                                                calculator.fatorial(b));
        assertEquals(expected, result);
    }

    @Test
    public void testBhaskaraPowIntegration() {
        double a = 2.0;
        double b = 4.0;
        double c = -6.0;
        double expected1 = 1;
        double expected2 = -3;
        double[] result = calculator.bhaskara(a, b, c);
        assertEquals(expected1, result[0], 0.0001);
        assertEquals(expected2, result[1], 0.0001);
        assertEquals(Math.pow(expected1, 2), calculator.pow(result[0], 2), 0.0001);
        assertEquals(Math.pow(expected2, 2), calculator.pow(result[1], 2), 0.0001);
    }
}
