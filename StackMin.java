// Stack Min 
package StacksAndQueues;

import java.util.Stack;

public class StackMin{

	public static void main(String[] args) {
		StackWithMin s = new StackWithMin();
		s.push(5);
		s.push(6);
		s.push(3);
		s.push(7);
		s.pop();
		s.pop();
	
	}
}
class StackWithMin extends Stack<NodeWithMin>{

	public  void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
		System.out.println("Inserted element: "+ value);
	}

	public int min(){
		if(this.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		else
			System.out.println("The minimum element is: "+ peek().min);
			return peek().min;
	}
}
class NodeWithMin{
	public int value;
	public int min;
	public NodeWithMin(int v, int min) {
		value = v;
		this.min = min;
	}
}
