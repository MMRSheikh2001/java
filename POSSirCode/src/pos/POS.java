/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import pos.dao.CategoryDao;
import pos.model.Category;

/**
 *
 * @author emran
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Category c = new Category("Apple");
        
        CategoryDao dao = new CategoryDao();
        
//        dao.save(c);
        
        Category c1 = dao.findById(1);
        c1.setName("Banana");
        dao.update(c1.getId());
                
        
        
        
        
    }
    
}
