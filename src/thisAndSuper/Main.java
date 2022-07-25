package thisAndSuper;

public class Main extends Sub
{
	int p=4;
	int q=16;
	
	
	public void Addition()
	{
		int p=3;
		int q=9;
		int sum =p+super.p;
		System.out.println("the addition of 1 local & super veriable is "+sum);
		
		int Add =this.p+q;
		System.out.println("the addition of 1 globle & 1 local veriable is "+Add);
		
		int plus = this.q+super.q;
		System.out.println("the addition of 1 goble & 1 super veriable is "+plus);
	}

	public static void main(String[] args) 
	{
		Main M = new Main();
		M.Addition();

	}

}
