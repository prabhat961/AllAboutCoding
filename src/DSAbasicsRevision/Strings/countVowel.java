package DSAbasicsRevision.Strings;

import java.util.HashMap;

public class countVowel {
	
	public static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
	
	public static HashMap<Character, Integer> countVowels(String str) {
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        str = str.toLowerCase(); 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            }
        }

        return vowelCount;
    }


	public static void main(String[] args) {
		System.out.println(countVowels("prabhat"));

	}

}
