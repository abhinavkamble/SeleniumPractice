package AccessModifier;

public class Amplitude 
{
	int a=10;
	private int b=20;
	protected static int c=15;
	public int d=5;
	
	
    public void Addition()
    {
    	int sum=a+b+c+d;
    	System.out.println("Addition is ="+sum);
    }
    
    private void Sub()
    {
    	int Sub=c-a;
    	System.out.println("substraction is "+Sub);
    }
	

	public static void main(String[] args) 
	{
		Amplitude A = new Amplitude();
		System.out.println("This is default Method "+A.a);
		
		System.out.println("This is protected method "+c);
	
		
		A.Addition();
		A.Sub();
		
		

	}

}
