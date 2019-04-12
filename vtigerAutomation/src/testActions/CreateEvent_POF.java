package testActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Vtiger.POM.CreateEvent_POM;

import helperClass.Browser_Factory;

public class CreateEvent_POF extends Browser_Factory
{
	
	public static void toSaveCalender(String subjectTitle, String startDate, String dueDate, String value, String text, String DueTimevalue, String DueTimetext)
	{
		int eachTime =0;
		String eachTimeValue = "";
		String timeValues = "";
		
		int eachDueTime = 0;
		String eachDueTimeValue = "";
		String DuetimeValues = "" ;
		
		
		//To clcik on calender icon
		CreateEvent_POM.calenderPath().click();
		
		//to Quick Create Event
		//to sendkeys on subject
		CreateEvent_POM.subjectPath().sendKeys(Keys.CLEAR);
		CreateEvent_POM.subjectPath().sendKeys(subjectTitle);
		
		//to sendkeys start date
		CreateEvent_POM.startDatePath().sendKeys(Keys.CLEAR);
		CreateEvent_POM.startDatePath().sendKeys(startDate);
		
		//to sendkeys due date
		CreateEvent_POM.dueDatePath().sendKeys(Keys.CLEAR);
		CreateEvent_POM.dueDatePath().sendKeys(dueDate);
		
		//To time start 
		CreateEvent_POM.timeStartPath().click();
		
		//list of time
		eachTime = CreateEvent_POM.ListOftimeStartPath().size();
		System.out.println("Size of eachTime is = "+eachTime);
		for(int i=0; i<eachTime; i++)
		{
			
			eachTimeValue = CreateEvent_POM.ListOftimeStartPath().get(i).getText().toString().trim();
			System.out.println("eachTime = "+eachTime);
			
			Select oSelect = new Select(CreateEvent_POM.toClickOnTimePickerStartSelectPath());
			List<WebElement> optionsToPickTime = oSelect.getOptions();
			for(int j=0; j<optionsToPickTime.size(); j++)
			{
				timeValues = optionsToPickTime.get(j).getText().toString().trim();
				System.out.println("timeValues are : " +timeValues);
			}
			oSelect.selectByIndex(2);
			oSelect.selectByValue(value);
			oSelect.selectByVisibleText(text);
		}
			
		
		//To due time
		
		CreateEvent_POM.timeDuePath().click();
				
				//list of time
				eachDueTime = CreateEvent_POM.ListOftimeDuePath().size();
				System.out.println("Size of eachDueTime is = "+eachDueTime);
				for(int i=0; i<eachDueTime; i++)
				{					
					eachDueTimeValue = CreateEvent_POM.ListOftimeDuePath().get(i).getText().toString().trim();
					System.out.println("eachDueTimeValue = "+eachDueTimeValue);
					
					Select oSelect = new Select(CreateEvent_POM.toClickOnTimePickerDueSelectPath());
					List<WebElement> optionsToDuePickTime = oSelect.getOptions();
					for(int j=0; j<optionsToDuePickTime.size(); j++)
					{
						DuetimeValues = optionsToDuePickTime.get(j).getText().toString().trim();
						System.out.println("DuetimeValues are : " +DuetimeValues);
					}
					oSelect.selectByIndex(2);
					oSelect.selectByValue(DueTimevalue);
					oSelect.selectByVisibleText(DueTimetext);
				}	
		
	}

}
