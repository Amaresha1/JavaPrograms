package StringArray;

import java.util.HashSet;

public class Removeduplicates {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,3,2,1,};
		HashSet<Integer> st=new HashSet<>();
		
        for(int i=0;i<a.length;i++)
        {
        	st.add(a[i]);
        
        }
       System.out.println(st);
       for (Integer val : st) 
       {
    	   int count=0;
            for (int i=0; i<a.length; i++) 
		 {
			 if(a[i]==val)
			 {
				 count++;
			 }}
			 if(count==1)
			 {
				 System.out.println(val+":"+count);
			 }
	}
	}

}
