

package jan31;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class guess {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a Number between 0 to 9");
        int chance = 3;
        boolean win = false;
        
        while(chance >= 1){
            System.out.println("Enter Your Guess (" + chance + " Chances left)");
            int guessNumber = s.nextInt();
            if(guessNumber == randomNumber){
                System.out.println("You Win!");
                win = true;
                break;
            }
            else if(guessNumber > randomNumber){
                System.out.println("Your Guessed Number is Larger");
            }
            else{
            System.out.println("Your Guessed Number is Smaller");
            }
            chance--;
        }
        if(win == false){
            System.out.println("Better Luck next Time");
        }
    }
    
}
