package Stringprograms;

public class Reverseastring {

	public static void main(String[] args)
	{
		String s="Helloooo";
		char[] ch = s.toCharArray();
		String s1=" ";
		 int count=0;
		for (char c : ch)
		{
		    count ++;	
		}
		for (int i =count-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		

	}

}
