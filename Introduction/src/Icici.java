
public class Icici implements Rbi


{

	public static void main(String[] args)
	{
		Icici obj=new Icici();
		obj.Deposite();
		obj.Withdraw();

	}

	@Override
	public void Withdraw() 
	{
		System.out.println("iam withdraw money from from icici");
		
	}

	@Override
	public void Deposite() 
	{
		
		System.out.println("deposite money to icici");
	}

}
