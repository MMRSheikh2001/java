/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamjava1.interfaces;

/**
 *
 * @author Admin
 */
public class Rectangle implements interfaceTest {

    public double length;
    public double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    

    @Override
    public double getArea() {
        return length * width;

    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);

    }

}
