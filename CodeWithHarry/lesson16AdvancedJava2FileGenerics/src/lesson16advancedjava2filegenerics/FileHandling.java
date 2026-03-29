/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson16advancedjava2filegenerics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class FileHandling {

    public static void main(String[] args) {

        File file = new File("practice.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("This a File created with Code with Harry");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);

            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

//       if (file.delete()) {
//
//            System.out.println("File Delected");
//        } else {
//            System.out.println("Couldn't Delete File");
//        }

    }
}
