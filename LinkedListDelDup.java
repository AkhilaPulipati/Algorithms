// Remove duplicates from an unsorted linked list using HashSet.

package LinkedListNode;

import java.util.HashSet;
import java.util.LinkedList;
import LinkedListNode.LinkedListNode;


public class LinkedListDelDup {
	 
	public static void main(String args[]) {
		
       LinkedListNode start = new LinkedListNode(10);
       start.next = new LinkedListNode(12);
       start.next.next = new LinkedListNode(11);
       start.next.next.next = new LinkedListNode(11);
       start.next.next.next.next = new LinkedListNode(12);
       start.next.next.next.next.next = new LinkedListNode(11);
       start.next.next.next.next.next.next = new LinkedListNode(10);
       start.next.next.next.next.next.next.next = new LinkedListNode(2);
       
       System.out.println("Linked list before removing duplicates :");
       printList(start);

       deletedups(start);

       System.out.println("\nLinked list after removing duplicates :");
       printList(start);
	}
	private static void deletedups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev = null;
		while(n!= null) {
			if(set.contains(n.data)) {
				prev.next = n.next;
			}
			else {
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
	/* Function to print nodes in a given linked list */
    static void printList(LinkedListNode head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
       
    }

}
