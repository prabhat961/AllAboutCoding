package importantCodesForQA;

import java.util.LinkedHashMap;
import java.util.Map;

public class stringCompressionwithOrderMaintained {
    public static void stringCompression(String str){
        char[] arr = str.toCharArray();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (char ch: arr){
            if (lhm.containsKey(ch)){
                int vl = lhm.get(ch);
                lhm.put(ch, vl+1);
            }
            else {
                lhm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> me:lhm.entrySet()){
            System.out.print(me.getKey()+""+me.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "banana";
        stringCompression(str);
    }
}
