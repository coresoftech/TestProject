package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver","G:\\DRIVER\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.ebay.com/");
	
		int number = findFramenumber(driver, By.xpath(""));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='rtm_list4']/div/h2/a/div")).click();
		driver.switchTo().defaultContent();
		
		
		int number1 = findFramenumber(driver, By.xpath(""));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='w1-w0-w0-toggle-button']")).click();
		
	}
	
	
	
	
	public static void findFramenumber(WebDriver driver, By)
	{
		
	}
}
