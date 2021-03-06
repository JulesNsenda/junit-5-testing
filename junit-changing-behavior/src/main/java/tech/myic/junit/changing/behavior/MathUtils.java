package tech.myic.junit.changing.behavior;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Denominator needs not to be zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}
