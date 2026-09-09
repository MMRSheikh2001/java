public class ReverseWordsInStringIII557 {

    public static void main(String[] args) {

    }
}

class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        String newString = "";
        for (String w : arr) {
            for (int i = w.length() - 1; i >= 0; i--) {
                newString = newString + w.charAt(i);
            }
            newString = newString + " ";
        }
        newString = newString.trim();
        return newString;

    }
}