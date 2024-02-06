package DSAbasicsRevision.arrays;

import java.util.*;

import GFGCodes.Matrx.intro;

public class userInput {

	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("ENter the size of array:");
		n = ip.nextInt();
		int[] arr = new int[n];
		System.out.println("ENter the array element:");
		for(int i = 0; i < n; i++) {
			if (ip.hasNext()) {
				arr[i] = ip.nextInt();
			}
			System.out.println(
	                "The elements of the array are: ");
			System.out.println(Arrays.toString(arr));
		}

	}

}
