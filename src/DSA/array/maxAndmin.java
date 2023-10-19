package DSA.array;

public class maxAndmin {

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <= arr.length -1; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i <= arr.length -1; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {21, 31, 54, 87, 98, 54, 23};
        System.out.println("Maximum of all element presnt in this array is:"+findMax(arr));
        System.out.println("Minimum of all element presnt in this array is:"+findMin(arr));
    }
}
