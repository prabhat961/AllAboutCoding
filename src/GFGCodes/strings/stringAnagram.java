package GFGCodes.strings;

import java.util.Arrays;

//Given two strings. The task is to check whether the given strings are anagrams of each other or not. An anagram of a string is
//another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc”
//are an anagram of each other.

public class stringAnagram {
	public static boolean isAnagramOne(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) 
				return false;
			}
		return true;
	}

	public static void main(String[] args) {
		
			System.out.println(isAnagramOne("gram", "ramg"));
	}

}
