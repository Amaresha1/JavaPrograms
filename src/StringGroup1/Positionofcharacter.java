package StringGroup1;

import java.util.HashSet;

public class Positionofcharacter {

	public static void main(String[] args) 
	{
		String s="RoyalRaj";
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
					System.out.println(c+":"+i);
					break;
				}
				

}}}}