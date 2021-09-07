// LinkedListNode package, which is used in LinkedList Problems.

package LinkedListNode;


public class LinkedListNode {
	public LinkedListNode last, prev, next;
	public int data;
	public int number;
	public LinkedListNode() {
		
	}
	public LinkedListNode(int d) {
		data = d;
	}
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
		data = d;
		setNext(n);
		setPrev(p);
		
	}
	public void setNext(LinkedListNode n) {
		next = n;
		if(this == last) {
			last = n;
		}
		if(n!= null && n.prev!= this) {
			n.setPrev(this);
		}
	}
	public void setPrev(LinkedListNode p) {
		prev = p;
		if(p!=null && p.next!= this) {
			p.setNext(this);
		}
	}
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if(next != null) {
			next2 = next.clone();
		}
		LinkedListNode head2 = new LinkedListNode(data, next2, null);
		return head2;
		
	}
	//Declaring head and tail pointer as null.  
    public LinkedListNode head = null;  
    public LinkedListNode tail = null;  
  
    //This function will add the new node at the end of the list.  
    public void add(int data){  
        //Create new node  
    	LinkedListNode newNode = new LinkedListNode(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }  
  
	

}
