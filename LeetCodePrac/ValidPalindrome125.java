import java.util.List;

public class ValidPalindrome125 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> list = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                str = str + s.charAt(i);

            }
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev.equals(str);
    }
}