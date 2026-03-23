/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5loops;

/**
 *
 * @author Administrator
 */
public class PracticeSet {

    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
        System.out.println("Using While Loop");
        int i = 4;
        while (i >= 0) {
            int j = 0;
            while (j < i) {

                System.out.print("*\t");
                j++;
            }
            System.out.println("");

            i--;
        }
    }
}
