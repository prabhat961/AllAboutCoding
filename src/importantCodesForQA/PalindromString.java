package importantCodesForQA;

import java.util.Stack;

public class PalindromString {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedString = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromeWIthStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (stack.pop() != c) {
                return false; // Not a palindrome
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palindromeString = "radar";
        if (isPalindromeWIthStack(palindromeString)) {
            System.out.println(palindromeString + " is a palindrome.");
        } else {
            System.out.println(palindromeString + " is not a palindrome.");
        }
    }
}
