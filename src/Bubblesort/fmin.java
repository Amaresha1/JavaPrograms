package Bubblesort;

public class fmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {4,6,7,8,4,2,9,1,1 };
		int fmin=ar[0];
		int smin=ar[0];
		  for(int i=0;i<ar.length;i++)
		  {
			    if(ar[i]<=fmin)
			    {
			    	if(ar[i]!=fmin)
			    	{
			    	smin=fmin;
			    }
			    fmin=ar[i];
			    }
			    else if (ar[i]<smin || smin==fmin)
			    {
					smin=ar[i];
				}
		  }
            System.out.println(fmin+" "+smin);
	}

	}


