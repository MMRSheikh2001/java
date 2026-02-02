/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb2;

/**
 *
 * @author Mahbub
 */
public class arrayAreaOfCircle {
    
    public static void main(String[] args) {
        float radius[] = new float[5];
        radius[0]= 12;
        radius[1]= 15;
        radius[2]= 120;
        radius[3]= 123;
        radius[4]= 62;
        
        for(float item : radius){
            System.out.println(""+ calculateArea(item));
        }
        
    }
    
    public static double calculateArea(float radius){
    double area = Math.PI * radius * radius;
    return area;
    }
    
}
