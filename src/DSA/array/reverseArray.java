package DSA.array;

import java.util.Arrays;

public class reverseArray {
    public static void reverse(int[] arr){
    int lo = 0;
    int hi = arr.length -1;
    while(lo < hi){
        int temp = arr[hi];
        arr[hi] = arr[lo];
        arr[lo] = temp;

        lo++;
        hi--;
    }
    }
    public static void main(String[] args) {
        int[] arr = {21, 31, 54, 87, 98, 54, 23};
        System.out.println("Current array is:"+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array is:"+Arrays.toString(arr));
    }
}
