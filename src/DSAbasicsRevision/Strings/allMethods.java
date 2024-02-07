package DSAbasicsRevision.Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class allMethods {
	public static void userInput(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		str = input.next();
		System.out.println("User entered:"+str);
	}
==================================================================================================	 
public static void stringCompressionWithNoOrder(String str) {
		for(char c = 'a'; c<= 'z'; c++) {
			int count = 0;
			for(int i = 0; i <= str.length(); i++) {
				if (str.charAt(i) == c) {
					count++;
					}
				if (count != 0) 
					System.out.print(c+" "+count);
			}
		}
	}
===================================================================================================
public static void stringCompressionWithOrder(String str) {
	LinkedHashMap<Character,Integer>lm = new LinkedHashMap<>();
	char[] arr = str.toCharArray();
	for (char ch: arr){
        if (lm.containsKey(ch)){
            int vl = lm.get(ch);
            lm.put(ch, vl+1);
        }
        else {
        	lm.put(ch, 1);
        }
    }
	for (Map.Entry<Character, Integer>me:lm.entrySet()) {
		System.out.print(me.getKey()+""+me.getValue());
	}
}
=====================================================================================================
public static void findDuplicate(String str) {
	char[] arr = str.toCharArray();
	for(int i = 0; i < arr.length;i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]== arr[j] && i != j) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
====================================================================================================
public static String reverseString(String str) {
	String rev = "";
	for(int i = str.length(); i >= 0; i--) {
		rev = rev + str.charAt(i);
	}
	return rev;
}
====================================================================================================
public static boolean chkAnagram(String str1, String str2) {
	char[] arr1 = str1.toCharArray();
	char[] arr2 = str2.toCharArray();
	if (arr1.length != arr2.length) {
		return false;
	}
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i] != arr2[i]) 
			return false;
		}
	return true;
	
}
======================================================================================================
public static String reverseWords(String input) {
    String[] words = input.split("\\s+");
    StringBuilder reversedString = new StringBuilder();
    for (String word : words) {
        String reversedWord = reverseWords(word);
        reversedString.append(reversedWord).append(" ");
    }
    return reversedString.toString().trim();
}
========================================================================================================
public static String reverseWord(String word) {
    char[] charArray = word.toCharArray();
    int left = 0;
    int right = charArray.length - 1;
    while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        left++;
        right--;
    }
    return new String(charArray);
}
=========================================================================================================
public static boolean isPalindrome(String str) {
    str = str.toLowerCase();
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
            right--;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
============================================================================================================


	public static void main(String[] args) {
		

	}

}
