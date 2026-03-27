/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lesson11abstractclassinterface.PracSet;

/**
 *
 * @author Administrator
 */
public interface SmartTvRemote extends TvRemote{

    @Override
    public default void turnTvOnOff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void goToInternet();
}
