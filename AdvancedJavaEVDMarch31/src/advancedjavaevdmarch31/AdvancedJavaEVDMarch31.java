/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advancedjavaevdmarch31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AdvancedJavaEVDMarch31 {

    AdvancedJavaEVDMarch31 aj = new AdvancedJavaEVDMarch31();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jeestore";
        String user = "root";
        String password = "1234";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

}
