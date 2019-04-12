package testCases;

import org.testng.annotations.Test;

import testActions.CreateEvent_POF;




public class CreateEvent_TestCase
{
	@Test(priority = 1)
	public static void verifyToCreateCalender() throws Throwable 
	{					
		System.out.println("verify to create Event On vTiger ");
		CreateEvent_POF.toSaveCalender("Interview at cts", "03/2/2019", "13/2/2019", "12.00", "01.00", "02.00", "2.30");
	}
}
