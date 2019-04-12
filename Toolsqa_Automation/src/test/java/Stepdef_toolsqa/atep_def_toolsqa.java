package Stepdef_toolsqa;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class atep_def_toolsqa 
{
	WebDriver driver;
	

	@Before
	public void forstartup(String url)
	{		
		//browser
		driver = new FirefoxDriver();
		driver.get(url);	//https://www.amazon.in/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	
	
	@When("^The Home page is available$")
	public void the_Home_page_is_available() throws Throwable 
	{
	    //assert
		
		 
	}

	@Then("^fill Firstname and password$")
	public void fill_Firstname_and_password() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on button$")
	public void click_on_button() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
}
