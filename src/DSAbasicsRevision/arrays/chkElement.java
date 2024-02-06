package DSAbasicsRevision.arrays;

import GFGCodes.Matrx.intro;

public class chkElement {
	
	public static boolean isPresent(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) 
				return true;
			}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {23, 34, 25, 45, 16, 18};
		System.out.println("The element is present:"+isPresent(arr, 39));
	}

}
