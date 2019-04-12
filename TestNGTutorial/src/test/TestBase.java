package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


//How to write Global parameters with java code


public class TestBase 
{
	
	public WebDriver driver= null;
	
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\sweta.ranjan\\Desktop\\TestNG Report\\26-Sept-2018\\TestNGTutorial\\datadriven.properties");
		prop.load(file);
		
		
		
		System.out.println(prop.getProperty("username"));
		//driver.findElement(By.xpath("").sendKeys();
		
		if(prop.getProperty("browser")).equals("firefox")
		{
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser")).contains("chrome")
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new IEDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}
}
