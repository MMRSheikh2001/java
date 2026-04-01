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
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Library\nWhat do you want to do?"
                + "\n1 : Add Book"
                + "\n2 : Issue Book"
                + "\n3 : Update Book"
                + "\n4 : Return Book"
                + "\n5 : Remove Book"
                + "\n6 : Show Book"
                + "\n7 : Cancel");

        int n = sc.nextInt();
        while (n != 7) {
            if (n == 1) {
                sc.nextLine();
                System.out.println("What is the Book's Name?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                System.out.println("Who is The author of the Book?");
                String author = sc.nextLine();
                addBooks(bookName, author);

                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }
            if (n == 2) {
                sc.nextLine();
                System.out.println("What book do you want to Issue?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                int id = getIdByBookName(bookName);
                System.out.println("What is the Issuee's Name?");
                String issuee = sc.nextLine();
                String author = getAuthorById(id);
                updateBook(bookName, author, issuee, id);

                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }
            if (n == 3) {
                sc.nextLine();
                System.out.println("What is The Book Id?");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("What Book Name to Set?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();

                System.out.println("What Author Name to Set?");
                String author = sc.nextLine();

                System.out.println("What Issuee Name to set?");
                String issuee = sc.nextLine();
                updateBook(bookName, author, issuee, id);
                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }
            if (n == 4) {
                sc.nextLine();
                System.out.println("What Book to Return?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                int id = getIdByBookName(bookName);
                String author = getAuthorById(id);
                String issuee = getIssueeById(id);
                if (issuee != null) {
                    updateBook(bookName, author, null, id);
                    System.out.println("Thanks for Returning The Book");

                }

                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }
            if (n == 5) {
                sc.nextLine();
                System.out.println("What is the Book Name to Remove?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                int id = getIdByBookName(bookName);
                deleteBook(id);
                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }
            if (n == 6) {
                sc.nextLine();
                showBooks();
                System.out.println("What do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Update Book"
                        + "\n4 : Return Book"
                        + "\n5 : Remove Book"
                        + "\n6 : Show Book"
                        + "\n7 : Cancel");

                n = sc.nextInt();
            }

        }

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
            System.out.println("Book Updated");
            showBooks();
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Book Updated");
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

    public static String getAuthorById(int id) {
        String author = null;
        String sql = "select authorName from book where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                author = rs.getString("authorName");

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

        return author;
    }

    public static String getIssueeById(int id) {
        String issuee = null;
        String sql = "select issueTo from book where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                issuee = rs.getString("issueTo");

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaEVDMarch31.class.getName()).log(Level.SEVERE, null, ex);
        }

        return issuee;
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
