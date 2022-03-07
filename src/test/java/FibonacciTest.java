import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setUp(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish (){
        fibonacci = null;
    }

    @Test
    @Order(1)
    @DisplayName("Prueba que al pasarle una posición negativa a la secuencia de Fibonacci lanze un error")
    public void computeOfANegativeNumberThrowAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    @Order(2)
    @DisplayName("Prueba que la posicion 0 de la secuencia de Fibonacci sea 0")
    public void computeOfZeroReturnZero() {
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @Order(2)
    @DisplayName("Prueba que la posicion 1 de la secuencia de Fibonacci sea 1")
    public void computeOfOneReturnOne() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    // Intentar hacerlo parameterizedTest
    @Test
    public void ComputeOfANumberBiggerThanOneMillisThrowAnException() {
        //assertThrows(RuntimeException.class, () -> fibonacci.compute(n));
        assertTimeout(Duration.ofMillis(1), () -> fibonacci.compute(99999));
    }

    @Test
    public void ComputeOfANumberBiggerThanTenMillisThrowAnException() {
        //assertThrows(RuntimeException.class, () -> fibonacci.compute(n));
        assertTimeout(Duration.ofMillis(10), () -> fibonacci.compute(9999999));
    }

    @Test
    public void ComputeOfANumberBiggerThanOneHundredMillisThrowAnException() {
        //assertThrows(RuntimeException.class, () -> fibonacci.compute(n));
        assertTimeout(Duration.ofMillis(100), () -> fibonacci.compute(99999999));
    }

    @Test
    public void ComputeOfANumberBiggerThanOneSecondThrowAnException() {
        //assertThrows(RuntimeException.class, () -> fibonacci.compute(n));
        assertTimeout(Duration.ofSeconds(1), () -> fibonacci.compute(999999999));
    }

    @Test
    public void ComputeOfANumberBiggerThanOneMinuteThrowAnException() {
        //assertThrows(RuntimeException.class, () -> fibonacci.compute(n));
        assertTimeout(Duration.ofSeconds(1), () -> fibonacci.compute(999999999));
    }

    //Si nos fijamos, tanto la posición que recibe la función compute en el caso de un segundo como en el de un minuto
    //es la misma, y al dar los dos tests correctos, el de un minuto sobraría ya que si sabemos que dura menos de un segundo,
    //dura menos de un minuto.
}