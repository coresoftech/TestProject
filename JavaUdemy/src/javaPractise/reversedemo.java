package javaPractise;

public class reversedemo 
{
	public static void main(String[] args) 
	{
		String s = "Sweep";
		String t = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
			t= t+ s.charAt(i);			
		}
		
		System.out.println(t);
		
		//palindrom
		if(s==t)
		{
			//if it palindrome	
			System.out.println("checking if it is palindrome");
		}		
	}

}
