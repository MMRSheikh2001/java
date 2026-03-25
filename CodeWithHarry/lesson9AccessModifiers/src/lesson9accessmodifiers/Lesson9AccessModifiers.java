/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson9accessmodifiers;

import lesson9accessmodifiers.PracSet.Cylinder;

/**
 *
 * @author Administrator
 */
public class Lesson9AccessModifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder c = new Cylinder(12, 15);
        System.out.println("The volume of Cylinder is " + c.calculateVolume());
        System.out.println("The surface area of Cylinder is " + c.calculateSurfaceArea());

    }

}
