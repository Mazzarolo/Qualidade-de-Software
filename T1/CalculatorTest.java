import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testPowAndMultiplication() {
        int base = 2;
        int exp = 3;
        int expected = 8;

        int result = calc.pow(base, exp);

        assertEquals(expected, result);
    }
}
