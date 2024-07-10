package telran.introduce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import org.junit.jupiter.api.Test;

import static telran.introduce.Calculations.divide;
import static telran.introduce.Calculations.isDividedOn;
import static telran.introduce.Calculations.maxDigit;
import static telran.introduce.Calculations.multiply;
import static telran.introduce.Calculations.subtract;
import static telran.introduce.Calculations.sum;
import static telran.introduce.Calculations.sumOfDigits;


public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(10, multiply(5, 2));
    }

    @Test
    void divideTest() {
        assertEquals(10, divide(20, 2));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }

    @Test
    void subtractTest() {
        assertEquals(18, subtract(20, 2));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(-123));
    }

    @Test
    void maxDigitTest() {
        assertEquals(4, maxDigit(-143));
    }
    @Test
    void isDividedOnTest() {
        assertEquals(true, isDividedOn(143,143));
    }


    
}
