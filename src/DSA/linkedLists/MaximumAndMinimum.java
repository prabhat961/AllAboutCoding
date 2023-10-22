package DSA.linkedLists;

public class MaximumAndMinimum {
	public static void findMax(Node head) {
		int max = head.data;
		Node curr = head;
		while(curr != null) {
			if(curr.data > max){
				max = curr.data;
				curr = curr.next;
			}
		}
		System.out.println("Maximum Element in the given linked list is:"+max);
	}
	public static void findMin(Node head) {
		int min = head.data;
		Node curr = head;
		while(curr != null) {
			if(curr.data < min){
				min = curr.data;
				curr = curr.next;
			}
		}
		System.out.println("Minimum Element in the given linked list is:"+min);

	}

	public static void main(String[] args) {
		Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);
		findMax(head);
		findMin(head);
	}

}
