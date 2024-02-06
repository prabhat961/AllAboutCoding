package DSAbasicsRevision.arrays;

import java.util.Arrays;



public class allBasicMethods {
	public static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
=======================================================================================

	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
=========================================================================================

	public static void arrayReverse(int[] arr){
		int lo = 0;
		int hi = arr.length - 1;
		while(lo < hi){
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
==========================================================================================

	public static int kthLargest(int[] arr, int k){
		Arrays.sort(arr);
		return arr.length -k;
	}
============================================================================================

	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k];
	}
============================================================================================
	
	public static int countOccurance(int[] arr, int ele) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
		}
		return count;
	}
============================================================================================
	
	public static void sort012(int[] arr) {
		 int lo = 0;
		 int mid = 0;
		 int hi = arr.length - 1;
		 
		 while(mid <= hi){
	            int temp;
	            switch(arr[mid]) {
	                case 0:
	                    temp = arr[lo];
	                    arr[lo] = arr[mid];
	                    arr[mid] = temp;
	                    ++lo;
	                    ++mid;
	                    break;
	                case 1:
	                    ++mid;
	                    break;
	                case 2:
	                    temp = arr[hi];
	                    arr[hi] = arr[mid];
	                    arr[mid] = temp;
	                    --hi;
	            }
	        }
	}
=========================================================================================
	
	public static int findRange(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			
			int min = arr[0];
			for (int j = 0; j < arr.length; j++){
				if(arr[j] < min){
					min = arr[j];
				}
			}
				
				return max - min;
			}
==========================================================================================
			
			public static void shiftallnegetive(int[] arr, int left,
                    int right) {
				while (left <= right) {
					if (arr[left] < 0 && arr[right] < 0)
						left++;
					else if (arr[left] > 0 && arr[right] < 0) {
						int temp = arr[left];
						arr[left] = arr[right];
						arr[right] = temp;
						left++;
						right--;
					}
					else if (arr[left] > 0 && arr[right] > 0)
						right--;
					else {
						left++;
						right--;
					}
				}
			}
			
				
				




	public static void main(String[] args) {
		

	}

}
