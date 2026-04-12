/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudexampreapril12;

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
public class CRUDExamPreApril12 {

    static String sql;
    static PreparedStatement ps;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        save("Mahbub", "BSc", 1230);
        delete(1);
    }

    public static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/homestore";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

    public static void save(String name, String qualification, double salary) {
        sql = "insert into emp(name,qualification,salary) values(?,?,?)";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, qualification);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Emp saved");
            System.out.println("------------------------------------------------");
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Emp Not saved");
        }

    }

    public static void findAll() {
        sql = "select * from emp";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("All the Emps are : ");
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id") + "   Name : " + rs.getString("name") + "  Qualification : " + rs.getString("qualification") + "   Salary : " + rs.getDouble("salary"));

            }
            rs.close();
            ps.close();
            getCon().close();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
        } catch (SQLException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(String name, String qualification, double salary, int id) {
        sql = "update emp set name=?,qualification=?,salary=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, qualification);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Emp Updated");
            System.out.println("------------------------------------------------");
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Emp Not Updated");
        }

    }

    public static void delete(int id) {
        sql = "delete from emp where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            int value = ps.executeUpdate();
            if (value > 0) {
                System.out.println("Emp Deleted");

            } else {
                System.out.println("Emp Not  Deleted");
            }
            ps.close();
            getCon().close();

            System.out.println("--------------------------------------------------------------");
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDExamPreApril12.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Emp Not Deleted");
        }

    }

}
