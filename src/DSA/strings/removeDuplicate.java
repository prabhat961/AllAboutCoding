package DSA.strings;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static String remDups(String str) {
        String uniq = " ";
        Set<Character> uni = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uni.add(str.charAt(i));
        }
        for (char ch : uni) {
            uniq = uniq + ch;
        }
        return uniq;
    }

    public static void main(String[] args) {
        System.out.println("Unique Srting in the given is:"+remDups("aaaaaabbbbbccccaaabbbdddd"));
    }
}
