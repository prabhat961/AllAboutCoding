package GFGCodes.arrays;
//Given an array arr[] and an integer K, the task is to reverse every subarray formed by consecutive K elements.
public class GroupReversal {
	public static void reverseInGroup(int[] arr, int n, int k) {
	for(int i = 0; i < n; i = i+k) {
		int left = i;
		int right = Math.min(n - 1, i+k-1);
		int temp;
		while(left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
		
}

	public static void main(String[] args) {
		  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
	        int k = 3;
	     int n = arr.length;
	     reverseInGroup(arr, n, k);
	     for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");

	}

}
