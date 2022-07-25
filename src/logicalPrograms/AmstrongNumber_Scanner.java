package logicalPrograms;

import java.util.Scanner;

public class AmstrongNumber_Scanner {

	public static void main(String[] args) 
	{
		//Armstrong number is a number that is equal to the sum of cubes of its 
		//digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers

		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the Number ===>");
		int a=sc.nextInt();
		
		int b=0;
		for(int i=a; i>1; i=i/10)
		{
			int rem=i%10;
			b=b+(rem*rem*rem);
		}
		if(a==b)
		{
			System.out.println("Number is amstrong number");
		}
		else
		{
			System.out.println("Number is not amstrong number");
		}



	}

}
