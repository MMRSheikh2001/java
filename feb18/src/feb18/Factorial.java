/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb18;

/**
 *
 * @author Admin
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int multi = 1;
        //1x2x3x4x5
        for (int i = 1; i <= n; i++) {
            multi = multi * i;
        }
        System.out.println("The Factorial of " + n + " is " + multi);
    }
}
