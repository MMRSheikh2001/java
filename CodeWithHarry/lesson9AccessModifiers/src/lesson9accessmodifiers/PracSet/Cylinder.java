/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9accessmodifiers.PracSet;

/**
 *
 * @author Administrator
 */
public class Cylinder {

    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurfaceArea() {
        double surfaceArea = 0;
        //A=2πrh+2πr2

        surfaceArea = (2 * (Math.PI) * radius) * (radius + height);

        return surfaceArea;
    }

    public double calculateVolume() {
        double volume = 0;
        //V=πr2h

        volume = (Math.PI) * (Math.pow(radius, 2)) * height;

        return volume;
    }

}
