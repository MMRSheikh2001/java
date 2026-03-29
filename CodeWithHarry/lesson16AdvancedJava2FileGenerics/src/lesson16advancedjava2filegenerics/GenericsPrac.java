/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson16advancedjava2filegenerics;

/**
 *
 * @author Administrator
 */
public class GenericsPrac {
    
    public static void main(String[] args) {
        
        Shape<Double> s = new Circle();
        System.out.println(s.getArea(12.4));
        
    }
}

interface Shape<E> {
    
    public double getArea(Double d);
    
}

class Circle implements Shape<Double> {
    
    @Override
    public double getArea(Double d) {
        
        return Math.PI * Math.pow(d, 2);
        
    }
    
}
