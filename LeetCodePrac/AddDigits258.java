public class AddDigits258 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(38));
    }
}

class Solution {
    public int addDigits(int num) {
        String number = "" + num;
        while (number.length() != 1) {
            num = 0;
            for (int i = 0; i < number.length(); i++) {

                num += (Integer.parseInt(number.charAt(i)+""));
            }
            number = "" + num;
            number = number.trim();
        }

        return num;
    }
}