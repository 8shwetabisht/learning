package Unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args)throws Exception {
		ABC obj = new ABC();
		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		obj.stackOverFlowError(1);
		obj.indexOutOfBoundException();
		obj.nullPointerException();		
		obj.useOfThrowException (17);
		obj.useOfThrows_And_Finally();
		obj.checked_and_Unchecked();
	}

}
class ABC {
//	Compiler cannot catch this exception at compile time
	void basicException() {
		int b = 0;
		int a = 100/b;
		System.out.println("Done!");
		
	}
	void handleException () {
//		we create try catch block so that rest of the program do not break
		try {
			int b = 0;
			int a = 100/b;
			System.out.println(a);
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
		
	}
	void multipleCatch() {
//		child class is written first then the parent class is written in exception handling
		try {
			int b = 0;
			int a = 100/b;
			System.out.println(a);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage()+ "Arithmeetic Exception");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}
	
	void inputMismatchException() {
//		Whenever take input from the user using the scanner class.
//		If the input passed does not match the method then mismatch exception is thrown
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		System.out.println("you have entered: "+num);
		sc.close();
		} catch (InputMismatchException e) {
			
	        System.out.println(e.getMessage());
	}
		System.out.println("Done!");
	}
	
	void stackOverFlowError(int i) {
//		try-catch block is only for exceptions.
//		error does not go in catch block because they cannot be handled
		try {
			while(i>0) {
				i++;
				stackOverFlowError(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	void indexOutOfBoundException() {
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
		
	}
	
	void nullPointerException() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	
	void useOfThrowException (int age) throws Exception{
		if (age < 18) {
			throw new Exception();
		}else {
			System.out.println("you are allowed to enter");
		}
	}
/*	sometime you don't need to handle the Exception when in multiple method is there, then it can be handled 
	in super most method*/
	void useOfThrows_And_Finally() {
		try {
			useOfThrowException(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("shweta");
		}
	}
	void checked_and_Unchecked() {
		try {
			int b = 0;
			int a = 10/b;System.out.println("10/0="+a);
		}
		catch (ArithmeticException e) {
			System.out.println("unchecked exception");
		}
		System.out.println("Done!");
	}
}
