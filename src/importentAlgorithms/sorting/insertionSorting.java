package importentAlgorithms.sorting;

import java.util.Arrays;

public class insertionSorting {

	public static void sortInsertion(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp ) {
				arr[j+1] = arr[j];
				j --;
			}
			arr[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		 int[] arr = { 13, 24, 5, 16, 7, 98, 39 };
	        System.out.println("Array before Sorting:");
	        System.out.println(Arrays.toString(arr));
	        sortInsertion(arr);
	        System.out.println("Array after Sorting:");
	        System.out.println(Arrays.toString(arr));

	}

}
