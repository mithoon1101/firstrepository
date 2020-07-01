
public class ChildClass extends FirstAbstract

{

	public static void main(String[] args)
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();

	}
	void m1()
	{
		System.out.println("m1 from child class");
	}

	@Override
	void m2() 
	{
		System.out.println("i am m2 method from child class");
		
	}

}
