package GFGCodes.hashing;

import java.util.HashMap;

//Given an array, print all subarrays in the array which has given Sum
public class givenSumSUbArray {
	public static void givenSUmSubarrayOptmal(int[] arr, int sum) {
		int currSum = 0;
		int start = 0;
		int end = -1;
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			currSum = currSum + arr[i];
			if (currSum - sum == currSum) {
				start = 0;
				end = i;
				break;
			}
			if (map.containsKey(currSum - sum )) {
				start = map.get(currSum - sum )+1;
				end = i;
				break;
				}
			map.put(currSum, i);
		}
		if (end == -1) {
			System.out.println("Not Found");
			}
		else {
			System.out.println(start+" "+end);
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 15, -5, 15, -10, 5};
	    int n = arr.length;
	   	    givenSUmSubarrayOptmal(arr, 5);

	}

}
