package DSA.hashing;

public class fourSum {
    public static void somOfFourNaive(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1;j < arr.length; j++){
                for (int k = j+1;k < arr.length; k++){
                    for (int l = k+1;l < arr.length; l++){
                        if (arr[i]+arr[j]+arr[k]+arr[l] == sum) {
                            System.out.println();
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12, 15, 31, 43, 64, 9, 32};
        int sum = 154;
        System.out.println("Elements in array with given sum");
        somOfFourNaive(arr, sum);
    }
}
