package javaInterview;

public class covertStringToStringBuilder
{
	//We can Covert String to string builder in two ways
	//1- Using constructor of StringBuilder(String s)
	//2- Using append method of StringBuilder 
	
	//#1: Java program to convert string to StringBuilder using constructor of StringBuilder class
	
	public static void main(String[] args) {
		
		String str = "Java";		//Instance variable
		
		StringBuilder st = new StringBuilder(str);
		String s =  st.toString();
		System.out.println(s);
		
		
		
		//#3: Java program to convert string to StringBuilder using append method of StringBuilder class.
		StringBuilder sb = new StringBuilder();
		String sp = "hello";
		sb.append(sp);
		String s2 = sb.toString();
		System.out.println(s2);
					
	}
	
}

