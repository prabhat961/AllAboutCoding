package DSA.strings;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class stringCompression {
    public static void stringCompressionwithOrdering(String str){
        char[] arr = str.toCharArray();
        LinkedHashMap<Character, Integer>lh = new LinkedHashMap<>();
        for (int i = 0;  i < arr.length; i++){
            if (lh.containsKey(arr[i])){
                lh.put(arr[i], lh.get(arr[i])+1);
            }
            else {
                lh.put(arr[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> mapElement : lh.entrySet())
            System.out.print(mapElement.getKey()+""+mapElement.getValue());
    }

    public static void main(String[] args) {
        String str = "bananaaaa";
        stringCompressionwithOrdering(str);
    }
}
