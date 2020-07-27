package tech.myic.math.utils.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testAdd_success() {
        System.out.println("add");
        int a = 19;
        int b = 10;
        int expResult = 29;
        int result = MathUtils.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd_fail() {
        int result = MathUtils.add(1290, 0);
        assertNotEquals(1, result);
    }

}
