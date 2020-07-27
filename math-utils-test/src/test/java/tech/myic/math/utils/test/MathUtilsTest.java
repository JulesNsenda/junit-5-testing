package tech.myic.math.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    public MathUtilsTest() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 19;
        int b = 10;
        int expResult = 29;
        int result = MathUtils.add(a, b);
        assertEquals(expResult, result);
    }

}
