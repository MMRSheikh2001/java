/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12packages.PracSet;

/**
 *
 * @author Administrator
 */
public class ScCalculator {

    public int multiplicate(int... a) {
        int multi = 1;
        for (int item : a) {
            multi *= item;
        }

        return multi;
    }
}
