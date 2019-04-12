package testCases;

import org.testng.annotations.Test;

import testActions.LogOut_POF;
import testActions.Login_POF;

public class LogOut_TestCase
{
	@Test //(dependsOnMethods = { "SignIn" }) 
	//(priority = 1)
	public static void verifyToLogOut() throws Throwable 
	{		
		System.out.println("verify vTiger Log Out ");
		LogOut_POF.logout();
	}

}
