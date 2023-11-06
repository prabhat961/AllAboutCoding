package DSA.strings;

import java.util.HashMap;
import java.util.Map;

public class maxOccuring {
    public static void  printMaxOccuringCharacterMethodOne(String str){
        int[] arr = new int[127];
        int max = -1;
        char c = ' ';
        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] = arr[str.charAt(i )] + 1;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if (max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println("Max repeating character in the given string is:"+c);
    }

    public static void  printMaxOccuringCharacterMethodTwo(String str){
        HashMap<Character, Integer>hm = new HashMap<>();
        int maxCount = 0;
        char c = ' ';

        char []arr = str.toCharArray();
        for (char ch: arr){
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch)+1);
            }
            else {
                hm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> me: hm.entrySet()){
            if (maxCount < me.getValue()) {
                maxCount =  me.getValue();
                c = me.getKey();
            }
        }
        System.out.println("Max repeating character in the given string is:"+c);

    }




    public static void main(String[] args) {
        String str = "aaabbbbbccccccccc";
        printMaxOccuringCharacterMethodTwo(str);
    }
}
