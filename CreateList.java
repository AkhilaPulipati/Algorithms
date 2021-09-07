package LinkedListNode;
public class CreateList {  
  
 
  
    public static void main(String[] args) {  
    	LinkedListNode cl = new LinkedListNode(); 
    	CreateList ob = new CreateList();
        //Adds data to the list  
    	cl.next = new LinkedListNode(1);
    	cl.next.next = new LinkedListNode(2);
    	cl.next.next.next = new LinkedListNode(3);
    	cl.next.next.next.next = new LinkedListNode(4);
    	cl.next.next.next.next.next = new LinkedListNode(5);
        ob.printList(cl);
        System.out.println("begin: "+ob.findBegining(cl));
    }  
   

	public LinkedListNode findBegining(LinkedListNode head) {
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
	public void printList(LinkedListNode head) {
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

    //Displays all the nodes in the list  
    public void display(LinkedListNode head) {  
        LinkedListNode current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
            while(current != head){  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }
            System.out.println();  
        }  
    }  

}  