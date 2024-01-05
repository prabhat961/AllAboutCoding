package importantCodesForQA;

import java.util.Arrays;

public class stringAnagram {
    public static boolean isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (arr1.length != arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length;i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        String str1= "papa";
        String str2 = "appa";
        System.out.println("the given String is anagram:"+isAnagram(str1, str2));
    }
}
