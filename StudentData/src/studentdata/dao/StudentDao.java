/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdata.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import studentdata.model.Student;
import studentdata.util.DbUtil;

/**
 *
 * @author Admin
 */
public class StudentDao {

    DbUtil db = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    public void save(Student s) {
        sql = "insert into student(name,course,cell,bloodGroup) values(?,?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getCell());
            ps.setString(4, s.getBloodGroup());
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Student Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Student Data Not Saved");
        }

    }

    public List<Student> findAllStudents() {
        List<Student> sList = new ArrayList<>();
        sql = "select * from student";
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getString("cell"),
                        rs.getString("bloodGroup"));
                sList.add(s);
            }
            rs.close();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sList;
    }

}
