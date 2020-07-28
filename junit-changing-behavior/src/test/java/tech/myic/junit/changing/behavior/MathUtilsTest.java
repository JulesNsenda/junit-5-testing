/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.junit.changing.behavior;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

    public MathUtilsTest() {
    }

    private MathUtils instance;

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("Done before all");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("Done after all");
    }

    @BeforeEach
    void init() {
        instance = new MathUtils();
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Cleaning up...");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 1;
        double expResult = 0.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
    }

}
