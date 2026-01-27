
package jan27;

import java.util.Scanner;


public class homePractice {
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter Username");
         String userName = scanner.nextLine();
         
         if(userName.equalsIgnoreCase("mahbub")){
             System.out.println("Give Password");
             String password = scanner.nextLine();
             if(password.equals("Mahbub22")){
                 System.out.println("Welcome " + userName);
             } else {
                 System.out.println("Incorrect Password");
             }
         }
         else {
             System.out.println("Username Not found");
         }
         
     }
    
}
