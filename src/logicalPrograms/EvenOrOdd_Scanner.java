package logicalPrograms;

import java.util.Scanner;

public class EvenOrOdd_Scanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number===>");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
		    System.out.println("Number is ODD");
		}
	}

}
