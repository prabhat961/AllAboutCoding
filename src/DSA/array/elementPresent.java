package DSA.array;

public class elementPresent {
    public static boolean isPresent(int[] arr, int n){
        for (int i = 0; i <= arr.length -1; i++){
            if (arr[i] == n)
                return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {21, 31, 54, 87, 98, 54, 23};
        int n = 105;
        System.out.println("is the given element is present in the array:"+isPresent(arr, n));
    }
}
