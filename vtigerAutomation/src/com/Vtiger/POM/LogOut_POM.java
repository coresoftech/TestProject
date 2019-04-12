package com.Vtiger.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helperClass.Browser_Factory;

public class LogOut_POM extends Browser_Factory
{
	private static WebElement element;
	private static List<WebElement> elements;
	
	public static WebElement signOutIconPath()
	{
		element = driver.findElement(By.xpath("//*[@class='fa fa-user width100Per height100Per p-xy-8']"));
		return element;	
	}
	public static WebElement signOutBtnPath()
	{
		element = driver.findElement(By.xpath("//*[@id='menubar_item_right_LBL_SIGN_OUT']"));
		return element;	
	}
	
}
