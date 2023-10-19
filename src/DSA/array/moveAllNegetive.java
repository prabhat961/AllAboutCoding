package DSA.array;

import java.util.Arrays;

public class moveAllNegetive {

    public static void shiftall(int[] arr, int left,
                                int right) {
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else {
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };
        System.out.println(Arrays.toString(arr));
        shiftall(arr,0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

}
