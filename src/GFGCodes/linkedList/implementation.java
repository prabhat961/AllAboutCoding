package GFGCodes.linkedList;
class Node{
    int data;
    Node next;
    Node down;
    Node child;
    Node(int x){
        data = x;
        next = null;
        down = null;
        child = null;
    }
}
public class implementation {
    public static int middleNodevalue(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && slow.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);
        System.out.print("Middle element position in this linked list is:"+middleNodevalue(head));
    }
}
