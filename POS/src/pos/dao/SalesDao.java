/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Sales;
import pos.service.DaoService;
import pos.util.DbUtil;
import pos.util.SalesUtil;

/**
 *
 * @author Administrator
 */
public class SalesDao implements DaoService<Sales> {

    DbUtil db = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    SalesUtil su=new SalesUtil();

    @Override
    public void save(Sales e) {
        sql = "insert into sales (productName,unitPrice,quantity,totalPrice,discount,actualPrice) values(?,?,?,?,?,?)";
        
        double totalPrice=su.getTotalSalesPrice(e.getUnitPrice(), e.getQuantity());
        double discountAmount=su.getDiscountAmount(totalPrice, e.getDiscount());
        double actualPrice=su.getActualPrice(totalPrice, discountAmount);
        
        
        
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getProductName());
            ps.setDouble(2, e.getUnitPrice());
            ps.setDouble(3, e.getQuantity());
            ps.setDouble(4, totalPrice);
            ps.setDouble(5, e.getDiscount());
            ps.setDouble(6, actualPrice);
            ps.executeUpdate();

            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Sales Saved");

        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Sales Not Saved");
        }

    }

    @Override
    public List<Sales> findAll() {
        List<Sales> sList = new ArrayList<>();
        sql = "select * from sales";
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sales s = new Sales(rs.getInt("id"), rs.getString("productName"),
                        rs.getDouble("unitPrice"),
                        rs.getDouble("quantity"),
                        rs.getDouble("totalPrice"),
                        rs.getDouble("discount"),
                        rs.getDouble("actualPrice"));
                sList.add(s);

            }

            rs.close();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sList;
    }

    @Override
    public void update(Sales e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Sales findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
