package stepdefination;

import java.io.IOException;
import Base_utilities.Test_Base;
import CRM.pages.Login_Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageTest extends Test_Base {
	Login_Page loginpage;
	@Before
	public void LauchBrowser() throws IOException{

		browser_launch("chrome");
		loginpage = new Login_Page();
	}


	@Given("^User is on login page$")
	public void user_is_on_login_page()  {
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", driver.getTitle());
	}

	@When("^User enters user name and password$")
	public void user_enters_user_name_and_password() throws IOException  {

		loginpage.username.sendKeys("cobradogra");
		loginpage.password.sendKeys("aditya@007");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		loginpage.LoginBtn.submit();

	}

	@Then("^it should land on Home page$")
	public void it_should_land_on_Home_page()  {
		Assert.assertEquals("CRMPRO", driver.getTitle());
	}

	@After
	public void cleanup(){
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
