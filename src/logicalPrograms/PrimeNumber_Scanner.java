package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber_Scanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the Number ===>");
		int a=sc.nextInt();
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}	
			if(count==1)
			{
				System.out.println("Number "+a+" is Not a Prime Number");
			}
			else 
			{
				System.out.println("Number "+a+" is Prime Number");	
			}
		
	}

}
