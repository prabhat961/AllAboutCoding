package DSA.array;

import java.util.*;

public class threeSum {
    public static   boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;
        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] arr = {12, 25, 14, 68, 98, 74};
        int target = 124;
        int n = arr.length;
        System.out.println("The three numbers whose sum as given target are:");
        find3Numbers(arr, n, target);
    }
}
