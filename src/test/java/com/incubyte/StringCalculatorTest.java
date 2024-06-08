package com.incubyte;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    public void testAddMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
    }
    
    @Test
    public void testNewLineAddNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testDifferentDelimitersAddNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,-2,3");
        } catch(IllegalArgumentException e) {
                assertEquals("negative numbers not allowed: -2", e.getMessage());
            throw e;
        }
    }
}
