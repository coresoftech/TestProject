package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test_step_def 
{
	
	WebDriver driver;
	
	@Given("^I navigate to the login page$")
	 public void i_navigate_to_the_login_page() throws Throwable {
	 System.out.println("I am at the LogIn Page");
	 }
	 
	 @When("^I submit username and password$")
	 public void i_submit_username_and_password() throws Throwable {
	 System.out.println("I Submit my Username and Password");
	 }
	 
	 @Then("^I should be logged in$")
	 public void i_should_be_logged_in() throws Throwable {
	 System.out.println("I am logged on to the website");
	 }
	 
	 
	 
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//sweta.ranjan//Desktop//TestNG Report//26-Sept-2018//Cucumber_New_Project//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://iconnect.yash.com/login.aspx?ReturnUrl=%2f");	    
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable 
	{
		driver.findElement(By.id(".//*[@id='txtUser']")).sendKeys(username);
		driver.findElement(By.id(".//*[@id='txtPassword']")).sendKeys(password);
	}

	@Then("^user should able to login into the application$")
	public void user_should_able_to_login_into_the_application() throws Throwable
	{
		driver.findElement(By.id(".//*[@id='btnLogin']")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable
	{
		driver.quit();
	}
	
	
	
	//Step defination to log out application
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("")).click();
		
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Log out successfully.");
	}
	
		
}
