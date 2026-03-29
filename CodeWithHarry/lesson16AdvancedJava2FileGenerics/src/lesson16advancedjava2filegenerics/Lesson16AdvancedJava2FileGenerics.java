/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson16advancedjava2filegenerics;

/**
 *
 * @author Administrator
 */
public class Lesson16AdvancedJava2FileGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Annoymonous Class

        System.out.println(sum(12, 13));

        Shape s = new Shape() {
            @Override
            public double getArea(double radius) {
                return super.getArea(radius); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

        };
        System.out.println(s.getArea(13));
    }

    @Deprecated
    public static int sum(int a, int b) {

        return a + b;
    }

}

abstract class Shape {

    public double getArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

}
