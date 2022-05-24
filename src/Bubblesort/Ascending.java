package Bubblesort;

public class Ascending {

	public static void main(String[] args) 
	{
		int[] ar= {5,7,8,9,12,10,2,1};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		for(int k=0;k<ar.length;k++)
		{
			System.out.println(ar[k]);
		}
		System.out.println("=================");
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[ar.length-1]);
        int sum=0;
        for(int i=0;i<3;i++)
        {
       	 sum=sum+ar[i];
        }
      System.out.println(sum);
	}

	}


