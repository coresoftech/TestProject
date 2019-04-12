package testCases;

import org.testng.annotations.Test;

import testActions.Login_POF;
import testActions.SignIn_POF;

public class SignIn_TestCase
{
	@Test(priority = 1)
	public static void verifyToLogin() throws Throwable 
	{		
		String username = "reply2rakeshkr@gmail.com";
		String password = "sweta";
	
		System.out.println("verify vTiger Sign IN ");
		SignIn_POF.signIn(username, password);
	}

}
