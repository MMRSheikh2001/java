/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class FileWork {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\fileJavaPrac.txt");

        if (file.exists()) {
            System.out.println(file.getName() + " exists");
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNext()) {
                    System.out.println(sc.next());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileWork.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Not exist");
        }
    }
}
