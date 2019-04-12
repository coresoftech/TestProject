package test;

import org.testng.annotations.Test;

public class day3 
{

	@Test
	public void weblogincarLoan()
	{
		//selenium
		System.out.println("weblogincarLoan");
	}
	
	@Test(timeOut=4000)
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("MobileLogincarLoan");
	}
	
	@Test(dependsOnMethods={"weblogincarLoan","MobileLogincarLoan"})
	public void LoginApicarLoan()
	{
		//Rest API automation
		System.out.println("LoginApicarLoan");
	}
	
	
	public void afsuit()
	{
		System.out.println("after class");
	}
	
	
	@Test()
	public void bfsuit()
	{
		System.out.println("before class");
	}
}
