package Constructor;

public class UserDefineConstructor 
{
	//Define Veriable
	int a;
	int b;
	
	// Create Constructor 
	public UserDefineConstructor()
	{
		a=300;
		b=200;
	
	}

	public static void main(String[] args) 
	{
		UserDefineConstructor UD = new UserDefineConstructor();
		UD.Multiplication();
		UD.Addition();
		UD.substraction();

	}
	public void Multiplication()
	{
		int mul=a*b;
		System.out.println("multiplicatin is "+mul);
		
	}
	 public void Addition ()
	 {
		 int add=a+b;
		 System.out.println("Addition is "+add);
	 }
	 
	 public void substraction()
	 {
		 int sub=a-b;
		 System.out.println("substraction is "+sub);
		 
	 }

}
