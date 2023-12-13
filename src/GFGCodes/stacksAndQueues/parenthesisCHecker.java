package GFGCodes.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class parenthesisCHecker {
    public static boolean bracketBalancing(String str){
        Deque<Character>dq = new ArrayDeque<>();
            for(int i = 0; i < str.length(); i++){
                char x = str.charAt(i);
                if (x=='('|| x == '{'|| x == '['){
                    dq.push(x);
                    continue;
                }
                if (dq.isEmpty())
                    return  false;

                char check;
                switch (x){
                    case ')':
                        check = dq.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = dq.pop();
                        if(check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = dq.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }
            return dq.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (bracketBalancing(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
