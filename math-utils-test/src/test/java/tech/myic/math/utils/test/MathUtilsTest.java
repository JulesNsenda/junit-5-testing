/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.math.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jules
 */
public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = MathUtils.add(a, b);
        assertEquals(expResult, result);
    }

}
