/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

/**
 * Consider an array A with n of positive integers. An integer idx is called a
 * POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to
 * A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an
 * array, if it exists and -1 otherwise. The signature of the function is: int
 * f(int[] a)
 *
 */
public class ArrayPointOfEquilibriam {

    public static void main(String[] args) {
        int[] arr = {1,8,3,7,10,2};
        System.out.println(findArrayPointOfEquilibriam(arr));
    }

    public static int findArrayPointOfEquilibriam(int[] arr) {
        int eqil = -1;
        for (int i = 1; i < arr.length; i++) {
            int suma = 0;
            int sumb = 0;
            for (int j = 0; j < i; j++) {
                suma += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {
                sumb += arr[k];
            }
            if (suma == sumb) {
                eqil = i;
                break;
            }

        }

        return eqil;
    }

}
