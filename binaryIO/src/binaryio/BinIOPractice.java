
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
public class BinIOPractice {
    public static void main(String[] args) {
        try {
            FileOutputStream out= new FileOutputStream("C:\\Users\\Admin\\Desktop\\fileIO.txt");
            for(int i=1;i<=100;i++){
            out.write(i);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinIOPractice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinIOPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input= new FileInputStream("C:\\Users\\Admin\\Desktop\\fileIO.txt");
            int value;
            while((value = input.read()) !=-1){
                System.out.println(value);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinIOPractice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinIOPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
