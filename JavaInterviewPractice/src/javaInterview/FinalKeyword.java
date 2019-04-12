package javaInterview;

public class FinalKeyword 
{
	
	//A final keyword is used with class, variable or method
	//Final keyword restrict the futher modifications
	//It defines on class, methods and variable
	
	
	//can we inherit/ extend final class-----------  it is a access modifier. we can not extend final class. give Compile time error
	//can we change the value of final variable----------  value can not be change give Compile time error
	//can we overload final method - yes because we don't change the implementation of method in overloading, In overloading just we define the different method with same method name only.
									// method signature always different in over loading
	
	//can we override the final method-----------  No, because we change the implementation of method. give Compile time error
												//final, , private can not be override
												//public, static, protected and default and super class must be inherited 
	
	// under final class main method can not be execute -- No run java load
	
	
	static  int a=12;
	double b=2;
	
	public static void finalvab()
	{
		a=20;
		System.out.println(a);
	}
	
	final static void finalvab(int v)
	{
		a=40;
		System.out.println(a);
	}
	final static void finalvab(int v,int b)
	{
		a=60;
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		finalvab(4,7);
	}

}

final class secondFinal extends FinalKeyword
{
	
	
	
}
	
/*class thirdClass extends secondFinal
{
	
}*/