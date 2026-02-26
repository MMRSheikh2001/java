
package pos.service;

import java.util.List;

public interface DaoService<E> {
    
    void save(E e);
    List<E> findAll();
    void update(int id);
    E findById(int id);
    void delete(int id);
    
    
}
