package Assignment_01;

public class Question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A a1 = new A();
		    A a2 = new A();
		    A a3 = new A();
		    a1.fun();
		    a2.fun();
		    a3.fun();
		    System.out.println("total number of call for the member function : " +A.b);
			}

		}


		class A
		{
			static int b ;
			 void fun ()
			{
				b++;
				
				
			}

	}


