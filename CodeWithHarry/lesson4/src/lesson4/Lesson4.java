/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Age");
        double age = sc.nextDouble();
        sc.close();
        if (age > 0) {
            if (age >= 18) {
                System.out.println("You can drive");
            } else {
                System.out.println("You can't drive");
            }
        } else {
            System.err.println("Invalid Age");
        }
    }

}
