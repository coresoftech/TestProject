package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage 
{
	static WebDriver driver;
	
	public RediffHomepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void RediffLoginpage(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	static By search = By.id("srchword");
	
	public static WebElement search()
	{
		return driver.findElement(search);
	}
	
	
}
