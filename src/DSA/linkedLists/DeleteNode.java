package DSA.linkedLists;

public class DeleteNode {
	
	  public static Node deleteN(Node head, int position) {
		    Node temp = head; // Create a temporary node pointing to the head of the linked list
		    Node prev = head; // Create a previous node pointing to the head of the linked list
		 
		    for (int i = 0; i < position; i++) { // Loop through the linked list to find the node at the given position
		      if (i == 0 && position == 1) { // If the node to delete is the head
		        head = head.next; // Set the next node as the new head
		      } else {
		        if (i == position - 1 && temp != null) { // If the node to delete is found
		          prev.next = temp.next; // Set the next node of the previous node to be the next node of the current node
		        } else {
		          prev = temp; // Move the previous node to the current node
		           
		          // If the previous node is null, the position was greater than the number of nodes in the list
		          if (prev == null) 
		            break;
		          temp = temp.next; // Move the temporary node to the next node
		        }
		      }
		    }
		    return head; // Return the new head of the linked list
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
