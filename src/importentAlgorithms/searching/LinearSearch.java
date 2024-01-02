package importentAlgorithms.searching;

public class LinearSearch {
    public static int searchLinear(int[] arr, int ele){
        for (int i = 0; i < arr.length; i++){
            if (i == ele)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 7, 5 };
        int ele = 9;
        int result = searchLinear(arr, ele);

        if (result == -1)
            System.out.print("Element not found");
        else
            System.out.print("Element found at index: " + result);
    }
}
