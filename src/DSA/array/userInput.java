package DSA.array;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int n;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = ip.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++){
            if (ip.hasNextInt()) {
                arr[i] = ip.nextInt();
            }
        }
        System.out.println(
                "The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            // prints the elements of an array
            System.out.print(arr[i] + " ");
        }
        ip.close();

    }
}
