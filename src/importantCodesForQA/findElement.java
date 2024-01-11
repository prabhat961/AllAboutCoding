package importantCodesForQA;



public class findElement {
	public static boolean searchElement(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 11, 15, 17, 9};
		System.out.println("Desired element is present in the array:"+searchElement(arr, 15));

	}

}
