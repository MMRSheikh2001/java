/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessthenumberoop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GuessGame {

    private int userInput;
    private int computer = (int) ((Math.random()) * 100);
    private int guessAmount;

    public GuessGame() {
    }

    public GuessGame(int userInput, int guessAmount) {
        this.userInput = userInput;
        this.guessAmount = guessAmount;
    }

    public GuessGame(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getGuessAmount() {
        return guessAmount;
    }

    public void setGuessAmount(int guessAmount) {
        this.guessAmount = guessAmount;
    }

    public void guessGame() {

        int count = 1;
        while (count <= guessAmount) {
            Scanner s = new Scanner(System.in);
            System.out.println("Give Number");
            userInput = s.nextInt();

            if (userInput == computer) {
                System.out.println("You Win");
                break;

            } else if (userInput < computer) {

                System.out.println("Your Input is smaller than Actual Number");
                System.out.println("You have " + (guessAmount - count) + " number of chances left");
                count++;
            } else {

                System.out.println("Your Input is bigger than Actual Number");
                System.out.println("You have " + (guessAmount - count) + " number of chances left");
                count++;
            }
        }
        if (count > guessAmount) {
            System.out.println("You Lose");
        }
        System.out.println("The Computer Input was " + computer);

    }

}
