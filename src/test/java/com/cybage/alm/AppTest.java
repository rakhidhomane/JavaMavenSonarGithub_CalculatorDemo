package com.cybage.alm;

import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSum() {
        // Given
        App calculator = new App();
        // When
        int result = calculator.sum(2, 2);
        // Then
        Assert.assertEquals(4, result);

        // Test edge cases
        Assert.assertEquals(-3, calculator.sum(-1, -2));
        Assert.assertEquals(0, calculator.sum(0, 0));
        Assert.assertEquals(5, calculator.sum(0, 5));
    }

    @Test
    public void testMinus() {
        App calculator = new App();
        Assert.assertEquals(0, calculator.minus(2, 2));

        // Test edge cases
        Assert.assertEquals(-1, calculator.minus(0, 1));
        Assert.assertEquals(3, calculator.minus(1, -2));
        Assert.assertEquals(-5, calculator.minus(-2, 3));
    }

    @Test
    public void testMultiply() {
        App calculator = new App();
        Assert.assertEquals(6, calculator.multiply(2, 3));

        // Test edge cases
        Assert.assertEquals(0, calculator.multiply(0, 5));
        Assert.assertEquals(-10, calculator.multiply(-2, 5));
        Assert.assertEquals(4, calculator.multiply(-2, -2));
    }

    @Test
    public void testDivide() {
        App calculator = new App();
        Assert.assertEquals(2, calculator.divide(6, 3));

        // Test edge cases
        Assert.assertEquals(0, calculator.divide(0, 3)); // Division of zero
        Assert.assertEquals(-2, calculator.divide(-6, 3));
        Assert.assertEquals(1, calculator.divide(-5, -5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        App calculator = new App();
        calculator.divide(6, 0);
    }

    @Test
    public void testEdgeCases() {
        App calculator = new App();

        // Large values
        Assert.assertEquals(Integer.MAX_VALUE, calculator.sum(Integer.MAX_VALUE, 0));
        Assert.assertEquals(Integer.MIN_VALUE, calculator.minus(Integer.MIN_VALUE, 0));
        Assert.assertEquals(0, calculator.multiply(0, Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MAX_VALUE, calculator.divide(Integer.MAX_VALUE, 1));
    }
}
