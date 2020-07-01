
public class FirstClass 
{
	int a=5;
	int b=2;
	int c;
	
	void Add()
	{
		c=a+b;
		System.out.println("Addition of a and b is " +c);
		
	}
	
	void Sub()
	{
		c=a-b;
		System.out.println( "substraction and b is " +c);
		
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Hi !");
		FirstClass obj=new FirstClass();
		obj.Add();
		obj.Sub();
		
		
		

	}

}
