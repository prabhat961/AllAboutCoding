package DSA.array;

public class occurance {

    public static int countOccurance(int[] arr, int ele){
        int count = 0;
        for (int i = 0; i <= arr.length -1;i++){
            if (arr[i] == ele)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {24, 32, 89, 24, 11, 64, 24, 19, 15, 24};
        System.out.println("element repeated:"+countOccurance(arr, 24)+" "+"times");

    }
}
