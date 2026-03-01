
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
public class binIO {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\fileWriter.txt");
            for(int i=0;i<=100;i++){
            output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(binIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input= new FileInputStream("C:\\Users\\Admin\\Desktop\\fileWriter.txt");
            int value;
            while((value=input.read()) != -1){
                System.out.print(value+"\t");
                if(value%10==0){
                    System.out.println("");
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(binIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
