package Stringgroup2;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String s="welcome to bengaluru welcome to ty";
		String[] st = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		for (int i = 0; i < st.length; i++) 
		{
		    set.add(st[i]);	
		}
       System.out.println(set);
	}

}
