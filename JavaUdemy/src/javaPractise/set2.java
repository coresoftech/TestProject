package javaPractise;

public class set2 
{
	public static int main()
	{		
		int sum =0;
		int c[]= {2,5,8,7,4};
		
		for(int i=0; i<c.length; i++) 	//5 times
		{
			sum= sum + c[i];
		}
		System.out.println("sum = " +sum);
	System.out.println(c[4]);
		return sum;
		
	}
	
	//Print the index of desired num ???????
	
	
	public static void main(String[] args)
	{
		
		set2 obj = new set2();
		obj.main();
	}
	
}
