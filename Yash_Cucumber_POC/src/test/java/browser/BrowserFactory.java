
package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import base.BaseClass;
import base.ExcelFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BrowserFactory extends BaseClass {
	public static EventFiringWebDriver driver = null;
	private static String strChromeDriverPath = BaseClass.strWorkingDir
			+ "\\src\\test\\resources\\Drivers\\chromedriver.exe";
	private static String strIEDriverPath = BaseClass.strWorkingDir
			+ "\\src\\test\\resources\\Drivers\\IEDriverServer3.8.exe";
	private static String strGeckoDriverPath = BaseClass.strWorkingDir
			+ "\\src\\test\\resources\\Drivers\\geckodriver.exe";
	private static String strEdgeDriverPath = BaseClass.strWorkingDir
			+ "\\src\\test\\resources\\Drivers\\EDGEWebDriver16299.exe";

	@SuppressWarnings("deprecation")
	@Given("^I am able to open browser as \"([^\"]*)\"$")
	public void i_type_the_keyword_as(String strBrowser) throws Throwable {
		
		try {

			if (!strBrowser.isEmpty() && !strBrowser.equals(null)) {
				// checking the type of browser
				if (strBrowser.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver", strChromeDriverPath);
					BaseClass.wbDriver = new ChromeDriver();

				} else if (strBrowser.equalsIgnoreCase("Firefox")) {

					System.setProperty("webdriver.gecko.driver", strGeckoDriverPath);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					BaseClass.wbDriver = new FirefoxDriver(capabilities);

				} else if (strBrowser.equalsIgnoreCase("IE")) {

					System.setProperty("webdriver.ie.driver", strIEDriverPath);
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					// capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					capabilities.setCapability("requireWindowFocus", true);
					capabilities.setCapability("ignoreZoomSetting", true);
					BaseClass.wbDriver = new InternetExplorerDriver(capabilities);

				} else if (strBrowser.equalsIgnoreCase("EDGE")) {

					System.setProperty("webdriver.edge.driver", strEdgeDriverPath);
					BaseClass.wbDriver = new EdgeDriver();

				} else if (strBrowser.equalsIgnoreCase("HtmlUnit")) {

				}
				driver = new EventFiringWebDriver(BaseClass.wbDriver);
				// putting an implicit wait after every Action or Event
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();

			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/*@Then("^Close the browser")
	public void close_the_browser() {
		
		driver.quit();
		
	}*/
}
