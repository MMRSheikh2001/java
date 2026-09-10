import java.util.HashSet;

import java.util.Set;

import java.util.Scanner;

public class UglyNumber263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Solution s = new Solution();
        System.out.println(s.isUgly(n));

    }
}

class Solution {
    public boolean isUgly(int n) {
        Set<Integer> set = new HashSet<>();
        int s = n;

        int divisor = 1;
        while (n != 1) {

            if (n % divisor == 0) {
                set.add(divisor);
                n = n / divisor;
            }
            divisor++;
        }
       

        set.remove(s);
        set.remove(1);
        if (s == 1) {
            return true;
        }
        for (Integer i : set) {
            if (i != 1 && i != 2 && i != 3 && i != 5) {

                return false;
            }
        }

        return true;
    }
}