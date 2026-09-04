public class Sqrt69 {

    public static void main(String[] args) {

    }

}

class Solution {
    public int mySqrt(int x) {

        long rooted = 0;

        while (rooted * rooted <= x) {

            rooted++;

        }
        rooted--;

        return (int) rooted;
    }
}