/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestmarch29.cls;

/**
 *
 * @author Admin
 */
public class Circle implements Shape<Double> {

    @Override
    public double getArea(Double e) {

        return Math.PI * Math.pow(e, 2);

    }

    @Override
    public double getPerimeter(Double e) {
        return 2 * Math.PI * e;
    }

}
