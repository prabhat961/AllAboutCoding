package DSA.linkedLists;

public class ElementSearch {
	public static boolean searchEle(Node head, int ele) {
		        Node current = head; // Initialize current
		        while (current != null) {
		            if (current.data == ele)
		                return true; // data found
		            current = current.next;
		        }
		        return false; // data not found
		    }

	public static void main(String[] args) {
		Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);
        System.out.println("Element is present in the linked list:"+searchEle(head,90));


	}

}
