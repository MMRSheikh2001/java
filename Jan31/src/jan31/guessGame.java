package jan31;

import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Guess Number");
        int guessNumber = s.nextInt();

        int chance = 3;
        boolean flag = true;
        while (chance > 1 && flag) {
            if (guessNumber == randomNumber) {
                System.out.println("You win");
                flag = false;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your Guess Number is Smaller");
                System.out.println("Enter Your Guess Number");
                guessNumber = s.nextInt();

            } else if (guessNumber > randomNumber) {
                System.out.println("Your Guess Number is Larger");
                System.out.println("Enter Your Guess Number");
                guessNumber = s.nextInt();
            }
            chance--;
        }
        System.out.println("The actual Number was " + randomNumber);

    }

}
