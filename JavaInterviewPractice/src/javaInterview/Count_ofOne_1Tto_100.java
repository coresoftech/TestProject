package javaInterview;

public class Count_ofOne_1Tto_100 {

	public static void main(String[] args) 
	{
		int counter = 0;
		String carry1 = "";		
		
		for(int i=0; i<=100; i++)
		{
			carry1 = Integer.toString(i);
						
			if(carry1.contains("1"))
			{	
				System.out.println(carry1);
				counter = counter + 1;
			}			
		}
		System.out.println(counter);
	}
}
