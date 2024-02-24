package DSA.strings;

import java.util.HashMap;
import java.util.Map;

public class countVowel {
	public static int countVowelinWord(String str) {
		int count = 0;
		for(int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
================================================================================================================================	
	 
	private static boolean isVowel(char ch) {
	        return "aeiouAEIOU".indexOf(ch) != -1;
	    }
=================================================================================================================================	 
	 
	 public static void printMaxVowelWord(String[] words) {
	        String maxVowelWord = null;
	        int maxVowelCount = 0;

	        for (String word : words) {
	            int vowelCount = countVowelinWord(word);
	            if (vowelCount > maxVowelCount) {
	                maxVowelCount = vowelCount;
	                maxVowelWord = word;
	            }
	        }

	        if (maxVowelWord != null) {
	            System.out.println("Word with maximum vowels: " + maxVowelWord);
	        } else {
	            System.out.println("No word with vowels found.");
	        }
	    }

=============================================================================================================================
	
	public static void countEachVowelinWord(String str) {
		HashMap<Character, Integer>map = new HashMap<>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		
		for(char ch: str.toCharArray()) {
			if(isVowel(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
		}
		for(Map.Entry<Character, Integer>mp: map.entrySet()) {
			if (mp.getValue()!=0) {
				System.out.print(mp.getKey()+" "+mp.getValue());
			}
		}
	}

==============================================================================================================================

	public static void main(String[] args) {
		System.out.println("No. of Vowel in the given word is:"+countVowelinWord("aeroplane"));
		countEachVowelinWord("aeroplane");
		String[] words = {"hi", "hello", "Good Afternoon", "Good Evening"};
		printMaxVowelWord(words);
		}

}
