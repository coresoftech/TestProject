package javaInterview;

public class PictorialNumber 
{

	//Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
	
	public static void main(String[] args)
	{
		for(int i=0; i<=100; i++)
		{
			if(i%3==0)
			{
				System.out.println(i+ ",");
			}
		}
		for(int i=0; i<=100; i++)
		{
			if(i%5==0)
			{
				System.out.println(i+ ",");
			}
		}
		for(int i=0; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("\n");		

	}

}
