package Arraytopic;

import java.util.Arrays;

public class Appendsfrst {

	public static void main(String[] args)
	{
		int[] a= {2,3,0,4,0,1,0,0};
		int len = a.length;
		int[] ar=new int[len];
        int m=0;
        for (int i=0;i<a.length; i++)
        {
			if(a[i]!=0)
			{
				ar[m]=a[i];
				m++;
			}
		}
        System.out.println(Arrays.toString(ar));
	} 

}
