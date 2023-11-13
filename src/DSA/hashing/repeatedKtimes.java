package DSA.hashing;

import java.util.HashMap;
import java.util.Map;

public class repeatedKtimes {
    public static int repeatedKTimesNaive(int[] arr, int k){
        for (int i =0; i < arr.length; i++) {
            int count = 0;
            for (int j =0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int repeatedKTimesOptimal(int arr[], int k) {
        HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            if(count_map.get(arr[i])!=null){
                a = count_map.get(arr[i]);
            }
            count_map.put(arr[i], a+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (count_map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 3, 4, 8, 7, 4, 8, 4, 4, 4, 4, 4 };
        int n = arr.length;
        int k = 8;
        System.out.print(repeatedKTimesOptimal(arr, k));
    }
}
