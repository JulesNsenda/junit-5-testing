/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.exception.handling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jules
 */
public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testDivide() {
        int a = 4;
        int b = 0;
        MathUtils instance = new MathUtils();
        assertThrows(ArithmeticException.class, () -> instance.divide(a, b), "This should return an Arithmetic exception");
    }

}
