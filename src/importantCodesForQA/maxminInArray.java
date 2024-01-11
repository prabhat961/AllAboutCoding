package importantCodesForQA;



public class maxminInArray {
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
public static int findMin(int[] arr) {
	int min = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	return min;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 11, 15, 17, 9};
		System.out.println("Maximum element in the array is:"+findMax(arr));
		System.out.println("Minimum element in the array is:"+findMin(arr));

	}

}
