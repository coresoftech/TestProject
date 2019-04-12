package learnCucumber;

import org.testng.Assert;
import org.testng.annotations.Test;

/*class Calculator { 
	 public int Add(int number1, int number2)
	 { 
	 return 0;
	 }
	}
*/
class Calculator 
{
	 public int Add(int number1, int number2)
	 { 
	 return (number1 + number2);
	 } 
	}


public class AddingNumbersTests
{
	 
		 private Calculator myCalculator = new Calculator();
		 
		 @Test
		 public void addTwoPositiveNumbers()
		 {
		 int expectedResult = 30;
		 int ActuaResult = myCalculator.Add(10, 20);
		 Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult, ActuaResult); 
		 }
		 
		 @Test
		 public void addTwoNegativeNumbers()
		 {
		 int expectedResult = -30;
		 int ActuaResult = myCalculator.Add(-10, -20);
		 Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult, ActuaResult); 
		 } 
		}

}
