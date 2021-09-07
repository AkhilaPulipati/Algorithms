// Operate push, pop and Find the minimum value by maintaining a separate stack
package StacksAndQueues;

import java.util.*;

public class StackMinimum{

	public static void main(String[] args) {
		StackWithMin2 s = new StackWithMin2();
		s.push(5);
		s.push(6);
		s.push(3);
		s.push(1);
		s.pop();
		s.pop();
	    System.out.println("Remining elements in stack: "+s);
	

	}

}
class StackWithMin2 extends Stack<Integer>{
	public Stack<Integer> s2;
	public StackWithMin2(){
		s2 = new Stack<Integer>();
	}
	public void push(int value) {
		if(value <= min())
			s2.push(value);
		System.out.println("ELement Inserted: "+ value);
		super.push(value);
		
	}
	public Integer pop() {
		int value = super.pop();
		if(value == min())
			s2.pop();
		System.out.println("Element popped "+ value);
		return value;
	}
	public int min() {
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		System.out.println("Min is: "+ s2.peek());
		return s2.peek();
	}
	
}
