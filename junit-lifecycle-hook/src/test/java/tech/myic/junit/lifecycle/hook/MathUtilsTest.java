package tech.myic.junit.lifecycle.hook;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void addTest() {
        MathUtils mu = new MathUtils();
        int a = 1;
        int b = 1;
        int result = mu.add(a, b);
        assertEquals(2, result, "Addition of two numbers");
    }

    @Test
    public void substractTest() {
        MathUtils mu = new MathUtils();
        int a = 1;
        int b = 1;
        int result = mu.substract(a, b);
        assertEquals(0, result, "Subtraction of two numbers");
    }

    @Test
    public void multiplyTest() {
        MathUtils mu = new MathUtils();
        int a = 1;
        int b = 1;
        int result = mu.multiply(a, b);
        assertEquals(1, result, "Subtraction of two numbers");
    }

    @Test
    public void divideTest_throw() {
        MathUtils mu = new MathUtils();
        int a = 1;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> mu.divide(a, b));
    }
    
    @Test
    public void divideTest() {
        MathUtils mu = new MathUtils();
        int a = 1;
        int b = 1;
        assertEquals(1, mu.divide(a, b));
    }
}
