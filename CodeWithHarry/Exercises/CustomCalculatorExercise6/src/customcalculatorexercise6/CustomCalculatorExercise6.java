/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customcalculatorexercise6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class CustomCalculatorExercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getSum(int... a) {
        int sum = 0;

        for (int item : a) {

            if (item > 100000) {
                
                try {
                    throw new MaxInputException();
                } catch (MaxInputException ex) {
                    Logger.getLogger(CustomCalculatorExercise6.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
             sum += item;
        }
        return sum;
    }

}

class MaxInputException extends Exception {

    @Override
    public String getMessage() {
        return super.getMessage(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
