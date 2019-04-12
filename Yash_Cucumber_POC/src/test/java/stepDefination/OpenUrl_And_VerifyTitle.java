package stepDefination;

import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OpenUrl_And_VerifyTitle {
	
	@When("^I enter the URL as \"([^\"]*)\"$")
	public void i_enter_the_URL_as(String url) throws Throwable {
		BaseClass.wbDriver.get(url);
	}

	@Then("^Title should be \"([^\"]*)\"$")
	public void title_should_be(String arg1) throws Throwable {
		String title=BaseClass.wbDriver.getTitle();
			Assert.assertEquals(title, arg1);
	}
}
