
package jan26;

import java.util.Scanner;


public class Jan26 {

  
    public static void main(String[] args) {
        System.out.println("Give 1st Number ");
        Scanner outputa = new Scanner(System.in);
        float numbera = outputa.nextFloat();
        
        System.out.println("Give 2nd Number ");
        Scanner outputb = new Scanner(System.in);
        float numberb = outputb.nextFloat();
        
        double numberc = numbera + numberb;
        System.out.println("The sum is : " + numberc);
    }
    
}
