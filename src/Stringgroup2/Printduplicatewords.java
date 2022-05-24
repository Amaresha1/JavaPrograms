package Stringgroup2;

import java.util.LinkedHashSet;

public class Printduplicatewords 
{
  public static void main(String[] args) {
	String s="welcome to bengaluru welcome to ty";
	String[] st = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<>();
	
	for (int i = 0; i < st.length; i++) 
	{
	    set.add(st[i]);	
	}
	
	for (String word: set)
	{
	   int count=0;
	   for (int i = 0; i < st.length; i++) {
	          if(word.equals(st[i]))
	          {
	        	  count++;
	          }
	}
	   if(count>1) {
	   System.out.print(word+" ");
	}
}}
}
