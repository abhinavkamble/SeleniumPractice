package logicalPrograms;

public class ReverseNumberByConverting {

	public static void main(String[] args) {
		int a =12345;
		String c = Integer.toString(a);
		String b = "";
		
		for(int i=c.length()-1;i>=0;i--)
		{
			b=b+c.charAt(i);
		}
		System.out.println("Orignal Number is=="+a);
		System.out.println("reverse Number is=="+b);

	}

}
