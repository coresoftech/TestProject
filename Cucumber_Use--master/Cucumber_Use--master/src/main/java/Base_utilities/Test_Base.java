package Base_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Base {
public static WebDriver driver;
	public void browser_launch(String browsername){
		
		if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//will load the DOM means basic html code not images which will take time to load
			driver = new ChromeDriver();
			System.out.println("The Chrome browser is opened");
			//System.out.println("The Chrome browser is opened");
		}
		else {
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer.exe");
			driver =new InternetExplorerDriver();
			System.out.println("The IE browser is opened");	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}
}

	
	
