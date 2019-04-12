package testCases;

import org.testng.annotations.Test;

import testActions.Login_POF;

public class Login_TestCase 
{
	@Test(priority = 1)
	public static void verifyToLogin() throws Throwable 
	{		
		System.out.println("verify vTiger Login ");
		Login_POF.loginApplication("https://www.vtiger.com/");
	}

	public static void add()
	{
		System.out.println("Method ADD of Test ng ");
	}
	
	public static void sub()
	{
		System.out.println("Method SUB of Test ng ");
	}
}
