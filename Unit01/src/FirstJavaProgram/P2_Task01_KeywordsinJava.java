package FirstJavaProgram;

/*
 * - 50 such keywords[reserved words],meanings are defined by the compiler
 * - 48 + 2
 * - 48 use
 * - 2 for future use [goto*, const*]
 * 
 * Future use: goto*,const*
 * 1.2V : assert**
 * 1.4V : strictfp***
 * 5.0V : enum**
 * 
 * - Keywords: can not be used as identifiers in Java
 *  - object
 *  - variable name
 *  - function 
 *  - class 
 *  - etc.
 */

public class P2_Task01_KeywordsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //variable name
		//Syntax error an token "double", invalid variableDeclaratorId
		int double = 12;
		
		//function name
		int new() {
			
			//sysout(ctrl + space)
			System.out.println();
			
			return 0;
			//void methods cannot return a value
		}
		
		//class name [Given below]
		
		//object
		//object name can never be any keywords in java
		ABC int = new ABC();
	}

}
//class name can never be any keywords we have in java
class int{
	void display() {
		System.out.println("Another class!");
	}
}
class ABC{
	void display() {
		System.out.println("Another class!");
	}
}
