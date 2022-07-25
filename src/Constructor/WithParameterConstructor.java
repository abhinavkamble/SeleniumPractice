package Constructor;

public class WithParameterConstructor 
{
    String a;
    String b;
    String c;
    
    public WithParameterConstructor(String Name,String Name1,String Name2)
    {
    	a=Name;
    	b=Name1;
    	c=Name2;
    	
    }

	public static void main(String[] args) 
	{
		WithParameterConstructor WPC = new WithParameterConstructor("XY  ","YZ  ","ZX  ");
		WPC.StudentInfo();
	
	}
	public void StudentInfo()
	{
		String Na=a+b+c;
		System.out.println("My name is "+Na);
	}
	

}
