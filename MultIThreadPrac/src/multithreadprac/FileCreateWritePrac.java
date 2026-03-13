/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class FileCreateWritePrac {

    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\Administrator\\Desktop\\fileCreate.txt");
            f.format("%s %s %s", "1", "Mahbubur", "Rahman \n");
            f.close();
            File x = new File("C:\\Users\\Administrator\\Desktop\\fileCreate.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.print(sc.next()+" ");

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCreateWritePrac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
