/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb7homeclasspractice;

import feb7homeclasspractice.cubeclass.ElectricityBill;
import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Give the unit of electricity to billed");
        Scanner s = new Scanner(System.in);
        float userInput = s.nextFloat();
        ElectricityBill e = new ElectricityBill();
        e.unitsToBeBilled = userInput;
        System.out.println("Your Electricity Bill is " + e.calculateBill());
    }
}
