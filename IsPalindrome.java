package LinkedListNode;

public class IsPalindrome {
	public static void main(String args[]) {
		LinkedListNode start = new LinkedListNode(0);
	       start.next = new LinkedListNode(1);
	       start.next.next = new LinkedListNode(2);
	       start.next.next.next = new LinkedListNode(1);
	       start.next.next.next.next = new LinkedListNode(6);
	       
	       System.out.println("Original linkedlist :");
	       printList(start);

	      System.out.println("Output:"+ isPalindrome(start));


	}
	static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode reversed = reverseAndClone(head);
		return isEqual(head, reversed);
		
	}
	static LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = null;
		while(node!=null) {
			
			LinkedListNode n = new LinkedListNode(node.data);// CLone
			n.next = head;
			head = n;
			node = node.next;
			
		}
		return head;
	}
	static boolean isEqual(LinkedListNode one, LinkedListNode two) {
		while(one!= null && two!= null) {
			if(one.data!= two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
	 static void printList(LinkedListNode head)
	    {
	        while (head != null)
	        {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	       
	    }
}
