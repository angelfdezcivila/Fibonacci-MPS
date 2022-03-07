import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacci;

    @Test
    public void computeOfZeroReturnZero() {
        int obtainedValue = fibonacci.compute(0);
        int expectedValue = 0;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void computeOfOneReturnOne() {
        int obtainedValue = fibonacci.compute(0);
        int expectedValue = 0;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void computeOfANegativeNumberThrowAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    public void ComputeOfANumberBiggerThan45ThrowAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(46));
    }
}