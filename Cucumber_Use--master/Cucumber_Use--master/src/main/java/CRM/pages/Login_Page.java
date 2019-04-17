package CRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Test_Base;

public class Login_Page extends Test_Base {
	@FindBy(name="username")
	public
	WebElement username;
	
	@FindBy(name="password")
	public
	WebElement password;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-small')]")
	public
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/register/']")
	public
	WebElement signupBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	public
	WebElement crmlogo;

//Initialise the page objects
public Login_Page() throws IOException{
	
	PageFactory.initElements(driver,this);
}
}
