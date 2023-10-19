package DSA.linkedLists;

public class FindLoop {
	
	public static Node detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		 while (fast!=null && fast.next!=null) { 
	            slow = slow.next; 
	            fast = fast.next.next; 
	            if (slow == fast) { 
	                return slow; 
	            } 
	        }
		 return null;
	      }
	public static Node detectmeetingPoint(Node head) {
		Node meet = detectLoop(head);
		Node start = head;
		while(start != meet) {
			start = start.next;
			meet = meet.next;
		}
		return start;
	}

	public static void main(String[] args) {
		Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	detectLoop(head);
    	Node curr=head;
	        while(curr!=null){
	        System.out.print(curr.data+" ");
	        curr=curr.next;
	    }System.out.println();

	}

}
