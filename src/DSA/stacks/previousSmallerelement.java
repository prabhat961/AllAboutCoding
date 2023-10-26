package DSA.stacks;

import java.util.Stack;

public class previousSmallerelement {
    public static void previousSmallerelements(int[] arr){
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            while (!st.empty() && st.peek() >= arr[i] ){
                st.pop();
            }
            if (st.empty()){
                System.out.println(-1);
            }
            else {
                System.out.print(st.peek()+" ");
            }
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr ={4, 10, 5, 18, 3, 12, 7};
        System.out.println("Previous smaller element is:");
        previousSmallerelements(arr);
    }
}
