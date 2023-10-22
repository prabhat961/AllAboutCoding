package DSA.stacks;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class MyStackll{
    Node head;
    int sz;
    MyStackll(){
        head=null;
        sz=0;
    }

    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }

    int pop(){
        if(head==null){return Integer.MAX_VALUE;}
        int res=head.data;
        Node temp=head;
        head=head.next;
        sz--;
        return res;
    }

    int peek(){
        if(head==null){return Integer.MAX_VALUE;}
        return head.data;
    }

    int size(){
        return sz;
    }

    boolean isEmpty(){
        return head==null;
    }
}

public class LinkedListImplementation {
    public static void main (String[] args)
    {
        MyStackll s=new MyStackll();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
