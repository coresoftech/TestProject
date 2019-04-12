package testActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import helperClass.Browser_Factory;


public class Login_POF extends Browser_Factory
{
	//@Test(priority=2)
	public static void loginApplication(String url)
	{	
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	/*@Test(priority=1)
	public static void main1()
	{		
		Browser_Factory.browserType("Firefox");		
		Login_POF.loginApplication("https://www.vtiger.com/");	
		SignIn_POF.signIn("reply2rakeshkr@gmail.com", "sweta");
		LogOut_POF.logout();
		
	}*/

}
