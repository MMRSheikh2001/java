
package displaytime;

import java.util.Scanner;


public class DisplayTime {

   
    public static void main(String[] args) {
        System.out.println("Enter Second : ");
        Scanner input = new Scanner(System.in);
        
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        
        int second = seconds % 60;
        
        System.out.println(minutes +" Minutes "+ second +" Seconds ");
    }
    
}
