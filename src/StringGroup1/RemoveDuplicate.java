package StringGroup1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String e=sc.nextLine();
		String s = e.toLowerCase();
		char[] ch = s.toCharArray();

		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
     System.out.println(set);
	}

}
