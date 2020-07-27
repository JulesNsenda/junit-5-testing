/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.exception.handling;

/**
 *
 * @author jules
 */
public class MathUtils {

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Invalid denominator");
        }
        return a / b;
    }

}
