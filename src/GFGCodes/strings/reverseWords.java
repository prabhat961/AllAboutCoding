package GFGCodes.strings;

import java.util.Arrays;

//Given a string, the task is to reverse the order of the words in the given string.
// 1st method will reverse the sentence with each word also
public class reverseWords {
public static void wordReverssing(String str) {
    String rev =" ";
    String[] split = str.split("");
    for (int i = str.length() - 1; i >= 0; i--){
        rev = rev + (split[i] + "");
    }
    System.out.println(rev.trim());
}

//
static void reverse(char str[], int start, int end)
{
    char temp;
    while (start <= end) {
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        start++;
        end--;
    }
}

static char[] wordReverssingtwo(char[] s)
{
	int start = 0;
    for (int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
            reverse(s, start, end);
            start = end + 1;
        }
    }
    reverse(s, start, s.length - 1);
    reverse(s, 0, s.length - 1);
    return s;
}




	public static void main(String[] args) {
		String str = "my name is prabhat";
		char[] strarr = wordReverssingtwo(str.toCharArray());
		System.out.println(strarr);
		wordReverssing("my name is prabhat");

	}

}
