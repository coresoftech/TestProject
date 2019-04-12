package javaInterview;

import java.util.Scanner;

public class PalindromeExample
{

	private static char charStr;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str = "ram";
		
		for(int i=0; i<str.length(); i++)
		{
			 charStr = str.charAt(i);
		
		}
		System.out.println(str+ " is a palindrome.");
		
		numberPalindromeOrNot();
	}


	
		 public static void numberPalindromeOrNot()
		 {  
			  int r,sum=0,temp, v=0;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  
			  temp=v;    
			  while(n>0)
			  {    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   v=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println(temp+" - is palindrome number ");    
			  else    
			   System.out.println(temp+" - is not palindrome");    
		}  
}  

