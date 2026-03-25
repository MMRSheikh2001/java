/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8introtooop.PracSet1;

/**
 *
 * @author Administrator
 */
public class Square {

    private double side;

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {

        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

}
