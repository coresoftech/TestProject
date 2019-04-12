package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import gherkin.formatter.MonochromeFormats;



@CucumberOptions(features= {"src\\test\\resources\\Features\\"}, glue="",plugin= {"pretty","json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"}, dryRun=false , monochrome=true)

public class Runner extends AbstractTestNGCucumberTests
{

}
