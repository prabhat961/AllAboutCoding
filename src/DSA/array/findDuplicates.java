package DSA.array;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
    public static void printDups(int[] arr){
        Set<Integer> set = new HashSet<>();
        for( int i = 0; i < arr.length; i++){
            if (set.contains(arr[i])){
                System.out.print("duplicate elements are:"+arr[i]+" ");
            }
            else
                set.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 3, 5, 4, 2, 4, 2};
        printDups(arr);
    }
}
