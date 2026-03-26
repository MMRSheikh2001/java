/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11abstractclassinterface.PracSet;

/**
 *
 * @author Administrator
 */
public class FountainPen extends Pen {

    public void changeNib() {

        System.out.println("Changing Nib");
    }

    @Override
    public void refill() {
        super.refill(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void write() {
        super.write(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
