package employeeproject.dao;

import employeeproject.model.Employee;
import employeeproject.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EmployeeDao {

    DbUtil db = new DbUtil();
    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public void saveStudentData(Employee e) {
        sql = "insert into employee (name,salary,email) values(?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());

            ps.executeUpdate();

            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Employee Saved");

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Employee Not Saved");
        }

    }

    public List<Employee> findAllStudent() {
        sql = "select * from employee";
        List<Employee> eList = new ArrayList<>();
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getString("email"));
                eList.add(e);

            }
            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eList;

    }

}
