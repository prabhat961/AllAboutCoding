package DSA.linkedLists;

public class middleNode {
	public static int findMiddle(Node head) {
		Node fast = head;
		Node slow = head;
		while(fast.next != null && fast.next.next != null) {
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
		System.out.print("Middle element position in this linked list is:"+findMiddle(head));
			

	}

}
