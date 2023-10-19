package DSA.array;

import java.util.ArrayList;

public class commonInThreeArray {
	//Method 1: Without Duplicate
	public static ArrayList<Integer>commonELement(int[] a,int[] b,int[] c, int n1, int n2, int n3 ){
		int i = 0;
		int j = 0;
		int k = 0;
		ArrayList<Integer>res = new ArrayList();
		while(i < n1 && j < n2 && k < n3) {
			if(a[i] == b[j] && b[j] == c[k]) {
				res.add(a[i]);
				i++;
				j++;
				k++;
				continue;
			}
				else if(a[i] < c[k]) {
					i++;
				}
				else if (b[j] < c[k]) {
					j++;
				}
				else {
					k++;
				}
		}
		return res;
		}
		
	public static void main(String[] args) {
		
	}

}
