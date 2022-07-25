package logicalPrograms;

public class WhiteSpaceCount {

	public static void main(String[] args) 
	{
		String name="A B H I N A V";
		char space=' ';
		int count=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			space=name.charAt(i);
			if(space==(' '))
			{
				count++;	
			}
		}
		System.out.println(count);
		

	}

}
