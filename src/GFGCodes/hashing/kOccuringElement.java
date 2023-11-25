package GFGCodes.hashing;

import java.util.HashMap;
import java.util.Map;

import net.bytebuddy.asm.Advice.Return;

//Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times
//the print -1. The distribution of integer elements could be in any range.
public class kOccuringElement {
	public static int kOccurEleNaive(int[] arr, int k) {
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					}
			}
			if (count == k) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static int kOccurEleOptimal(int[] arr, int k) {
		HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            if(count_map.get(arr[i])!=null){
                a = count_map.get(arr[i]);
            }
             
            count_map.put(arr[i], a+1);
        }
		for (int i = 0; i < arr.length; i++) {
			 {
		            if (count_map.get(arr[i]) == k) {
		                return arr[i];
		          
		}
	}
	}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
        int n = arr.length;
        int k = 2;
        System.out.print(kOccurEleOptimal(arr,  k));

	}

}
