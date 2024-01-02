package importentAlgorithms.sorting;

import java.util.Arrays;


public class quickSort {
	static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static int partition(int[] arr, int low, int high){
       int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
             if (arr[j] < pivot) {
                 i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public static void sortQuick(int[] arr, int low, int high)
    {
        if (low < high) {
             int pi = partition(arr, low, high);
            sortQuick(arr, low, pi - 1);
            sortQuick(arr, pi + 1, high);
        }
    }
	public static void main(String[] args) {
		 int[] arr = { 13, 24, 5, 16, 7, 98, 39 };
		 int lo = 0;
		 int hi = arr.length - 1;
	        System.out.println("Array before Sorting:");
	        System.out.println(Arrays.toString(arr));
	        sortQuick(arr, lo, hi);
	        System.out.println("Array after Sorting:");
	        System.out.println(Arrays.toString(arr));

	}

}
