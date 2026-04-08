/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pos.util.DbUtil;

/**
 *
 * @author Administrator
 */
public class CustomerDao {

    DbUtil db = new DbUtil();
    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public void saveCustomer(String name, String email, String cell, String address) {
        sql = "insert into customer (name,email,cell,address) values(?,?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setString(4, address);
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Customer Saved");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Customer Not Saved");
        }

    }

    public void showCustmer(JTable jt) {
        String[] column = {"SL", "Name", "Email", "Cell No", "Address"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        jt.setModel(model);
        sql = "select * from customer";
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");
                Object[] obj = {id, name, email, cell, address};
                model.addRow(obj);

            }
            rs.close();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
