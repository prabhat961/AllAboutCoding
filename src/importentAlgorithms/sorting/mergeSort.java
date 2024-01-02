package importentAlgorithms.sorting;

import java.util.Arrays;

import GFGCodes.Matrx.intro;

public class mergeSort {
	public static void sortMerge(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi)/2;
			sortMerge(arr, lo, mid);
			sortMerge(arr, mid+1, hi);
			merge(arr, lo, mid, hi);
		}
	}
	
	public static void merge(int[] arr, int lo, int mid, int hi) {
		 int n1 = mid - lo + 1;
	        int n2 = hi - mid;
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[lo + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[mid + 1 + j];
	        int i = 0, j = 0;
	        int k = lo;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	public static void main(String[] args) {
		 int[] arr = { 13, 24, 5, 16, 7, 98, 39 };
		 int lo = 0;
		 int hi = arr.length - 1;
	        System.out.println("Array before Sorting:");
	        System.out.println(Arrays.toString(arr));
	        sortMerge(arr, lo, hi);
	        System.out.println("Array after Sorting:");
	        System.out.println(Arrays.toString(arr));

	}

}
