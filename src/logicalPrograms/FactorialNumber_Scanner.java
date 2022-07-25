package logicalPrograms;

import java.util.Scanner;

public class FactorialNumber_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the Number ===>");
		int a=sc.nextInt();
		int b=1;
		
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println(b);
	}

}
