/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5loops;

/**
 *
 * @author Administrator
 */
public class BreakContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Using continue");
                continue;

            }
            System.out.println(i);
        }
    }
}
