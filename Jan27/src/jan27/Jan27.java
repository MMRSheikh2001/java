
package jan27;

import java.util.Scanner;


public class Jan27 {

   
    public static void main(String[] args) {
        
//        int i = 10;
//        i++;
//        i*=5;
//       Scanner input = new Scanner(System.in);
//        System.out.println(++i);
//        
//        int j = input.nextInt();
//        
//        System.out.println(i + j);

  //   int year = input.nextInt();

Scanner scanner = new Scanner(System.in);
        System.out.println("Give Radius");
        
        float radius = scanner.nextFloat();
        float areaOfCircle;
        if(radius < 0){
            System.out.println("Invalid Radius");
        } else{
            areaOfCircle = (float)(Math.PI * Math.pow(radius,2 ));
            System.out.println("The area of Circle is : "+ areaOfCircle);
        }
        
        
    }
    
}
