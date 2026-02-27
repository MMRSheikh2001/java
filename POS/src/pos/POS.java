/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import pos.dao.CategoryDao;
import pos.dao.UserDao;
import pos.model.Category;
import pos.model.User;

/**
 *
 * @author Admin
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   User u = new User("Mahbub", "mahbub1234");
        //    UserDao ud = new UserDao();
        //   ud.saveUser(u);

        Category c = new Category("Mango");
        CategoryDao cd = new CategoryDao();
        cd.save(c);

    }

}
