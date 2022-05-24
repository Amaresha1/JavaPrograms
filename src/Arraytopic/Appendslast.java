package Arraytopic;

import java.util.Arrays;

public class Appendslast {

	public static void main(String[] args)
	{
		int[] a= {1,0,1,0,1,0,1,0};
		int len = a.length;
		int[] ar=new int[len];
        int m=len-1;
        for (int i=0;i<a.length; i++)
        {
			if(a[i]!=0)
			{
				ar[m]=a[i];
				m--;
			}
		}
        System.out.println(Arrays.toString(ar));
	} 

}
