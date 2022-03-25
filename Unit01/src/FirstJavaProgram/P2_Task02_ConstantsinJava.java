/*
* -Constants never Change once a value is assigned
 * private:"Inside Class Only"
 * protected:Class+Same Package
 * public Class+Within the Package+Outside the Package
 * Default:No Keywords,Package-private{Not Outside the Package }
 * 
 */
 package FirstJavaProgram;

public class P2_Task02_ConstantsinJava {
	//final keyword is used for assigning a constant value which will remain same throughout the program
	public static final double Pi=3.14;

	public static void main(String[] args) {
		System.out.println(Pi);
		main("Callingtheprogram");
		
		//syntax for creating new object
		//class_name variable/object name=new class_name()
		NewClass obj=new NewClass();
		obj.add(1,2);
		System.out.println(obj.Pi);

	}
	public static void main(String args)
	{
		System.out.println(Pi);
	}
    void add(int a,int b)
    {
    	System.out.println(a+b);
    	System.out.println(Pi);
    }
}
class NewClass{
	void add(int a,int b) {
		//final double Pi=3.18 {constant value can't  be modified}
	System.out.println(a+b);
	//value of pi is imported from class P2_Task02_ConstantsInJava into the new class created
	//another way of resolving the problem is by declaring the variable globally
	//
	System.out.println(P2_Task02_ConstantsInJava.Pi);
	}
}
	
