package DSA.linkedLists;

import java.util.*;

public class palindrome {
	
	public class PalindromLinkedList {
		//Approach 1: Naive:
		public static boolean isPalindrom(Node head) {
			Deque<Character> stack = new ArrayDeque<>();
			for( Node curr = head; curr != null; curr = curr.next) {
				stack.push((char) curr.data);
			}
			for(Node curr=head;curr!=null;curr=curr.next){
	            if(stack.pop()!=curr.data)
	                return false;
	        }
	        return true;
		}
		
		public static Node reverseList(Node head){
		        if(head==null||head.next==null)return head;
		        Node rest_head=reverseList(head.next);
		        Node rest_tail=head.next;
		        rest_tail.next=head;
		        head.next=null;
		        return rest_head;
		    }
		    
		public static boolean chkPalindrome(Node head){
		        if(head==null)return true;
		        Node slow=head,fast=head;
		        while(fast.next!=null&&fast.next.next!=null){
		            slow=slow.next;
		            fast=fast.next.next;
		        }
		        Node rev=reverseList(slow.next);
		        Node curr=head;
		        while(rev!=null){
		            if(rev.data!=curr.data)
		                return false;
		            rev=rev.next;
		            curr=curr.next;
		        }
		        return true;
		    }

	public static void main(String[] args) {
		

	}

}
}
