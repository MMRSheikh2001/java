/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb3;

/**
 *
 * @author Admin
 */
public class RockPaperScissorGame {

    public static void main(String[] args) {
        int[] numbers = {3, -1, 7, 0, 9};

        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(n);
        }
    }

}
