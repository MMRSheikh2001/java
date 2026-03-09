package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Supplier;
import pos.service.DaoService;
import pos.util.DbUtil;

/**
 *
 * @author Administrator
 */
public class SupplierDao implements DaoService<Supplier> {

    DbUtil db = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(Supplier e) {
        sql = "insert into supplier(name,cell,contactPersonName,contactPersonCell,address) values(?,?,?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getCell());
            ps.setString(3, e.getContactPersonName());
            ps.setString(4, e.getContactPersonCell());
            ps.setString(5, e.getAddress());
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            System.out.println("Supplier Added");
            JOptionPane.showMessageDialog(null, "Supplier Added");

        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Supplier not Added");
        JOptionPane.showMessageDialog(null, "Supplier Not Added");
        }

    }

    @Override
    public List<Supplier> findAll() {
        List<Supplier> sList = new ArrayList<>();
        sql = "select * from supplier";
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Supplier s = new Supplier(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cell"),
                        rs.getString("contactPersonName"),
                        rs.getString("contactPersonCell"),
                        rs.getString("address"));
                sList.add(s);
                ps.close();
                db.getCon().close();
                rs.close();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sList;
    }

    @Override
    public void update(Supplier e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Supplier findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
