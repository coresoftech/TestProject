package javaInterview;

public class reverseAString
{
	private static String strRev;

	public static void main(String[] args) 
	{
		String str = "jam";
		
		for(int i= str.length(); i<0; i--)
		{
			strRev = str;
		}
		System.out.println(strRev+ " is reversed ");
	}

}
