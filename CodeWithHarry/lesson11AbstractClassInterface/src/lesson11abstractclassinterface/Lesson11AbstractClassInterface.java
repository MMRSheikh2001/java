/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson11abstractclassinterface;

import lesson11abstractclassinterface.PracSet.Human;
import lesson11abstractclassinterface.PracSet.Monkey;
import lesson11abstractclassinterface.PracSet.SmartPhone;
import lesson11abstractclassinterface.PracSet.TelePhone;

/**
 *
 * @author Administrator
 */
public class Lesson11AbstractClassInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelePhone tp = new SmartPhone();
        tp.ring();
        tp.lift();
        tp.disconnect();

        Monkey m = new Human();
        m.bite();
        m.jump();

    }

}
