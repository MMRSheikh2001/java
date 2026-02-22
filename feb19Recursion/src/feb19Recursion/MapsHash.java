package feb19Recursion;

import java.util.HashMap;

/**
 *
 * @author Mahbub
 */
public class MapsHash {

    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<>();
        examScores.put("Math", 76);
        examScores.put("English", 80);
        examScores.put("Bangla", 85);
        examScores.put("Physics", 81);
        examScores.put("Chemistry", 91);

        examScores.putIfAbsent("ICT", 89);
        examScores.replace("Math", 94);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.getOrDefault("Religion", 35));

        System.out.println(examScores.size());
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(85));
        System.out.println(examScores.containsValue(Integer.valueOf(75)));
        System.out.println(examScores.isEmpty());

        examScores.forEach((subject, score) -> {
            System.out.println(subject + "-----" + score);
        });

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score * 3 / 2 + 30);
        });
        System.out.println("New scores after for loop \n" + examScores.toString());
        examScores.remove("ICT");
        System.out.println(examScores.toString());
        examScores.clear();

        System.out.println(examScores.toString());
        System.out.println(examScores.isEmpty());
    }
}
