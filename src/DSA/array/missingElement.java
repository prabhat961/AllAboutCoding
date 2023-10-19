package DSA.array;

public class missingElement {
    public static int missingInRange(int[] arr, int start, int end){
        int sumofRange = end*(end + 1)/2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++){
            arraySum = arraySum + arr[i];
        }
        int missingElement = sumofRange - arraySum;
        return missingElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        System.out.println("Missing element in this array is:"+missingInRange(arr, 1, 7));
    }
}
