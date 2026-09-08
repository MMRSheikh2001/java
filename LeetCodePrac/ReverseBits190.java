public class ReverseBits190 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(43261596));
    }
}

class Solution {
    public int reverseBits(int n) {
        String turned = Integer.toBinaryString(n);
        turned = turned.trim();

        int looping = turned.length();

        if (turned.length() != 32) {
            for (int i = 0; i < 32 - looping; i++) {

                turned = "0" + turned;

            }
        }

        String reversed = "";
        for (int i = turned.length() - 1; i >= 0; i--) {
            reversed = reversed + turned.charAt(i);
        }

        long theNumber = Integer.parseUnsignedInt(reversed, 2);

        return (int) theNumber;

    }
}