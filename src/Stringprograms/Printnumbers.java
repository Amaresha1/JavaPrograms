package Stringprograms;

public class Printnumbers
{
    public static void num(int n)
    {
    	if(n<=10)
    	{
    		System.out.println(n); 
    			//num(n+1);
    		n++;
      	  num(n);
    	} 	  
    }         
    public static void main(String[] args) {
		num(1);
	}
}
