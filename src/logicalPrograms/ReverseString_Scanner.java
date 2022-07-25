package logicalPrograms;

import java.util.Scanner;

public class ReverseString_Scanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the String ===>");
		String a=sc.next();
		//String name = "ABHINAV";
		String blank = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			blank=blank+a.charAt(i);
			
		}
		System.out.println("Orignal name-->"+a+"<-->"+blank+"<--Reverse Name");
		

	}

}
