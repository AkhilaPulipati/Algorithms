// Multiple two integers with out using * operator.
package DynamicProgramming;

public class RecursiveMultiply {

	public static void main(String[] args) {
		
		System.out.println("The multiuple of two integers is:"+ minProduct(31,35));

	}
	static int minProduct(int a, int b) {
		int smaller = (a<b)? a:b;
		int bigger = a<b? b:a;
		return minProductHelper(smaller, bigger);
	}
	static int minProductHelper(int smaller, int bigger) {
		if(smaller == 0)
			return 0;
		if(smaller == 1)
			return bigger;
		int s= smaller>>1;// DIvide by 2
		int side1 = minProductHelper(s, bigger);
		
		int side2 = side1;
		if(smaller%2 == 1)
			side2 = minProductHelper(smaller-s, bigger);
		return side1+side2;
			
		
	}

}
