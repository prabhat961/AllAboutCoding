package DSA.linkedLists;

public class reverse {
	public static Node RevLL(Node head) {
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
