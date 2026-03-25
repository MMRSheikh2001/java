/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10inheritance.PracSet;

/**
 *
 * @author Administrator
 */
public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
//A=2πrh+2πr2
        return (2 * Math.PI * getRadius()) * (getRadius() + height);
    }

    public double getVolume() {

        //=πr2h
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

}
