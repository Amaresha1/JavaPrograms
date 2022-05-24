package Stringprograms;

public class PrimeNumber 
{
   public static void main(String[] args) {
	
	   int num=9;
	   boolean flag=true;
	   for (int i =2; i<num; i++)
	   {
		if(num%i==0)
		{
			flag=false;
			break;
		}
		}
	   if(flag==true)
	   {
		   System.out.println("Number is prime ");
	   }
	   else
	   {
		   System.out.println("Number is not prime");
	   }
}
}
