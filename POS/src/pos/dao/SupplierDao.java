package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<Supplier> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
