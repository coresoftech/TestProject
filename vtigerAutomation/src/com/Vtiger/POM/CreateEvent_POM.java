package com.Vtiger.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helperClass.Browser_Factory;

public class CreateEvent_POM extends Browser_Factory
{

	private static WebElement element;
	private static List<WebElement> elements;
	
	public static WebElement calenderPath()
	{
		element = driver.findElement(By.xpath("//*[@class='vicon vicon-calendar']"));
		return element;	
	}		
	public static WebElement subjectPath()
	{
		element = driver.findElement(By.xpath("//*[@name='subject']"));
		return element;	
	}	
	public static WebElement startDatePath()
	{
		element = driver.findElement(By.xpath("//*[@name='date_start']"));
		return element;	
	}
	public static WebElement dueDatePath()
	{
		element = driver.findElement(By.xpath("//*[@name='due_date']"));
		return element;	
	}
	
	//start time path
	public static WebElement timeStartPath()
	{
		element = driver.findElement(By.xpath("//*[@name='time_start']"));
		return element;	
	}
	public static List<WebElement> ListOftimeStartPath()
	{
		elements = driver.findElements(By.xpath("//*[@class='ui-timepicker-wrapper timePicker']/ul/li"));
		return elements;	
	}
	public static WebElement toClickOnTimePickerStartSelectPath()
	{
		element = driver.findElement(By.xpath("//*[@class='ui-timepicker-wrapper timePicker']"));
		return element;	
	}
	
	//Due time Path
	public static WebElement timeDuePath()
	{
		element = driver.findElement(By.xpath("//*[@name='time_end']"));
		return element;	
	}
	public static List<WebElement> ListOftimeDuePath()
	{
		elements = driver.findElements(By.xpath("//*[@class='ui-timepicker-wrapper timePicker ui-timepicker-positioned-top']/ul/li"));
		return elements;	
	}
	public static WebElement toClickOnTimePickerDueSelectPath()
	{
		element = driver.findElement(By.xpath("//*[@class='ui-timepicker-wrapper timePicker ui-timepicker-positioned-top']"));
		return element;	
	}
	
}
