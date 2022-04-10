package FirstJavaProgram;

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();

	}

}

class StringInJava {
	
	void StringDefinition() {
		 String s = "Hello There!";
		 String s1 = new String("hghggf");
		 
		 System.out.println(s);
		 
		 //Get length of a string
		 System.out.println(s.length());
		 
		 //loop through a string!
		 for (int i = 0; i < s.length(); i++) {
			 System.out.println(s.charAt(i));;
		 }
		 
		 String first = "Shweta";
		 String second = "Bisht";
		 
		 //Add two strings
		 String third = first + second;
		 System.out.println(third);
		 
		 //compare two string;
		 boolean result1 = first.equals(second);
		 System.out.println(result1);
		 
		 /* Java Strings are Immutable
		  *  In Java, the JVM maintains a string pool to store all of its string inside the memory.
		  *  The string pool helps in reusing the strings.
		  *     - If the string already exists, the new string is not created.
		  *     Instead, the new reference, example points to the already existed string (Java).
		  *     - If the string doesn't exist, the new string (Java is created)
		  */
		 String fourth = "Shweta";
		 String fifth = new String("Bisht!");
	}
	/*
	 * Character Arrays are mutable but Strings are not
	 * 
	 */
	void charAndString() {
		
		char[] ch = { 'H', 'e', 'l', 'l', 'O', ' ', 'T', 'h', 'e', 'r', 'e', '!' };
		char[] ch2 = { '!', '!' };
		
		System.out.println(ch);;
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		//Character Arrays are mutable but Strings are not!
		ch[0] = 'h';
		// s1.charAt(0) = 'h';
		
		/*
		 * Join Two Java Strings - +' can be used to appended strings together to form a new string-
		 * but not possible in char array
		 */
		
		s1 = s1 + 'a'; //s1 is new object with new memory
		// ch = ch + ch2;
		
		//String to char array
		String  s2 = "GEEKS";
		char[] ch4 = s2.toCharArray();
		
		//char array to string
		char[] a2 = { 'A', 'K', 'A' };
		String s3 = new String(a2);
		
	}
}
