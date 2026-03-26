/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12packages.PracSet;

/**
 *
 * @author Administrator
 */
public class Calculator {

    public int sum(int... a) {

        int sum = 0;
        for (int item : a) {

            sum += item;
        }
        return sum;
    }
}
