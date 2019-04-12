package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.BaseClass;
import base.ExcelFactory;
import base.WaitFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass {
	
	@FindBy(how=How.XPATH, using="//span[@class='nav-line-2' and contains(text(),'Your Orders')]")
	static WebElement hoverLogin;
	
	@Given("^User Clicks on SignIn button$")
		public void user_Clicks_on_SignIn_button() throws Throwable {
		ExcelFactory.Excelreader("Credentials");
		WaitFactory.waitForElement(BaseClass.wbDriver.findElement(By.xpath("//span[@class='nav-line-2' and contains(text(),'Your Orders')]"))).click();
	}

	@When("^User enters emailID and clicks on continue$")
	public void user_enters_emailID_and_clicks_on_continue() throws Throwable {
		
		WaitFactory.waitForElement(BaseClass.wbDriver.findElement(By.xpath("//input[@type='email']"))).sendKeys(BaseClass.username);
		BaseClass.wbDriver.findElement(By.id("continue")).click();
	}

	@When("^User enters pwd$")
	public void user_enters_pwd() throws Throwable {
		WaitFactory.WaitForElementToVisible(BaseClass.wbDriver.findElement(By.id("ap_password"))).sendKeys(BaseClass.password);
		
	}
  
	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		BaseClass.wbDriver.findElement(By.id("signInSubmit")).click();
	}

}
