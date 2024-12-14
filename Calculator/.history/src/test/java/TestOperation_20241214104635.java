/**
 * Additional test cases for the Operation class.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOperation {

    Operation<Number> t = new Operation<>();

    @Test
    void congSoAm() {
        t = new Operation<>(-5, -10);
        String result = t.formatResult(t.add());
        assertEquals("-15", result);
    }

    @Test
    void congSoHonHop() {
        t = new Operation<>(-5, 10);
        String result = t.formatResult(t.add());
        assertEquals("5", result);
    }

    @Test
    void truSoAm() {
        t = new Operation<>(-5, -10);
        String result = t.formatResult(t.minus());
        assertEquals("5", result);
    }

    @Test
    void truSoHonHop() {
        t = new Operation<>(10, -5);
        String result = t.formatResult(t.minus());
        assertEquals("15", result);
    }

    @Test
    void nhanSo0() {
        t = new Operation<>(5, 0);
        String result = t.formatResult(t.multiply());
        assertEquals("0", result);
    }

    @Test
    void nhanSoAm() {
        t = new Operation<>(-5, -3);
        String result = t.formatResult(t.multiply());
        assertEquals("15", result);
    }

    @Test
    void nhanSoHonHop() {
        t = new Operation<>(-5, 3);
        String result = t.formatResult(t.multiply());
        assertEquals("-15", result);
    }

    @Test
    void chiaSoAm() {
        t = new Operation<>(-10, -2);
        String result = t.formatResult(t.divide());
        assertEquals("5", result);
    }

    @Test
    void chiaSoHonHop() {
        t = new Operation<>(10, -2);
        String result = t.formatResult(t.divide());
        assertEquals("-5", result);
    }

    @Test
    void chiaKetQuaThapPhan() {
        t = new Operation<>(7, 2);
        String result = t.formatResult(t.divide());
        assertEquals("3.5", result);
    }

    @Test
    void tinhSoLon() {
        t = new Operation<>(1_000_000, 2_000_000);
        String resultAdd = t.formatResult(t.add());
        assertEquals("3000000", resultAdd);

        String resultMultiply = t.formatResult(t.multiply());
        assertEquals("2000000000000", resultMultiply);
    }
    @Test
    void chiaVoiSoCuaNho() {
        t = new Operation<>(0.0001, 0.0002);
        String result = t.formatResult(t.divide());
        assertEquals("0.5", result);
    }

    @Test
    void chiaVoiChinhNo() {
        t = new Operation<>(1, 1);
        String result = t.formatResult(t.divide());
        assertEquals("1", result);
    }

    @Test
    void congVoiSo0() {
        t = new Operation<>(0, 10);
        String result = t.formatResult(t.add());
        assertEquals("10", result);
    }

    @Test
    void chiaVoiSo1() {
        t = new Operation<>(10, 1);
        String result = t.formatResult(t.divide());
        assertEquals("111", result);
    }
}
