package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-3, 2));
        assertEquals(1, calculator.add(0, 0));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-5, calculator.subtract(2, 7));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calculator.multiply(4, 3));
        assertEquals(-10, calculator.multiply(5, -2));
        assertEquals(0, calculator.multiply(7, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-3, calculator.divide(9, -3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}