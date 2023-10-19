package DSA.strings;

public class findDuplicates {
	
	public static void printDuplicate(String str) {
		char[] word = str.toCharArray();
		int count = 0;
		for( int i = 0; i < word.length; i++) {
			for(int j = i + 1; j < word.length; j++) {
				if(word[i] == word[j] && i != j) {
					System.out.print(word[i]+" ");
					count++;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str =  "poojapapa";
        printDuplicate(str);

	}

}
