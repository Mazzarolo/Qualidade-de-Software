import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calc;

    //Gerando uma nova calculadora antes de cada teste, permitindo uma verificação mais limpa
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    //Testes Unitários, verificam o funcionmento de métodos de forma isolada:

    @Test
    public void testSum() {
        double a = 10, b = 4;
        double expected = 14;

        assertEquals(expected, calc.sum(a, b), 0);
    }

    @Test
    public void testSub() {
        double a = 10, b = 4;
        double expected = 6;

        assertEquals(expected, calc.subtraction(a, b), 0);
    }

    @Test
    public void testMult() {
        double a = 10, b = 4;
        double expected = 40;

        assertEquals(expected, calc.multiplication(a, b), 0);
    }

    @Test
    public void testDiv() {
        double a = 10, b = 2;
        double expected = 5;

        assertEquals(expected, calc.division(a, b), 0);
    }

    @Test
    public void testSqrt() {
        double num = 9;
        double expected = 3;

        assertEquals(expected, calc.sqrt(num), 0);
    }

    // Testes de integração, verificando metodos que utilizam outros metodos, ja verificados, e testando-os para ver se funcionma de forma integrada:

    @Test
    public void testPowAndMult() {
        double base = 2, exp = 3;
        double expected = 8;

        assertEquals(expected, calc.pow(base, (int) exp), 0);
    }

    @Test
    public void testFatAndMult() {
        int num = 4;
        int expected = 24;

        assertEquals(expected, calc.fatorial(num));
    }

    @Test
    public void testBhaskara() {
        double a = 1, b = 4, c = 4;
        double r1 = -2, r2;

        assertEquals(r1, calc.bhaskara(a, b, c)[0], 0);

        a = 2;
        b = 7;
        c = 3;

        r1 = -1 / (double) 2;
        r2 = -3;

        assertEquals(r1, calc.bhaskara(a, b, c)[0], 0);
        assertEquals(r2, calc.bhaskara(a, b, c)[1], 0);
    }

    // Testes de Performance, tipos de testes não funcionais que verificam o desempenho de trechos do codigo e se eles estão de acordo com o que é almejado

    @Test
    public void testFatorialPerformance() {
        long startTime = System.nanoTime();

        calc.fatorial(1000000);

        long duration = (System.nanoTime() - startTime);

        assertTrue("Tempo de execução foi superior a 1 segundo", duration < (long) Math.pow(10, 9));
    }
}
