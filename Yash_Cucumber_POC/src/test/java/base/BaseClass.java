 package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefination.LoginPage;

public class BaseClass {
	public static WebDriver wbDriver = null;
	public static String strWorkingDir = System.getProperty("user.dir").toString();
	public static LoginPage loginPage_POF;
	public static String username;
	public static String password;
	public static String product;
	public static String brandName;
	public static String extentPath = "G:\\Cucumber_POC_Yash\\Yash_CucumberPOC_1_12\\Yash_Cucumber_POC\\extent-config.xml";
public static void initPageElements() throws Exception{
	
	ExcelFactory.Excelreader("Credentials");
	loginPage_POF = PageFactory.initElements(BaseClass.wbDriver, LoginPage.class);
	
}	



}