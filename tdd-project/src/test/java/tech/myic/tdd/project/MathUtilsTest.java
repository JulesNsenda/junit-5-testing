/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.tdd.project;

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
    public void testComputeCircleArea() {
        double radius = 12.5;
        MathUtils instance = new MathUtils();
        double expResult = 490.8738521234052;
        double result = instance.computeCircleArea(radius);
        assertEquals(expResult, result,"Return the area of a circle");
    }

}
