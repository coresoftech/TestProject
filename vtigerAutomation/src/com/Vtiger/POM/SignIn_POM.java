package com.Vtiger.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import helperClass.Browser_Factory;

public class SignIn_POM extends Browser_Factory
{
	private static WebElement element;
	private static List<WebElement> elements;
	
	public static WebElement signInBtnPath()
	{
		element = driver.findElement(By.xpath("//*[@id='customloginlink']"));
		return element;	
	}
	
	public static WebElement userNamePath()
	{
		element = driver.findElement(By.xpath("//*[@name='username']"));
		return element;	
	}
	public static WebElement passwordPath()
	{
		element = driver.findElement(By.xpath("//*[@name='password']"));
		return element;	
	}
	public static WebElement clickOnSignInBtnPath()
	{
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block']"));
		return element;	
	}
	
	
}
