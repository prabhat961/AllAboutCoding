package DSA.strings;

import java.util.Arrays;

public class stringAnagram {
    public static boolean chkAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (arr1.length != arr1.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "ttew";

        // Function Call
        if (chkAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }
    }
