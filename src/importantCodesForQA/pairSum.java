package importantCodesForQA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pairSum {
    public static void twoSumone(int[] arr, int Sum){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == Sum)
                    System.out.println("Elements are present at index"+" "+i+" "+"and"+" "+j);
            }
        }
    }

    public static void twoSumTwo(int[] arr, int Sum){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == Sum)
                    System.out.println("Elements are"+" "+arr[i]+" "+"and"+" "+arr[j]);
            }
        }
    }

    public static boolean twoSumThree(int[] arr, int sum){
        int lo =0;
        int hi = arr.length - 1;
        Arrays.sort(arr);
        while(lo < hi){
            if (arr[lo] + arr[hi] == sum)
               return true;
            else if (arr[lo] + arr[hi] < sum)
                lo++;
            else  
                hi--;
        }
        return false;
    }
    
    public static void twoSumFour(int[] arr, int sum) {
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (set.contains(complement)) {
            	 System.out.println("Yes");
                 return;
			}
            set.add(arr[i]);
        }
        System.out.println("No");
    	
    }



    public static void main(String[] args) {
        int[] arr = { 2, 9, 11, 15, 17, 9};
        int sum = 13;
       twoSumFour(arr, sum);
    }
}
