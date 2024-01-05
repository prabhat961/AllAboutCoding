package importantCodesForQA;

import java.util.Stack;

public class stringReverse {
    public static void reverseString(String str){
        String rev = " ";
        for (int i  = str.length()- 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Given String:"+str);
        System.out.println("Reversed String is:"+rev);
    }

    public static String reverseStringOptimize(String str){
        Stack<Character>st = new Stack<>();
        for (int i = 0; i < str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "prabhat";
        reverseString(str);
        System.out.println("After reversal:"+reverseStringOptimize(str));
    }
}
