
package jan29;

import java.util.Scanner;


public class Jan29 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give Name");
        String nam = s.next();
        
        String first = nam.substring(0, 1).toUpperCase();
        String last = nam.substring(1).toLowerCase();
        String newnam = first + last;
        
        System.out.println("Your name is "+ newnam);
        
    }
    
}
