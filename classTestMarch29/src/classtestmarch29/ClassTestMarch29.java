/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtestmarch29;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ClassTestMarch29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = {{1, 99, 91, 11, 44}, {0, 10, 9, 9, 11}, {3, 23, 21, 5, 20}, {13, 4, 45, 66, 33}, {11, 0, 1, 20, 56}};
        System.out.println(Arrays.deepToString(arr));
        for (int[] item : arr) {
            for (int i = 0; i < item.length - 1; i++) {
                for (int j = 0; j < item.length - i - 1; j++) {
                    if (item[j] > item[j + 1]) {
                        int temp = item[j];
                        item[j] = item[j + 1];
                        item[j + 1] = temp;

                    }

                }

            }
System.out.println(Arrays.toString(item));
        }

//        for (int[] item : arr) {
//            System.out.println(Arrays.toString(item));
//        }
        System.out.println(Arrays.deepToString(arr));

    }

}
