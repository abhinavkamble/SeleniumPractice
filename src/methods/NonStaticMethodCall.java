package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) {

		//another Class Object creation 
		NonStaticStudy demo=new NonStaticStudy();
		demo.check();
		
		//Same Class Object Creation
		NonStaticMethodCall demo2=new NonStaticMethodCall();
		demo2.remark();
		
				
	}
	
	public void remark()
	{
		System.out.println("this is non ststic practice from same class");
	}
	

}
