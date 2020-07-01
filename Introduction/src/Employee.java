
public class Employee extends newclass
{
 
	
	String adress;

	
	public Employee(String adress) 
	{
		super(30,"mithun",40.1f);
		this.adress=adress;
		System.out.println(this.adress);
	}





	public static void main(String[] args) 
	{
		
		Employee ec=new Employee("hyderabad");
		
	}

}
