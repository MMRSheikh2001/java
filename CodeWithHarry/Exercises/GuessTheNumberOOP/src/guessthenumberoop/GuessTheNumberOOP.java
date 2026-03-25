/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessthenumberoop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GuessTheNumberOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GuessGame gg = new GuessGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's start the Guess Game ");
        System.out.println("You have to Choose between 0 and 100");

        System.out.println("How Many Guesses do you want?");
        int guessNumber = sc.nextInt();
        gg.setGuessAmount(guessNumber);
        gg.guessGame();

    }

}
