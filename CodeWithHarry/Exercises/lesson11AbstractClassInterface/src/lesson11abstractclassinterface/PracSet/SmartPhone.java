/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11abstractclassinterface.PracSet;

/**
 *
 * @author Administrator
 */
public class SmartPhone extends TelePhone {

    @Override
    public void disconnect() {
        System.out.println("Smart Phone Disconnecting");

    }

    @Override
    public void lift() {

        System.out.println("Smart phone being Lifted");
    }

    @Override
    public void ring() {

        System.out.println("Smart Phone Ringing");
    }

}
