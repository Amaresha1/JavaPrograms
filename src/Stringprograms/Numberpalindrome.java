package Stringprograms;

public class Numberpalindrome 
{
  public static void main(String[] args) 
  {
	int num=454;
	int rem=0;
	int sum=0; int temp=num;
	while(num!=0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(sum==temp)
	{
		System.out.println("This number is Palindrome");
	}
	else
	{ 
		System.out.println("This number is not Palindrome");
	}
}
}
