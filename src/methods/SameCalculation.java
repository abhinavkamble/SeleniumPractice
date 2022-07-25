package methods;

public class SameCalculation {

	public static void main(String[] args) 
	{
		SameCalculation SC=new SameCalculation();
		SC.Addition();
		SameCalculation.Substraction();
		
		OtherCalculation OC=new OtherCalculation();
		OC.Multiplication();
		OtherCalculation.Division();
	

	}
	
	public void Addition()
	{
		int a=25;
		int b=625;
		int sum=a+b;
		System.out.println("Addition is        ==>"+sum);
	}
	
	public static void Substraction()
	{
		int a=695;
		int b=67;
		int sub=a-b;
		System.out.println("Substraction is    ==>"+sub);
	}

}
