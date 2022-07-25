package methods;

public class MathCal {

	public static void main(String[] args) 
	{
		//For same Class Calling
		MathCal MC= new MathCal();
		MC.addition();
		MathCal.substraction();
		
		//For Another Class Calling
		Calculaion C=new Calculaion();
		C.multiplication();
		Calculaion.division();
		
		
	}
	
	public void addition()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		
		System.out.println("Addition is       -->"+sum);
	}
	
	public static void substraction()
	{
		int p=20;
		int q=30;
		int sub=q-p;
		
		System.out.println("Substraction is   -->"+sub);
	}
	

}
