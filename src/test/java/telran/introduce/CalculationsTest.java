package telran.introduce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static telran.introduce.Calculations.divide;
import static telran.introduce.Calculations.isDividedOn;
import static telran.introduce.Calculations.maxDigit;
import static telran.introduce.Calculations.subtract;
import static telran.introduce.Calculations.sum;
import static telran.introduce.Calculations.sumOfDigits;


public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(0, sum(2, -2));
        assertEquals(-5, sum(-2, -3));
    }
    @Test
    void subtractTest() {
        assertEquals(0, subtract(2, 2));
        assertEquals(4, subtract(2, -2));
        assertEquals(1, subtract(-2, -3));
    }
    @Test
    void divideTest() {
        assertEquals(1, divide(2, 2));
        assertEquals(-1, divide(2, -2));
        assertEquals(0, divide(-2, -3));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }
    @Test
    void maxDigitTest() {
        assertEquals(3, maxDigit(-123));
        assertEquals(3, maxDigit(123));
        assertEquals(0, maxDigit(0));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(-123));
        assertEquals(6, sumOfDigits(123));
        assertEquals(0, sumOfDigits(0));
    }
    @Test
    void isDividedOnTest() {
        assertTrue(isDividedOn(10, 2));
        assertTrue(isDividedOn(-10, 2));
        assertFalse(isDividedOn(10, 0));
        assertFalse(isDividedOn(10, 3));
    }


    
}
