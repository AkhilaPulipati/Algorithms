
public class StringRotation {

	public static void main(String[] args) {
		
		System.out.println("Example 1---\n s1 = waterbottle and s2 = erbottlewat\n result:"+ isRotation("waterbottle","erbottlewat"));
		System.out.println("Example 2---\n s1 = Musiclove and s2 = sicloveum\n result:"+ isRotation("Musiclove","sicloveum"));
	}
	private static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if(len == s2.length() && len>0) {
			String s1s1 = s1 +s1;
			return isSubString(s1s1,s2);
		}
		return false;	 
	}
	private static boolean isSubString(String s1s1, String s2) {
		// TODO Auto-generated method stub
		if(s1s1.contains(s2))
			return true;
		return false;
	}

}
