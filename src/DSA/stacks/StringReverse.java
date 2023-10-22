package DSA.stacks;

import java.util.Stack;

public class StringReverse {
    public static void reverse(StringBuffer str)
    {
        // Create a stack of capacity
        // equal to length of string
        int n = str.length();
        Stack<Character> obj = new Stack();

        // Push all characters of string
        // to stack
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        // Pop all characters of string
        // and put them back to str
        for (i = 0; i < n; i++){
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("prabhat ");
        System.out.println("the original string is:"+sb);
        reverse(sb);
        System.out.println("the reversed string is:"+sb);
    }
}
