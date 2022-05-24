package StringArray;

import java.util.HashSet;
import java.util.Scanner;

public class Countofchar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch = s.toCharArray();
		//System.out.println(s.charAt(0));
		//System.out.println(ch[0]);
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for (Character c : set)
		{
			int count=0;
			for (int i = 0; i <ch.length; i++) 
			{
				if(ch[i]==c)
				{
					count ++;
				}
				}
			  System.out.println(c+":"+count+ "times");

	}

}
}