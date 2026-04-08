/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeevdtest8april;

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
public class EmployeeEvdTest8April {

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //   save("Mahbub", 2300, "IT");
        findAll();
        update(1, "Sabbir", 15000, "Engineer");
    }

    public static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jeestore";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void save(String name, double salary, String department) {
        sql = "insert into employees (name,salary,department) values(?,?,?)";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, department);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Saved");
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Saved");
        }

    }

    public static void findAll() {

        sql = "select * from employees";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Id : " + rs.getInt("id") + " Name : " + rs.getString("name") + "  Salary : " + rs.getDouble("salary") + "  Department : " + rs.getString("department"));

            }
            rs.close();
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(int id, String name, double salary, String department) {
        sql = "update employees set name=?,salary=?,department=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, department);
            ps.setInt(4, id);
            ps.executeUpdate();
            System.out.println("Employee Updated");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void delete(int id) {
        sql = "delete from employees where id=?";

        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeEvdTest8April.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
