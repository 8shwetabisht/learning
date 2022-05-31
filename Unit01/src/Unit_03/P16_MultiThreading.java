package Unit_03;

import java.util.Scanner;

/* MultTthreading pre-requisite
Multiprocessing:
-Type1 sequential multiprocessing: Not used in present time
-Type2 parallel multiprocessing: We don't use this as it is expensive and we have to increase the core
-Type3 concurrent multiprocessing: It is close to parallel processing but not actual parallel and it is efficient.
                                   It uses context switch technique which is manage by operating system
                                   Number of process is decided by user but how they will be processed id decided by OS
Multitasking: Dividing task into sub task
-Type1 sequential multitasking
-Type2 parallel multitasking
-Type3 concurrent multitasking
*/

// Program Counter holds the address of next instruction executed
// MultiThreading: Task should be independent. So that it can find the independent task on the program

public class P16_MultiThreading {

	public static void main(String[] args) {
//		MultiThreadingInJava obj = new MultiThreadingInJava();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();
//		C1 obj1 = new C1();
//		C2 obj2 = new C2();
//		obj1.show1();
//		obj2.show2();
		Thread t1 = new Thread(new T1(), "T1" );
		Thread t2 = new Thread(new T2(), "T2" );
		Thread t3 = new Thread(new T3(), "T3" );
		t1.start();
		t2.start();
		t3.start();
	}

}
//class MultiThreadingInJava {
//	void threadConcept() {
//		
//	}
//	void threadSynchronization() {
//		
//	}
//	void interThreadCommunication() {
//		
//	}
//	void ProducerConsumerProblems() {
//		
//	}
//	void Wait_And_Notify() {

// }

class C1{
	void show1()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
				
	}
}

class C2{
	void show2()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("hey-2");
		}
	}
}

class T1 extends Thread {
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
				
	}
}

class T2 extends Thread{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("hey-2");
		}
	}
}

class T3 extends Thread{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("hey-3");
		}
	}
}
