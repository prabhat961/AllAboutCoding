package importentAlgorithms.sorting;

import java.util.Arrays;

public class normalSorting {
public static void sort(int[] arr){
    int lo = 0;
    int hi = arr.length - 1;
    while (lo<=hi){
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        lo++;
        hi--;
    }
}

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Array before Sorting:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after Sorting:");
        System.out.println(Arrays.toString(arr));

    }
}
