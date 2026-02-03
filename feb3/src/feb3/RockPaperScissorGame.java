/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RockPaperScissorGame {

    public static void main(String[] args) {
        int random = (int) (10 * Math.random());
        Scanner s = new Scanner(System.in);
        System.out.println("Give the number representing Rock or Paper or Scissor");
        System.out.println("1 = Rock \n2 = Paper \n3 = Scissor");
        int userInput = s.nextInt();

        //11       System.out.println(random);
        if (random == 0 || random == 3 || random == 6 || random == 9) {
            random = 1;
            System.out.println("System says \"Rock\"");
        } else if (random == 1 || random == 4 || random == 7) {
            random = 2;
            System.out.println("System says \"Paper\"");
        } else {
            random = 3;
            System.out.println("System says \"Scissor\"");
        }
        if(userInput == random){
            System.out.println("It's a draw");
        }
        else if((userInput ==1 && random ==3) || (userInput ==2 && random ==1)||(userInput ==3 && random ==2)){
            System.out.println("You Win");
        }
        else{
        System.out.println("You Lose");
                
        }
            
    }

}
