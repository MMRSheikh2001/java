/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamjava1;

import midtermexamjava1.interfaces.Circle;
import midtermexamjava1.interfaces.Rectangle;

/**
 *
 * @author Admin
 */
public class InterfaceTestMain {

    public static void main(String[] args) {
        Circle c = new Circle(20);
        System.out.println("The area of circle is " + c.getArea());
        System.out.println("The perimeter of circle is " + c.getPerimeter());

        Rectangle r = new Rectangle(12, 15);
        System.out.println("The area of Rectangle is " + r.getArea());
        System.out.println("The perimeter of Rectangle is " + r.getPerimeter());
    }
}
