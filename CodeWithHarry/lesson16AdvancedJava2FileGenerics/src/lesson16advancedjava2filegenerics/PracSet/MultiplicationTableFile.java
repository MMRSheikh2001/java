/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson16advancedjava2filegenerics.PracSet;

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
public class MultiplicationTableFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        File file = new File("multiplicationTable.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(MultiplicationTableFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 1; i <= n; i++) {
                fw.write(i + " x " + n + " = " + i * n);

            }

        } catch (IOException ex) {
            Logger.getLogger(MultiplicationTableFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);

            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MultiplicationTableFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
