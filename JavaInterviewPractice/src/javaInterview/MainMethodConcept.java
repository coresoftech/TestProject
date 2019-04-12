package javaInterview;

public class MainMethodConcept {
	// main method can be static or nao-static------- always should be static least Runtime error, no compile time error
	// main method can be overloaded-----------  yes but we cannot change the parameter ie; String[] args' "args' can be any other variable name also you can keep
	//main method can have return type--------- No, always void  give Runtime error
	// main method access modifier----------  always should be public least Runtime error
	
	
	
	public static void main(String  [] Sweta)
	{		
		System.out.println("method static or non static ?");
		main(2);
		main(3,6);
		
	}
	
	public static void main(int a) 
	{
		System.out.println("method can overload or not ? ");
	}

	public static int main(int a,int b) 
	{
		System.out.println("method can overload or not 2 argument ? ");
		return b;
	}

}
