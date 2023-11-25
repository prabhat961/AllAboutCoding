package GFGCodes.hashing;

import java.util.HashMap;
import java.util.Map;

//Given a sorted array in which all elements appear twice (one after one) and one element appears only once.
//Find that element in O(log n) complexity.
public class ElementOnce {
	public static int uniqueELementNaive(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length - 1; i += 2) {
			if (arr[i] != arr[i + 1]) {
				ans = arr[i];
				break;
			}
		}
		return ans;
	}
	
	public static void uniqueELementOptimize(int[] arr) {
		HashMap<Integer, Integer>mm = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if (mm.containsKey(arr[i])) {
				int count = mm.get(arr[i]) +1;
				mm.put(arr[i], count);
				}
			else {
				mm.put(arr[i], 1);
			}
		}
			for(Map.Entry<Integer, Integer>x : mm.entrySet()) {
				int c = x.getValue();
				 if(c == 1){
				        System.out.println(x.getKey());
				        break;
				      }    
			}
		}

	public static void main(String[] args) {
		 int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
	        int len = arr.length;
	 
	        System.out.println("The unique Element in the array is:"+uniqueELementNaive(arr));
	        uniqueELementOptimize(arr);

	}

}
