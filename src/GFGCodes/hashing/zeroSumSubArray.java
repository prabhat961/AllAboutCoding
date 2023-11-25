package GFGCodes.hashing;

import java.util.ArrayList;
import java.util.HashMap;

//Given an array, print all subarrays in the array which has sum 0.
class Pair{
	int first;
	int second;
	
	Pair(int a, int b){
		first = a;
		second = b;
	}
}
public class zeroSumSubArray {
	public static ArrayList<Pair> findSubArrayNaive(int[] arr, int n){
		 ArrayList<Pair> out = new ArrayList<>();
		 
		    for (int i = 0; i < n; i++)
		    {
		      int prefix = 0;
		      for(int j = i; j < n; j++){
		        prefix += arr[j];
		        if(prefix == 0)
		          out.add(new Pair(i, j));
		      }  
		    }
		    return out;
		  }
	static void print(ArrayList<Pair> out){
	    for (int i = 0; i < out.size(); i++){
	      Pair p = out.get(i);
	      System.out.println("Subarray found from Index "
	                         + p.first + " to " + p.second);
	    }
	  }
	
	public static void zeroSUmSubarrayOptmal(int[] arr, int sum) {
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
		int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
	    int n = arr.length;
	    //ArrayList<Pair> out = findSubArrayNaive(arr, n);
	    zeroSUmSubarrayOptmal(arr, 0);
	    //if (out.size() == 0)
	      //  System.out.println("No subarray exists");
	      //else
	        //print(out);

	}

}
