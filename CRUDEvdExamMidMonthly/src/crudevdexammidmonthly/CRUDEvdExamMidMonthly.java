/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudevdexammidmonthly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CRUDEvdExamMidMonthly {

    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        save("Badrul", "2025-12-31", "IT", 1230);
        update("tanvir Cap", "2025-07-31", "Leader", 1234, 4);
        delete(2);
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
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

    public static void save(String name, String joinDate, String designation, double salary) {
        LocalDate localDate = LocalDate.parse(joinDate);
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);

        sql = "insert into employee (name,joinDate,designation,salary) values(?,?,?,?)";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDate(2, sqlDate);
            ps.setString(3, designation);
            ps.setDouble(4, salary);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Saved");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Saved");
        }

    }

    public static void findAll() {
        sql = "select * from employee";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("All Employee Informations : ");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                double salary = rs.getDouble("salary");
                java.sql.Date sqlDate = rs.getDate("joinDate");
                LocalDate localDate = sqlDate.toLocalDate();
                String formattedDate = localDate.toString();

                System.out.println("Id : " + id + "   Name : " + name + "   Joining Date : " + formattedDate + "  Designation : " + designation + "   Salary : " + salary);

            }
            rs.close();
            ps.close();
            getCon().close();
            System.out.println("------------------------------------------------------------------------------------------------------------");
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(String name, String joinDate, String designation, double salary, int id) {
        LocalDate localDate = LocalDate.parse(joinDate);
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        sql = "update employee set name=?,joinDate=?,designation=?,salary=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDate(2, sqlDate);
            ps.setString(3, designation);
            ps.setDouble(4, salary);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Updated");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Updated");
        }

    }

    public static void delete(int id) {
        sql = "delete from employee where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Employee Deleted");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDEvdExamMidMonthly.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee Not Deleted");
        }

    }

}
