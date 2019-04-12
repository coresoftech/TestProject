package javaInterview;

public class TryCatchBlock 
{
	//The try block contains set of statements where an exception can occur. 
					//A try block is always followed by a catch block, 
					//which handles the exception that occurs in associated try block. 
					//A try block must be followed by catch blocks or finally block or both.
	
	//A catch block is where you handle the exceptions, this block must follow the try block. 
					//A single try block can have several catch blocks associated with it.

	//When an exception occurs in try block, the corresponding catch block that handles 
					//that particular exception executes.
	
	//https://beginnersbook.com/2013/05/catch-multiple-exceptions/ ---------- Not understood the last example
	
	//Key Points- 1. a single try block can have any number of catch blocks ------ yes
		//2. A generic catch block can handle all the exceptions ------- yes
		//3. If no exception occurs in try block then the catch blocks are completely ignored ------ yes
		//4. Corresponding catch blocks execute for that specific type of exception:
				//catch(ArithmeticException e) is a catch block that can hanlde ArithmeticException
				//catch(NullPointerException e) is a catch block that can handle NullPointerException
		//5. You can also throw exception ---------  yes, user defined 
				
				//*** https://beginnersbook.com/2013/04/throw-in-java/ -------  Not understood 1st example
				//*** https://beginnersbook.com/2013/04/user-defined-exception-in-java/ ----- Not understood
	
	
	
	
	
	
}
