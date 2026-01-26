package firstjavaprogram;

import java.util.Scanner;

public class FirstJavaProgram {

    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//          Scanner output =new Scanner(System.in);
//        
//        System.out.println("Please Enter Radius ");
//        
//        float radius = input.nextFloat();
//        
//        float area;
//        
//        double perimeter;
//        
//        
//        System.out.println("Radius is : "+ radius);
//        
//       perimeter =  2*radius*3.14159;
////        
//        System.out.println("Perimeter of the circle is : " + perimeter);
//
//        area = (float) 3.14159 * radius * radius;
//        System.out.println("Area of the circle is : " + area);
        System.out.println("What is your name?");
        Scanner output = new Scanner(System.in);

        String names = output.nextLine();

        System.out.println("My name is " + names);

    }

}
