package tech.myic.math.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
