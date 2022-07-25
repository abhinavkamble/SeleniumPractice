package Constructor;

public class WithParameterPractice 
{
	String a;
	String b;
	String c;
	String d;
	String e;
	
	 public WithParameterPractice(String X,String Y ,String Z,String A,String B)
	 {
		a=X;
		b=Y;
		c=Z;
		d=A;
		e=B;
	 }
	
	

	public static void main(String[] args) 
	{
		WithParameterPractice WPC = new WithParameterPractice("Mumbai ","Chennai ","Gujrat ","Banglore ","Kolkata ");
		WPC.PointsTable();

	}
	
	public void PointsTable()
	{
		String rank=a+b+c+d+e;
				    
		System.out.println("Ranking of teams is  "+rank);
	}

}
