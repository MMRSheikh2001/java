/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class printWriterPractice {
    public static void main(String[] args) {
      File file= new File("C:\\Users\\Admin\\Desktop\\fileWriter.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i =1;i<101;i++){
            pw.println(i +" \t");
            }
            pw.println();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(printWriterPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
 //   PrintWriter output= new PrintWriter("C:\\Users\\Admin\\Desktop\\fileWriter.txt");
    
    
  
}
