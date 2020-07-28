package tech.myic.display.name.disable.method;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        MathUtils instance = new MathUtils();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 0;
        int b = 0;
        MathUtils instance = new MathUtils();
        int expResult = 0;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
    }

    @Test
    @Disabled
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        MathUtils instance = new MathUtils();
        double expResult = 0.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        MathUtils instance = new MathUtils();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
    }

}
