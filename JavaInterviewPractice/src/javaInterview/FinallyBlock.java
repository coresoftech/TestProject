package javaInterview;

public class FinallyBlock
{
	 	//A finally block contains all the crucial statements that must be executed whether 
			//exception occurs or not

	//Key Points: 1. A finally block must be associated with a try block, you cannot use finally 
						//without a try block. You should place those statements in this block that 
							//must be executed always.

				//2. Finally block is optional, as we have seen in previous tutorials that a 
						//try-catch block is sufficient for exception handling, however if you place a finally block then it will always run after the execution of try block.

				//3. In normal case when there is no exception in try block then the finally block 
						//is executed after try block. However if an exception occurs then the 
								//catch block is executed before finally block.

				//4. An exception in the finally block, behaves exactly like any other exception.

				//5. The statements present in the finally block execute even if the try block 
								//contains control transfer statements like return, break or continue.
		
		
	//Cases when the finally block doesn’t execute:
	//The circumstances that prevent execution of the code in a finally block are:
		//– The death of a Thread
		//– Using of the System. exit() method.
		//– Due to an exception arising in the finally block.
		
		
	//close() statement is used to close all the open streams in a program
	//Since finally block executes even if exception occurs so you can be sure that all input 
				//and output streams are closed properly regardless of whether the exception 
						//occurs or not.
	
	
	//Finally block without catch ----------  yes
	
	//Finally block and System.exit():
		//System.exit() statement behaves differently than return statement. 
		//Unlike return statement whenever System.exit() gets called in try block then Finally block 
					//doesn’t execute
	
	
	//https://beginnersbook.com/2013/04/java-finally-block/ -------- Not understood
	
	
	//try-catch-finally block
	//Either a try statement should be associated with a catch block or with finally.
	//Since catch performs exception handling and finally performs the cleanup, the best 
				//approach is to use both of them.
	
	
	
	
	
	
	
		
	//Syntax of Finally block
	/*try {
	    //Statements that may cause an exception
	}
	catch {
	   //Handling exception
	}
	finally {
	   //Statements to be executed
	}*/
	
	
	
	
	
}
