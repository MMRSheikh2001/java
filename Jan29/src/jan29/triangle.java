/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan29;

import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give 1st triangle side length");
        float side1 = s.nextFloat();
        System.out.println("Give 2nd triangle side length");
        float side2 = s.nextFloat();
        System.out.println("Give 3rd triangle side length");
        float side3 = s.nextFloat();
        if(side1 == side2 || side2 == side3 || side1 ==side3){
        if(side1 == side2 && side2 ==side3){
        
            System.out.println("Its a Equilateral Triangle");
        }
        else{
        
            System.out.println("Its a Isosceles Triangle");
        }
        }
        else{
            System.out.println("Its a Scalene Triangle");
        }
    }
    
}
