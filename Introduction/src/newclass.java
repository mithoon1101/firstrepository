
  public class newclass
{
	
	
	int eno;
	String ename;
	float sal;

	
	
	public newclass()
	{
		System.out.println("i am default constructor from newclass");
	}
	
	public newclass(int eno)
	{
		this();
		this.eno=eno;
		System.out.println(this.eno);
	}
	 

	public newclass(int eno, String ename)
	{

		this(10);
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		
	}

	public newclass(int eno, String ename, float sal) 
	{
		this(20,"kumar");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}


	public static void main(String[] args) 
	{
		
		newclass ec=new newclass(30,"mithun",40.1f);
		
		
		
		
		
		
		
		
		

	}

}
