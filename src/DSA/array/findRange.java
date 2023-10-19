package DSA.array;

public class findRange {
    public static int printRange(int[] arr){
        int max = arr[0];
        for (int i = 0; i <= arr.length -1; i++){
            if (arr[i] > max)
                max = arr[i];
        }

        int min = arr[0];
        for (int i = 0; i <= arr.length -1; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        int Range = max - min;
        return Range;
    }

    public static void main(String[] args) {
        int[] arr = {21, 31, 54, 87, 98, 54, 23};

        System.out.println("Range of the given array is:"+printRange(arr));
    }
}
