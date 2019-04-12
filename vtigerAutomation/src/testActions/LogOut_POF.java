package testActions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Vtiger.POM.LogOut_POM;

import helperClass.Browser_Factory;

public class LogOut_POF extends Browser_Factory
{
	
	public static void logout()
	{
		LogOut_POM.signOutIconPath().click();
		
		LogOut_POM.signOutBtnPath().click();
		
	}

}
