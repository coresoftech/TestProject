package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GenericFactory extends BaseClass {
	
	
	public static void checkBrand() throws Exception{
		
		WebElement brandLabel = wbDriver.findElement(By.xpath("//h4[contains(text(),'Brand')]"));
		((JavascriptExecutor) wbDriver).executeScript("arguments[0].scrollIntoView(true);", brandLabel);
		Thread.sleep(2000);
		WebElement clickBrand = wbDriver.findElement(By.xpath("//span[@class='a-size-small a-color-base s-ref-text-link s-ref-link-cursor' and contains(text(),'"+brandName+"')]/parent::span/../input[@type='checkbox']"));
		((JavascriptExecutor) wbDriver).executeScript("return arguments[0].click();", clickBrand);
		
	}
	
	public static void checkPagination(){
		
				
		
		
	}




}
