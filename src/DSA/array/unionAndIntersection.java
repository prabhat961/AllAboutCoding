package DSA.array;

import java.util.*;

public class unionAndIntersection {
    public static void printUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        Set<Integer> un = new HashSet<>();
        for (int i = 0; i < m; i++) {
            un.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            un.add(arr2[i]);
        }
        for(int ele:un){
            System.out.print("Union of these arrays are:"+ele+" ");
        }
    }
    public static void printIntersection(int[] arr1, int[] arr2){
        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;
        Set<Integer>in = new HashSet<>();
        while( i < m && j < n){
            if (arr1[i] < arr2[j])
                i++;
            else if(arr1[i] > arr2[j])
                j++;
            else{
                in.add(arr1[i]);
                i++;
                j++;
            }
        }
        for (int num:in){
            System.out.print("Intersection of the given array is:"+num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 ={3, 5, 6, 7, 8, 9};
        printUnion(arr,arr1);
        printIntersection(arr,arr1);

    }
}
