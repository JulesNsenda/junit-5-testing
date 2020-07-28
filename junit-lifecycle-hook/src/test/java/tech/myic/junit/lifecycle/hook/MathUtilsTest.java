package tech.myic.junit.lifecycle.hook;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mu;

    //This is needs to be static to allow Junit to run the @BeforeAll method
    @BeforeAll
    public static void beforeAllInit() {
        System.out.println("Run this before all methods.");
    }
    
    //This is not working...
    @AfterAll
    public static void afterAllInit() {
        System.out.println("Run this after all methods.");
    }

    @BeforeEach
    public void init() {
        mu = new MathUtils();
    }

    @AfterEach
    public void cleanUp() {
        System.out.println("Cleaning up...");
    }

    @Test
    public void addTest() {
        int a = 1;
        int b = 1;
        int result = mu.add(a, b);
        assertEquals(2, result, "Addition of two numbers");
    }

    @Test
    public void substractTest() {
        int a = 1;
        int b = 1;
        int result = mu.substract(a, b);
        assertEquals(0, result, "Subtraction of two numbers");
    }

    @Test
    public void multiplyTest() {
        int a = 1;
        int b = 1;
        int result = mu.multiply(a, b);
        assertEquals(1, result, "Subtraction of two numbers");
    }

    @Test
    public void divideTest_throw() {
        int a = 1;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> mu.divide(a, b));
    }

    @Test
    public void divideTest() {
        int a = 1;
        int b = 1;
        assertEquals(1, mu.divide(a, b));
    }
}
