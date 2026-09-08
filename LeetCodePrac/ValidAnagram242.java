import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        boolean anagram = false;

        char[] sArr = s.toCharArray();

        Arrays.sort(sArr);

        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == tArr[i]) {
                anagram = true;
            } else {
                anagram = false;
                break;
            }
        }

        return anagram;

    }
}