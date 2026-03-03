/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamjava1.interfaces;

/**
 *
 * @author Admin
 */
public class Circle implements interfaceTest {

    public double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);

    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;

    }

}
