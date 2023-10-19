package DSA.linkedLists;

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

public class Implementation {
    public static void midNode(Node head){
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            count++;
            curr = head;
            for (int i = 0; i < count / 2; i++)
                curr = curr.next;
            System.out.println(curr.data);
        }
    }
    public static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;


        }
    }

    public static void main(String[] args) {
        Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);

        printList(head);
        System.out.println("Middle Node is:");
        midNode(head);

    }
}
