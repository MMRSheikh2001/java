import java.util.Scanner;

public class FindMaximumAchivableNumber2769 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        ;
        Solution solution = new Solution();
        System.out.println(solution.theMaximumAchievableX(num, t));

    }
}

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return num + t + t;
    }
}