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
        int random = (int) (10 * Math.random());

        System.out.println(random);

        if (random == 0 || random == 3 || random == 6 || random == 9) {
            random = 0;
        }
    }

}
