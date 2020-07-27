/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.maven.surfire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jules
 */
public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testComputeCircleArea() {
        double radius = 12.5;
        MathUtils instance = new MathUtils();
        double expResult = 491.0;
        double result = instance.computeCircleArea(radius);
        assertEquals(expResult, result, "The actual area of the circle");
    }

}
