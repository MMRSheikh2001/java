package feb19Recursion;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Mahbub
 */
public class ListArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(62);
        list.add(73);
        list.add(42);
        list.add(32);
        list.add(52);
        list.add(62);
        System.out.println(list.toString());
        System.out.println(list.get(2));
       // list.remove(5);
       list.remove(Integer.valueOf(62));
     //  list.clear();
     list.set(4, Integer.valueOf(55));
     list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.contains(Integer.valueOf(73)));
        System.out.println(list.isEmpty());
        list.forEach(item->
        {list.set(list.indexOf(item), item*3);
            System.out.println(item*2);}
        );
        
        System.out.println(list.toString());
        
        
        
        
        
    }
    
}
