/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestmarch29;

import classtestmarch29.cls.Circle;
import classtestmarch29.cls.Shape;

/**
 *
 * @author Admin
 */
public class GenericPrac {

    public static void main(String[] args) {
        Shape c = new Circle();
        System.out.println("The area of circle is : " + c.getArea((double)12));
        System.out.println("The Perimeter of circle is : " + c.getPerimeter(12.0));
    }
}
