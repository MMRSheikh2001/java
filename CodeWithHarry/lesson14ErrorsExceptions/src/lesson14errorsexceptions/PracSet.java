/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14errorsexceptions;

/**
 *
 * @author Administrator
 */
public class PracSet {

    public static void main(String[] args) {

        try {
            int a = 6 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("HiHi");
        } catch (ArithmeticException a) {
            System.out.println("HaHa");

        }

    }
}
