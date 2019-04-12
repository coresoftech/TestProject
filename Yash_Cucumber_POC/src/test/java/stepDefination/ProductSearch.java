package stepDefination;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import base.BaseClass;

import base.ExcelFactory;
import base.GenericFactory;
import base.WaitFactory;
import browser.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSearch extends BaseClass {
	static int i =0;
	static int correctProduct =0; 
	static int inCorrectProduct =0;
	static WebElement clickNext;
	
	@Given("^User enters product in the search box$")
	public void user_enters_product_in_the_search_box() throws Throwable {
		
		ExcelFactory.Excelreader("Credentials");
		WaitFactory.waitForElement(BaseClass.wbDriver.findElement(By.id("twotabsearchtextbox")));
		BaseClass.wbDriver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	}

	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {

		WaitFactory.waitforelementToBeClickable(BaseClass.wbDriver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"))).click();
	}

	@Then("^related search should be displayed$")
	public void related_search_should_be_displayed() throws Throwable {
		
		GenericFactory.checkBrand();
		ArrayList<String> allProduct = new ArrayList<String>();
		ArrayList<String> unmatchedProd = new ArrayList<String>();
		//((JavascriptExecutor) wbDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		clickNext = wbDriver.findElement(By.xpath("//a[@class='pagnNext']"));
		WaitFactory.waitForElement(clickNext);
		
		while(clickNext.isEnabled()==true){
			
			List<WebElement> el = wbDriver.findElements(By.xpath("//h2"));
			
			for(i =0; i<el.size(); i++){
				
				allProduct.add(el.get(i).getText());
				
				if(allProduct.get(i).toLowerCase().contains(product.toLowerCase())){
					
					correctProduct = allProduct.size();
					
				}
				else{
					unmatchedProd.add(el.get(i).getText());
					
					inCorrectProduct = unmatchedProd.size();
				}
			}
			
			
			((JavascriptExecutor) wbDriver).executeScript("arguments[0].scrollIntoView(true);", clickNext);
			clickNext.click();
		}
		
		if(correctProduct > inCorrectProduct){
			System.out.println("Correct Product is being displayed");
		}
		else{
			System.out.println("Incorrect product search is being displayed");
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
