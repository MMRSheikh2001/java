package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.model.Category;
import pos.service.DaoService;
import pos.util.DbUtil;

public class CategoryDao implements DaoService<Category> {

    DbUtil db = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(Category e) {
        sql = "insert into category(name) values(?)";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Saved");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category not Save");

            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Category> findAll() {

        List<Category> list = new ArrayList<>();
        sql = "Select * from category";
        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Category c = new Category(
                        rs.getInt("id"),
                        rs.getString("name")
                );
                list.add(c);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(int id) {
        sql = "update category set name = ? where id = ?";
        Category c = new Category();
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, c.getName());
            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Update");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category not Update");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Category findById(int id) {
        Category c = null;

        sql = "select * from category where id = ?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                c = new Category(
                        rs.getInt("id"),
                        rs.getString("name")
                );
            }
            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
