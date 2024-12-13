/**
 * Additional test cases for the Operation class.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOperation {

    Operation<Number> t = new Operation<>();

    @Test
    void addNegativeNumbers() {
        t = new Operation<>(-5, -10);
        String result = t.formatResult(t.add());
        assertEquals("-15", result);
    }

    @Test
    void addMixedNumbers() {
        t = new Operation<>(-5, 10);
        String result = t.formatResult(t.add());
        assertEquals("5", result);
    }

    @Test
    void subtractNegativeNumbers() {
        t = new Operation<>(-5, -10);
        String result = t.formatResult(t.minus());
        assertEquals("5", result);
    }

    @Test
    void subtractMixedNumbers() {
        t = new Operation<>(10, -5);
        String result = t.formatResult(t.minus());
        assertEquals("15", result);
    }

    @Test
    void multiplyByZero() {
        t = new Operation<>(5, 0);
        String result = t.formatResult(t.multiply());
        assertEquals("0", result);
    }

    @Test
    void multiplyNegativeNumbers() {
        t = new Operation<>(-5, -3);
        String result = t.formatResult(t.multiply());
        assertEquals("15", result);
    }

    @Test
    void multiplyMixedNumbers() {
        t = new Operation<>(-5, 3);
        String result = t.formatResult(t.multiply());
        assertEquals("-15", result);
    }

    @Test
    void divideNegativeNumbers() {
        t = new Operation<>(-10, -2);
        String result = t.formatResult(t.divide());
        assertEquals("5", result);
    }

    @Test
    void divideMixedNumbers() {
        t = new Operation<>(10, -2);
        String result = t.formatResult(t.divide());
        assertEquals("-5", result);
    }

    @Test
    void divideWithDecimalResult() {
        t = new Operation<>(7, 2);
        String result = t.formatResult(t.divide());
        assertEquals("3.5", result);
    }

    @Test
    void largeNumberOperations() {
        t = new Operation<>(1_000_000, 2_000_000);
        String resultAdd = t.formatResult(t.add());
        assertEquals("3000000", resultAdd);

        String resultMultiply = t.formatResult(t.multiply());
        assertEquals("2000000000000", resultMultiply);
    }

    @Test
    void verySmallNumberDivision() {
        t = new Operation<>(0.0001, 0.0002);
        String result = t.formatResult(t.divide());
        assertEquals("0.5", result);
    }

    @Test
    void divideOneByItself() {
        t = new Operation<>(1, 1);
        String result = t.formatResult(t.divide());
        assertEquals("1", result);
    }

    @Test
    void addZeroToNumber() {
        t = new Operation<>(0, 10);
        String result = t.formatResult(t.add());
        assertEquals("10", result);
    }

    @Test
    void divideNumberByOne() {
        t = new Operation<>(10, 1);
        String result = t.formatResult(t.divide());
        assertEquals("10", result);
    }
}
