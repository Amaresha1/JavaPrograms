/**
 * 
 */
package StringArray;

import java.util.LinkedHashSet;

public class Positionofele {
	public static void main(String[] args) 
	{
		int[] a= {5,2,5,7,0,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer val : set) 
		{
			// count=0;
		     for(int i=0;i<a.length;i++)
		     {
		    	 
		    	 if(a[i]==val)
		    	 {
		    		 System.out.println(val+":"+i);
		    		 break;
		    	 }
		   
		     }
				/*
				 * if(count==1) { System.out.println(val+":"+count); }
				 */
		     }
		

	}

}
