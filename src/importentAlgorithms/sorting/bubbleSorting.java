package importentAlgorithms.sorting;

import java.util.Arrays;

public class bubbleSorting {
    public static void sortBubble(int[] arr){
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j< arr.length - i - 1; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 24, 5, 16, 7, 98, 39 };
        System.out.println("Array before Sorting:");
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println("Array after Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
