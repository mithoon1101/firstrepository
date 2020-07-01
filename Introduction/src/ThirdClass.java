
public class ThirdClass 
    {
	
	int a=10;
	int b=20;
	int c;
	
	void Add()
	{
		c=a+b;
		System.out.println("Addition of a and b is:"+c);
	}
	 void Sub()
	 
	 {
		 c=a-b;
		 System.out.println("substraction of a and b is:" +c);
		 
	 }

	
	public static void main(String[] args)
	{
	 ThirdClass obj=new ThirdClass();
	 obj.Add();
	 obj.Sub();
	 
	 ThirdClass obj1=new ThirdClass();
	 
	 obj1.Add();
	 obj1.Sub();
		

	}

}
