package helperClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Factory extends Browser_Factory
{
	
	public static void implicitWait()
	{
		try {
			driver.manage().timeouts().implicitlyWait(05 , TimeUnit.SECONDS);
		} catch (Exception e)
		{			
			e.printStackTrace();
		}		
	}
	
	@SuppressWarnings("unused")
	public static void explicitWait(List <WebElement> elements)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			List<WebElement> ele = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
	public static void fluentWait()
	{
		try {
			FluentWait wait = new FluentWait(driver);
			wait.withTimeout(20, TimeUnit.SECONDS);
			wait.pollingEvery(03, TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}		
	}

}
