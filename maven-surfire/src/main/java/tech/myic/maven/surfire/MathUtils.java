/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.myic.maven.surfire;

/**
 * @author jules
 */
public class MathUtils {

    public double computeCircleArea(double radius) {
        return Math.ceil(Math.PI * Math.pow(radius, 2));
    }

}
