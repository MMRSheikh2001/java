/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamjava1.classs;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice - regularPrice * 0.1;
        } else {
            return regularPrice;
        }

    }

}
