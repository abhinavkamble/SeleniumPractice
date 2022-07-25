package logicalPrograms;

import java.util.Scanner;

public class PalindromeString_Scanner {

	public static void main(String[] args) 
	{
		// Palindrome : a word, phrase, or sequence that reads the same backwards as 
		//forwards, e.g. madam or nurses run, eve, eye, ana, anna

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the String ===>");
		String a=sc.next();
		
		String b="";
		for (int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse String is ==>"+b);
		
		if(a.equals(b))
		{
			System.out.println("This is Palindrome Word");
		}	
		else
		{
			System.out.println("This is not Palindrome Word");
		}
			

	}

}
