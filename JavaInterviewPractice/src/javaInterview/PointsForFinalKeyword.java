package javaInterview;

abstract final class PointsForFinalKeyword
{
	//A class or any method can be either abstract or final, can not be both -------------- 
													//abstract final class PointsForFinalKeyword----- Compile time error
	
	//override always says, inherit me in another class
	
	
	

}


//we can define abstract method only in abstract class. least give Compile time error

//Abstract and final keyword both can not be defined together with class and method least give Compile time error

//A abstract class can contain abstract method as well as concrete method. The access modifier of concrete method can be public private, final, or anything


abstract class demo
{
	final abstract void method1();		//both keyword cannot be placed together
	
	abstract void method3();
	
	 final void method2()		//convrete method
	 {
		 System.out.println("no error");
	 }
	
}

class withoutAbstractClass
{
	//now defining the abstract method in normal class
	abstract void catMethod();
	
}
	
}



/////////////////////////*************************************************************************//////////////////////////////////////////






//when an array variable is declare as a final , the reference of variable is final- not the values and we can not reassign the array variable 
final int X[] = new int[10];     //final array variable
X[2] = 10;
X[2] = 20;     //Array element can be re-assigned
X = new int[30];  //compile time error
//can't re-assign new array object to final array variable



//final varible and object must be intilize at time of declaring final least give Compile time error
final static  int i = 10;   //final static variable
final int j ;          //final non-static variabl
int c;
final int d;














