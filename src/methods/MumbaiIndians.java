package methods;

public class MumbaiIndians 
{

	public static void main(String[] args) {
		MumbaiIndians MI = new MumbaiIndians();
		MI.playerinfo();
	    MI.playerinfo("Surya",45 ,130.25f,'A' ,true);
	

	}
	public void playerinfo()
	{
		String Name="Rohit Sharma";
		int Jurseyno=45;
		float SR=130.45f;
		char Playergrade='A';
		
		System.out.println("===============================");
		System.out.println("Name of Player  -->"+Name);
		System.out.println("Jursey Number   -->"+Jurseyno);
		System.out.println("Strike Rate     -->"+SR);
		System.out.println("Grade of Player -->"+Playergrade);
		System.out.println("===============================");
	
	}
	
	public void playerinfo(String name,int jurseyno,float SR,char playerGrade,boolean result)
	{
		System.out.println("===============================");
		System.out.println("Name of Player  -->"+name);
	    System.out.println("Jursey Number   -->"+jurseyno);
	    System.out.println("Strike Rate     -->"+SR);
	    System.out.println("Grade of Player -->"+playerGrade);
	    System.out.println("the resut is    -->"+result);
	    System.out.println("===============================");
	}

}
