package helperClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Browser_Factory
{
	
	//private static String strBrowser;
	
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")	
	public static void OpenBrowser(String strBrowser)
	{		
		if(strBrowser.equalsIgnoreCase("FireFox"))
		{	
			//System.setProperty("webdriver.chrome.driver", "C://Users//sweta.ranjan//Desktop//TestNG Report//26-Sept-2018//vtigerAutomation//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(strBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//sweta.ranjan//Desktop//TestNG Report//26-Sept-2018//vtigerAutomation//driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//sweta.ranjan//Desktop//TestNG Report//26-Sept-2018//vtigerAutomation//driver//IEDriverServer3.11.1.exe");
			driver = new InternetExplorerDriver();
		}
	}

}
