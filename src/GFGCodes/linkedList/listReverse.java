package GFGCodes.linkedList;

public class listReverse {
    public static Node revLL(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
        }
        return prev;
    }

    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);

        System.out.println("Given linked list");
        printList(head);
        head = revLL(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
    }
}
