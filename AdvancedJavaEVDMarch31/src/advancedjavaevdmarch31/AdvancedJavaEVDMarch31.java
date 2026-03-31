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
    static PreparedStatement ps;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static Connection getCon() {
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

    public static void addBooks(String bookName, String author) {

        String sql = "insert into book(bookName,authorName) values(?,?)";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, bookName);
            ps.setString(2, author);
            ps.executeUpdate();
            getCon().close();
            System.out.println("Book Saved");
            showBooks();

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Book Saved");
        }

    }

    public static void showBooks() {
        String sql = "select * from book";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String s = "ID : " + rs.getInt("id") + "  Book Name : " + rs.getString("bookName")
                        + "  Author : " + rs.getString("authorName") + "  Issued To : " + rs.getString("issueTo");
                System.out.println(s);

            }
            rs.close();
            ps.close();
            getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateBook(String bookName, String authorName, String issuee, int id) {
        String sql = "update book set bookName=? ,authorName=?,issueTo =? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, bookName);
            ps.setString(2, authorName);
            ps.setString(3, issuee);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            showBooks();
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int getIdByBookName(String bookName) {
        int id = 0;
        String sql = "select id from book where bookName=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, bookName);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static void deleteBook(int id) {
        String sql = "delete from book where id =?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Student Id " + id + " Deleted");

            } else {
                System.err.println("Student Id " + id + "Not Deleted");
            }
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Student Id Not Deleted");
        }

    }

}
