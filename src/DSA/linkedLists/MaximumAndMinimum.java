package DSA.linkedLists;

public class MaximumAndMinimum {
	public static int findMax(Node head) {
		int max = head.data;
		Node curr = head;
		while(curr != null) {
			if(curr.data > max){
				max = curr.data;
				curr = curr.next;
			}
		}
		return max;
	}
	public static int findMin(Node head) {
		int min = head.data;
		Node curr = head;
		while(curr != null) {
			if(curr.data < min){
				min = curr.data;
				curr = curr.next;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Node head = new Node (10);
        head.next = new Node (20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        head.next.next.next.next = new Node (50);
        System.out.println("Maximum element is present in the linked list:"+findMax(head));
        System.out.println("minimum element is present in the linked list:"+findMin(head));

	}

}
