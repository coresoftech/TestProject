package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomepage;
import objectRepository.RediffLoginPage;

public class Loginapplication
{

	@Test
	public void login(String url)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rediffmail.com");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.password().sendKeys("hello");
		rd.submit().click();
		rd.home().click();
		
		RediffHomepage rh = new RediffHomepage(driver);
		rh.search().sendKeys("rediff");
		rd.submit().click();
		
	}
	
	
	
	
}
