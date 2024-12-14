import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class TestOperation {

    //  Operation<Number> t = new Operation<>();

    @Test
    @DisplayName("Test add two positive numbers")
    void congSoAm() {
        // NOTE: Arrange
        Operation<Number> t;
        // NOTE: Act
        t = new Operation<>(-5, -10);
        String result = Operation.formatResult(t.add());
        // NOTE: Assert
        assertEquals("-15", result, "5 + 10 = 15");
    }

    @Test
    void congSoHonHop() {
        Operation<Number> t = new Operation<>(-5, 10);
        String result = Operation.formatResult(t.add());
        assertEquals("5", result);
    }

    @Test
    void truSoAm() {
        Operation<Number> t = new Operation<>(-5, -10);
        String result = Operation.formatResult(t.minus());
        assertEquals("5", result);
    }

    @Test
    void truSoHonHop() {
        Operation<Number> t = new Operation<>(10, -5);
        String result = Operation.formatResult(t.minus());
        assertEquals("15", result);
    }

    @Test
    void nhanSo0() {
        Operation<Number> t = new Operation<>(5, 0);
        String result = Operation.formatResult(t.multiply());
        assertEquals("0", result);
    }

    @Test
    void nhanSoAm() {
        Operation<Number> t = new Operation<>(-5, -3);
        String result = Operation.formatResult(t.multiply());
        assertEquals("15", result);
    }

    @Test
    void nhanSoHonHop() {
        Operation<Number> t = new Operation<>(-5, 3);
        String result = Operation.formatResult(t.multiply());
        assertEquals("-15", result);
    }

    @Test
    void chiaSoAm() {
        Operation<Number> t = new Operation<>(-10, -2);
        String result = Operation.formatResult(t.divide());
        assertEquals("5", result);
    }

    @Test
    void chiaSoHonHop() {
        Operation<Number> t = new Operation<>(10, -2);
        String result = Operation.formatResult(t.divide());
        assertEquals("-5", result);
    }

    @Test
    void chiaKetQuaThapPhan() {
        Operation<Number> t = new Operation<>(7, 2);
        String result = Operation.formatResult(t.divide());
        assertEquals("3.5", result);
    }

    @Test
    void tinhSoLon() {
        Operation<Number> t = new Operation<>(new BigDecimal("10000000000000000"), new BigDecimal("1000000000000000"));
        String resultAdd = Operation.formatResult(t.divide());
        assertEquals("10", resultAdd);
    }

    @Test
    void chiaVoiSoCucNho() {
        Operation<Number> t = new Operation<>(0.0001, 0.0002);
        String result = Operation.formatResult(t.divide());
        assertEquals("0.5", result);
    }

    @Test
    void chiaVoiChinhNo() {
        Operation<Number> t = new Operation<>(1, 1);
        String result = Operation.formatResult(t.divide());
        assertEquals("1", result);
    }

    @Test
    void congVoiSo0() {
        Operation<Number> t = new Operation<>(0, 10);
        String result = Operation.formatResult(t.add());
        assertEquals("10", result);
    }

    @Test
    void chiaVoiSo1() {
        Operation<Number> t = new Operation<>(10, 1);
        String result = Operation.formatResult(t.divide());
        assertEquals("10", result);
    }

    @Test
    void divideByZero() {
        Operation<Number> t = new Operation<>(10, 0);
        Exception exception = assertThrows(ArithmeticException.class,
                () -> t.divide());
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}
