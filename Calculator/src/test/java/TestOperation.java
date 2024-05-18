/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bluez
 */
public class TestOperation {
    Operation<Number> t = new Operation<>();
    
    public TestOperation() {
    }
    
    @Test
    void add2Numbers()
    {
        t = new Operation<>(2, 5);
        String x = t.formatResult(t.add());
        assertEquals(x, "7");
    }
    @Test
    void add2DoubleNumbers()
    {
        t = new Operation<>(2.5, 5.5);
        String x = t.formatResult(t.add());
        assertEquals(x, "8");
    }
    
    
    @Test
    void minus2Numbers()
    {
        t = new Operation<>(2, 5);
        String x = t.formatResult(t.minus());
        assertEquals(x, "-3");
    }
    @Test
    void minus2DoubleNumbers()
    {
        t = new Operation<>(10.5, 5);
        String x = t.formatResult(t.minus());
        assertEquals(x, "5.5");
    }
    
    @Test
    void Mutipli2Numbers()
    {
        t = new Operation<>(10, 20);
        String x = t.formatResult(t.multiply());
        assertEquals(x, "200");
    }
    @Test
    void Mutipli2DoubleNumbers()
    {
        t = new Operation<>(10.5, 5);
        String x = t.formatResult(t.multiply());
        assertEquals(x, "52.5");
    }
    
    
    @Test
    void Division2Numbers()
    {
        t = new Operation<>(20, 2);
        String x = t.formatResult(t.divide());
        assertEquals(x, "10");
    }
    @Test
    void DivisionWithNumber0()
    {
        t = new Operation<>(10, 0);
        String x = t.formatResult(t.divide());
        assertEquals(x, "Infinity");
    }
    
    
}