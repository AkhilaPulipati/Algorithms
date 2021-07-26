/*Algorithm to determine if a string has all unique characters
without using additional data structure.*/

public class UniqueChar {

	public static void main(String[] args) {
		System.out.println( isUniqueChars("abcdefghij"));

	}

	static boolean isUniqueChars(String str) {
		// TODO Auto-generated method stub
		if(str.length() >128) return false;
		//System.out.println(str.length());
		boolean[] char_set = new boolean[128];
		for(int i =0; i<str.length();i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		
		}
		return true;
		
	}

}
