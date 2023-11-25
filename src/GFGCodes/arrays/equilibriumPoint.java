package GFGCodes.arrays;

import java.util.Iterator;

//Given, an array of size n. Find an element that divides the array into two sub-arrays with equal sums.

public class equilibriumPoint {
    public static int findElement(int[] arr, int size) {
    	int[] prefixSum = new int[size];
    	 prefixSum[0] = arr[0];
         for (int i = 1; i < size; i++)
             prefixSum[i] = prefixSum[i - 1] + arr[i];
       
         // Forming suffix sum array from n-1
         int[] suffixSum = new int[size];
         suffixSum[size - 1] = arr[size - 1];
         for (int i = size - 2; i >= 0; i--)
             suffixSum[i] = suffixSum[i + 1] + arr[i];
       
         // Find the point where prefix and suffix
         // sums are same.
         for (int i = 1; i < size - 1; i++)
             if (prefixSum[i] == suffixSum[i])
                 return arr[i];
       
         return -1;
    }
    public static void main(String[] args) {
    	  int arr[] = { 1, 4, 2, 5 };
          int n = arr.length;
          System.out.println(findElement(arr, n));
	}
}
