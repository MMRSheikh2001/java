
package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.model.User;
import pos.util.DbUtil;

/**
 *
 * @author Admin
 */
public class UserDao {
    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    
    public void saveUser(User user){
    sql = "insert into user(userName ,password) values(?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
}
