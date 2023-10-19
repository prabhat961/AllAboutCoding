package DSA.strings;

public class LongestPalindromicSubString {
    public static String LPS (String str){
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++){
            int len1 = expandfromCentre(str, i , i+1);
            int len2 = expandfromCentre(str, i , i);
            int len = Math.max(len1, len2);
            if (end - start < len){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return str.substring(start, end + 1);
    }


    public static int expandfromCentre(String str, int i, int j){
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)){
            i--; j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring is:"+LPS("babad"));

    }
}
