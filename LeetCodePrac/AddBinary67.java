public class AddBinary67 {

    public static void main(String[] args) {

    }
}

class Solution {
    public String addBinary(String a, String b) {
        long numa = Integer.parseInt(a, 2);

        long numb = Integer.parseInt(b, 2);

        return (Long.toBinaryString(numa + numb));

    }
}