package DSA.linkedLists;

public class CountOccurance {
	public static int occurance(Node head, int ele) {
		int count = 0;
		 Node current = head; // Initialize current
	        while (current != null) {
	            if (current.data == ele)
	                count++;
	            current = current.next;
	        }
	        return count;
	}

	public static void main(String[] args) {
		Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);
        head.next.next.next.next.next = new Node (10);
        head.next.next.next.next.next.next = new Node (10);
        head.next.next.next.next.next.next.next = new Node (10);
        head.next.next.next.next.next.next.next.next = new Node (10);
        System.out.println("No of times element appeard is:"+occurance(head, 10));


	}

}
