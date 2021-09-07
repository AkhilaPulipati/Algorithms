package LinkedListNode;


public class FindBeginning {

	public static void main(String[] args) {
		LinkedListNode start = new LinkedListNode();
		start.next = new LinkedListNode(2);
		start.next.next = new LinkedListNode(3);
		start.next.next.next = new LinkedListNode(4);
		start.next.next.next.next = new LinkedListNode(5);
		start.next.next.next.next.next = new LinkedListNode(3);	
		
		
		System.out.println("The linkedlist is:");
		printList(start);
		
		System.out.println("begin: "+findBegining(start));
		//printList(start);

	}
	static LinkedListNode findBegining(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		while(fast!=null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				break;
		}
		if(fast==null || fast.next==null) {
			return null;
		}
		slow = head;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
	public static void printList(LinkedListNode head) {
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	

}
