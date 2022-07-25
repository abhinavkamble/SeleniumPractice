package TypeOfVeriable;

public class LocalAndGlobleVariable 
{

	String Name="Abhinav";
	static int RollNO=17;
	
	public static void main(String[] args) 
	{
		LocalAndGlobleVariable LG= new LocalAndGlobleVariable();
		System.out.println("MY Name is    -->"+LG.Name);
		System.out.println("My Roll No is -->"+RollNO);
		
		LG.StudentInfo();
		LocalAndGlobleVariable.myinfo();

	}
	public void StudentInfo()
	{
		char div='b';
		System.out.println("My Division is  -->"+div);
	
	}
	
	public static void myinfo()
	{
		String branch="Science";
		System.out.println("My Branch is    -->"+branch);
	}
	

}
