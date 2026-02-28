/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BinaryIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\tempFile.txt");
            for(int i=1;i<=100;i++){
            output.write( i);
            
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\tempFile.txt");
            int value ;
            while((value=input.read()) !=-1){
                System.out.println(value +" ");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
