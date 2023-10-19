package DSA.array;

import java.util.Arrays;

public class kthSmallestLargest {
    public static int kthSMallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int kthLargest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = { 19, 31, 24, 98, 109, 167};
        int k = 3;
        System.out.println("kth smallest element:"+kthSMallest(arr, k));
        System.out.println("kth largest element:"+kthLargest(arr, k));
    }
}
