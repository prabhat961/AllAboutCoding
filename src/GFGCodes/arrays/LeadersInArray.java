//Problem Statement: Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all
// the elements to its right side. And the rightmost element is always a leader.

package GFGCodes.arrays;

public class LeadersInArray {
    public static  void printLeadersNaive(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }

    public static void printLeadersOptimize(int[] arr, int size){
        int max_from_right = arr[size - 1];
        System.out.print(max_from_right + " ");
        for (int i = size - 2; i >= 0; i--){
            if (max_from_right < arr[i]){
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int size = arr.length;
        printLeadersOptimize(arr,size);
    }
}
