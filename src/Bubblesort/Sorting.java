package Bubblesort;

public class Sorting {

	public static void main(String[] args) 
	{
		int[] ar= {4,6,7,8,2,9};
		int max=ar[0];
		  for(int i=0;i<ar.length;i++)
		  {
			    if(ar[i]>max)
			    {
			    	max=ar[i];
			    }
		  }
            System.out.println(max);
	}

}
