package importantCodesForQA;

import java.util.HashMap;
import java.util.Map;

public class kRepeatedElement {
    public static int kTimesRepeationNaive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
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
        return  -1;
    }

    public static int kTimesRepeationOptimize(int[] arr, int k){
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            if (hm.containsKey(arr[i])){
                int val = hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer>me:hm.entrySet()){
            if (me.getValue() == k)
                return me.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 3, 4, 8, 7, 4, 8, 4, 4, 4, 4, 4 };
        int n = arr.length;
        int k = 8;
        System.out.println(kTimesRepeationOptimize(arr, k));
    }
}
