package importantCodesForQA;

public class reverseWords {
	
	public static void wordReverse(String str) {
		String[] words = str.split(" ");
		String reverseString = " ";
		for (String w: words) {
			String reverseWord = " ";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord +" ";
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		String string = "Welcome to Java";
		System.out.println("Correct string is:"+string);
		System.out.println("Reversed String is:");
		wordReverse(string);

	}

}
