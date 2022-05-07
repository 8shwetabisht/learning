package Unit_02;
/*class counting{
	static int c = 0;
	static int b = 0;
	{
		b++;
	}
	void display() {
		c++;
	}
}
*/
/*class addition{
	static int a = 23;
	static int b = 12;
	int sum = a + b;
	
}*/
public class Trial {
	String empName;
	int empAge;
	
	Trial(String name, int age){
		this.empName = name;
		this.empAge = age;
	}
	void info() {
		System.out.println("name: "+empName+ "age: "+empAge);
		
	}
	

	public static void main(String[] args) {

		Trial obj1 = new Trial("Shweta", 20);
		Trial obj2 = new Trial("Aditi", 20);
		obj1.info();
		obj2.info();
		

		
	}
	

}
