package testActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Vtiger.POM.SignIn_POM;

import helperClass.Browser_Factory;

public class SignIn_POF extends Browser_Factory
{
	@Test //(dependsOnMethods = { "OpenBrowser" })
	public static void signIn(CharSequence username, CharSequence password)
	{
		SignIn_POM.signInBtnPath().click();
		
		SignIn_POM.userNamePath().sendKeys(Keys.CLEAR);
		SignIn_POM.userNamePath().sendKeys(username);
		
		SignIn_POM.passwordPath().sendKeys(Keys.CLEAR);
		SignIn_POM.passwordPath().sendKeys(password);
		
		SignIn_POM.clickOnSignInBtnPath().click();		
				
	}

}
