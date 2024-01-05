package importantCodesForQA;

import java.util.HashMap;
import java.util.Map;

public class maxOccuringCharacter {

    public static void printMaxoccuringCharacterwithArray(String str){
        int[] arr = new int[127];
        int max = -1;
        char c= ' ';
        for (int i = 0; i < str.length();i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
        }
        for (int i = 0; i < str.length();i++){
            if (max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println("Max repeating character in the string is:"+c);

    }
    public static void printMaxoccuringCharacterwithMap(String str){
        int maxCount = 0;
        char c = ' ';
        HashMap<Character, Integer>mp = new HashMap<>();
        char[] chararr = str.toCharArray();
        for (char ch: chararr){
            if (mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> me:mp.entrySet()){
            if (maxCount <  me.getValue()){
                maxCount = me.getValue();
                c = me.getKey();
            }
        }
        System.out.println("Max repeating character in the string is:"+c);
    }

    public static void main(String[] args) {
        String str = "aaaabbbbbcccccccccccccccc";
        printMaxoccuringCharacterwithMap(str);
    }
}
