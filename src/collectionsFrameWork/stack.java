package collectionsFrameWork;

import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        //Adding Element  to Stack:
        st.push("Prabhat");
        st.push("tukku");
        st.push("Nishal");
        st.push("Shanu");
        st.push("Bobby");
        st.add("Isha");
        System.out.println(st);
        System.out.println("Element poped:"+st.pop());
        System.out.println("Element peeked:"+st.peek());
        System.out.println(st);
        //Iterating a Stack:
        Iterator value = st.iterator();
        while (value.hasNext()){
            System.out.println(value.next());
        }

    }
}
