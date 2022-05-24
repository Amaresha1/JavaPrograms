package Sortingwithoutbubble;

public class firstmaxandsecondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {4,6,7,8,4,2,9,1,1 };
		int fmax=ar[0];
		int smax=ar[0];
		  for(int i=0;i<ar.length;i++)
		  {
			    if(ar[i]>=fmax)
			    {
			    	if(ar[i]!=fmax)
			    	{
			    	smax=fmax;
			    }
			    fmax=ar[i];
			    }
			    else if (ar[i]>smax || smax==fmax)
			    {
					smax=ar[i];
				}
		  }
            System.out.println(fmax+" "+smax);
	}

	}


