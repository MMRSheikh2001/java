/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapril11;

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
public class EmployeeApril11 {

    static String sql;
    static PreparedStatement ps;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //     save("Mahbub", "12378565", 1234);
        findAll();
        update("Mahbubur", "12876756", 2345, 1);
        delete(3);

    }

    public static Connection getCon() {
        Connection con = null;
        String user = "root";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/homestore";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void save(String name, String cell, double salary) {
        sql = "insert into employee(name,cell,salary) values(?,?,?)";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Saved");
            findAll();
            System.out.println("-----------------------------------------------------------");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Saved");
        }

    }

    public static void findAll() {
        sql = "select * from employee";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                System.out.println("Id : " + rs.getInt("id") + "  Name : " + rs.getString("name") + "  Cell No : " + rs.getString("cell") + "  Salary : " + rs.getDouble("salary"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(String name, String cell, double salary, int id) {

        sql = "update employee set name=?,cell=?,salary=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Updated");
            findAll();
            System.out.println("-----------------------------------------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Updated");
        }
    }

    public static void delete(int id) {
        sql = "  delete from employee where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Deleted");
            findAll();
            System.out.println("-----------------------------------------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeApril11.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Deleted");
        }

    }

}
