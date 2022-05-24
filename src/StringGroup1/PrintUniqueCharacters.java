package StringGroup1;

import java.util.HashSet;
import java.util.Scanner;

public class PrintUniqueCharacters {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String e=sc.nextLine();
		String s = e.toLowerCase();
		char[] ch = s.toCharArray();

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
					count++;
				}}
			
			if(count==1)
			{
				System.out.println("Unique Character"+"--"+c+" "+count);
			}

	}

}
}