import java.util.ArrayList;
import java.util.List;

public class FindTheDifference389 {
    public static void main(String[] args) {

    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> sList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            sList.add(c);
        }

        List<Character> tList = new ArrayList<>();
        for (char c : t.toCharArray()) {
            tList.add(c);
        }

        for (Character item : sList) {
            tList.remove(item);
        }
        char re = 'a';
        for (Character c : tList) {
            re = c;
        }
        return re;
    }
}
