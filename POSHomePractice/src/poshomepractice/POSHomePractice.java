package poshomepractice;

import poshomepractice.dao.UserDao;
import poshomepractice.model.User;

/**
 *
 * @author Administrator
 */
public class POSHomePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User("Mahbub", "mahbub1234");
        UserDao ud = new UserDao();
        ud.saveUser(u);
        
    }
    
}
