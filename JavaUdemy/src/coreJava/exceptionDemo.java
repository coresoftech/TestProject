package coreJava;

public class exceptionDemo 
{
	//one try can be followed by mutiplle catch blocks 
	//catch should be an immediate block after try 
	 
	//Q- say when finally will not execute 
	//Ans- When you stop JVM forcefully [  System.exit(0) ]
	
	
	
	public static void main(String[] args) 
	 { 
		 int b=7; int c=0; 
		 try 
		 { 
			 //  purchased faile     int k=b/c;// 
			 //int arr[]=new int[5];               
			 //System.out.println(arr[7]);         
			 
		 } catch(ArithmeticException et) 
		 
		 { 
			 System.out.println("I catched the Arthimetic/exception"); 
		 
		 } catch(IndexOutOfBoundsException ets) 
		 { 
			 System.out.println("I catched the IndexBound/exception"); 
			 
		 } catch(Exception e) 
		   { 
			 //  retry again System.out.println("I catched the error/exception");
			 
		   } 
		 finally 
		 { 
			 System.out.println("delete cookies");
		 
		 //THis block is executed irrespective of exception thrown or not 
			 
		 } 

	}

	}


