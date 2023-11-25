package GFGCodes.hashing;

import java.util.HashMap;
import java.util.Map;

public class maxOccuring {
	public static void maxOccuringCharactr(String str) {
		HashMap<Character, Integer>hm = new HashMap<>();
		int maxCount = 0;
		char c=' ';
		char[] arr = str.toCharArray();
		for(char ch: arr) {
			if (hm.containsKey(ch)) {
				 hm.put(ch, hm.get(ch)+1);
            }
            else {
                hm.put(ch, 1);
            }
		}
		for(Map.Entry<Character, Integer>me: hm.entrySet()) {
			if (maxCount < me.getValue()) {
				maxCount = me.getValue();
				c = me.getKey();
			}
		}
		 System.out.println("Max repeating character in the given string is:"+c);
	}

	public static void main(String[] args) {
		String str = "aaabbbbbccccccccc";
		maxOccuringCharactr(str);

	}

}