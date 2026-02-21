
package feb19Recursion;

import java.util.HashMap;

/**
 *
 * @author Mahbub
 */
public class MapsHash {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores= new HashMap<>();
        examScores.put("Math", 76);
        examScores.put("English", 80);
        examScores.put("Bangla", 85);
        examScores.put("Physics", 81);
        examScores.put("Chemistry", 91);
        
        System.out.println(examScores.toString());
    }
}
