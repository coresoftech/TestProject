package javaInterview;

import java.io.File;

public class Exception 
{
	//Exception handling is one of the most important feature of java 
					//programming that allows us to handle the runtime errors caused by exceptions.
	
	//An Exception is an unwanted event that interrupts the normal flow of the program.
	
	//There can be several reasons that can cause a program to throw exception. 
					//For example: Opening a non-existing file in your program, Network connection problem, bad input data provided by user etc.

	//Advantage of exception handling: Exception handling ensures that the flow of the program doesn’t break when an exception occurs. 
	
	//Difference between error and exception:
	//Errors indicate that something severe enough has gone wrong, the application should crash rather than try to handle the error.

	//Exceptions are events that occurs in the code. A programmer can handle such conditions and take necessary corrective actions.
	
	//Two types of exceptions in Java: 1)Checked exceptions 2)Unchecked exceptions
	
	//Checked exceptions are checked at compile-time(It means if a method is throwing a 
						//checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword)
	
	//Unchecked exceptions are not checked at compile time. It means if your program is 
						//throwing an unchecked exception and even if you didn’t handle/declare that exception, the program won’t give a compilation error
						//All Unchecked exceptions are direct sub classes of RuntimeException class.
	
	
	public static void main(String[] args) 
	{
		File file = new File("filepath");
		
		
	}
	
	
	
	
	
	
	
}
