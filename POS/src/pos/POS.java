/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import pos.dao.CategoryDao;
import pos.dao.SupplierDao;
import pos.dao.UserDao;
import pos.model.Category;
import pos.model.Supplier;
import pos.model.User;
import pos.view.Login;

/**
 *
 * @author Admin
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
        
    }
    
}
