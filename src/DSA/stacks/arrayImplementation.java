package DSA.stacks;

class MyStack{
    int[] arr;
    int top;
    int capacity;

    public MyStack(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    void push(int x){
        if(top==capacity-1){System.out.println("Stack is full");return;}
        top++;
        arr[top]=x;
    }

    int pop(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        int res=arr[top];
        top--;
        return res;
    }

    int peek(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        return arr[top];
    }

    int size(){
        return (top+1);
    }

    boolean isEmpty(){
        return top==-1;
    }
}


public class arrayImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

