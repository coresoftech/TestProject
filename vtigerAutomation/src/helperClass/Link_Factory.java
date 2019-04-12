package helperClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Link_Factory extends Browser_Factory
{
	
	//To get all links present on a webpage and put into an ArrayList object
	
	public static ArrayList<String> toGetAllLinkOnWebpage()
	{
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("totalLinks = "+totalLinks);
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0; i<totalLinks.size(); i++)
		{
			String eachLink = totalLinks.get(i).getText().toString().trim();
			arr.add(eachLink);
		}
		return arr;
	}
	
	
	//To get unique links from a list of links.
	public static ArrayList<String> toGetUniqueLinkOnWebpage()
	{
		ArrayList<String> arr = new ArrayList<String>();
		HashSet<String> hobj = new HashSet<String>();
		
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("totalLinks = "+totalLinks);
		
		
		for(int i=0; i<totalLinks.size(); i++)
		{
			String eachLink = totalLinks.get(i).getText().toString().trim();
			arr.add(eachLink);			
		}
		System.out.println("Unique links = "+hobj);
		
		return arr;
	}
	
	
	
	public static void main(String[] args) 
	{
		toGetAllLinkOnWebpage();
	}

}
