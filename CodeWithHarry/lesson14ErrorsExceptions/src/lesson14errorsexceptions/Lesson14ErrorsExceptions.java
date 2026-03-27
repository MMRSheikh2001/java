/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson14errorsexceptions;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson14ErrorsExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException a) {
            System.out.println("arith ex");

        } catch (Exception e) {
        }

    }
}
