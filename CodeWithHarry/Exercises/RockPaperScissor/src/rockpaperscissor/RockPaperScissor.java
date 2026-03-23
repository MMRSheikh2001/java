/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your Sign \n0 = Rock \n1 = Paper \n2= Scissor");
        int user = sc.nextInt();
        int comp = (int) (Math.random() * 10);
        comp = comp % 3;
        System.out.println(comp);
        int userWin = 0;
        int compWin = 0;
        int count = 0;
        while (count < 5) {
            if (user == comp) {
                System.out.println("It's a draw");
            } else if ((comp == 0 && user == 1) || (comp == 1 && user == 2) || (comp == 2 && user == 0)) {
                System.out.println("You win");
                userWin++;
            } else if (user > 2 || user < 0) {
                System.out.println("Invalid");
                continue;
            } else {
                System.out.println("Computer Wins");
                compWin++;
            }
            count++;
            user = sc.nextInt();
            comp = (int) (Math.random() * 10);
        }
        System.out.println("You won " + userWin + " times And \nComputer won " + compWin + " times");
        if (userWin == compWin) {
            System.out.println("It's overall draw");
        } else if (userWin > compWin) {
            System.out.println("It's overall win for you");
        } else {
            System.out.println("It's overall loss for you");
        }

    }

}
