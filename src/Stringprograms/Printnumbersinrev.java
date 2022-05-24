package Stringprograms;

public class Printnumbersinrev
{
    public static void num(int n)
    {
    	if(n>=1)
    	{
    		System.out.println(n); 
    			num(n-1);
    	} 
    }
    public static void main(String[] args) {
		num(10);
	}
}
