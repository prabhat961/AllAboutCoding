package importentAlgorithms.sorting;

import java.util.Arrays;

public class selectionSort {
	public static void sortSelection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min] > arr[j] ) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	public static void main(String[] args) {
		 int[] arr = { 13, 24, 5, 16, 7, 98, 39 };
	        System.out.println("Array before Sorting:");
	        System.out.println(Arrays.toString(arr));
	        sortSelection(arr);
	        System.out.println("Array after Sorting:");
	        System.out.println(Arrays.toString(arr));

	}

}
