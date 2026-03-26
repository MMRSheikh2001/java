/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11abstractclassinterface.PracSet;

/**
 *
 * @author Administrator
 */
public class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {

        System.out.println("Human Eating");
    }

    @Override
    public void sleep() {

        System.out.println("Human Sleeping");

    }

    @Override
    public void bite() {
        super.bite(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void jump() {
        super.jump(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
