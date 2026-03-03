/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamjava1.classs;

/**
 *
 * @author Admin
 */
public class Vehicle {

    public int speed;
    public double regularPrice;
    public String color;

    public Vehicle() {
    }

    public Vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }

}
