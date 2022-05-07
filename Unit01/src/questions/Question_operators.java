package questions;
import java.util.Scanner;

class operator{
	int addition(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}
	int subtraction(int firstNumber, int secondNumber) {
		return firstNumber-secondNumber;
	}
}

public class Question_operators {

	public static void main(String[] args) {
		System.out.println("Enter 2 number of your choice: ");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		operator obj = new operator();
		int C = (A>B)?obj.addition(A,  B):obj.subtraction(A,  B);
		System.out.println(C);

	}

}
