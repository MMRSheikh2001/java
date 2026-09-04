public class LengthOfLastWord {

    public static void main(String[] args) {

    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        int index = s.lastIndexOf(" ");
        String word = s.substring(index + 1);
        length = word.length();

        return length;

    }
}