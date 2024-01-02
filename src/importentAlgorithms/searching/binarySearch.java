package importentAlgorithms.searching;

public class binarySearch {
    public static int searchBinaryIterative(int[] arr, int ele, int lo, int hi) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == ele)
                return mid;


            if (arr[mid] < ele)
                lo = mid + 1;


            else
                hi = mid - 1;
        }
        return -1;

    }

    public static int searchBinaryRecursive(int[] arr, int ele, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == ele)
                return mid;

            if (arr[mid] > ele)
                return searchBinaryRecursive(arr, ele, lo, mid - 1);

            return searchBinaryRecursive(arr, ele, mid + 1, hi);
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = searchBinaryRecursive(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
