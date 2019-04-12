package com.Toolsqa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sweta.ranjan\\Desktop\\TestNG Report\\26-Sept-2018\\Toolsqa_Automation\\src\\main\\java\\com\\ToolsqaFeatures\\toolsqaForm.feature", 
		glue="C:\\Users\\sweta.ranjan\\Desktop\\TestNG Report\\26-Sept-2018\\Cucumber_New_Project\\src\\test\\java\\stepDefination\\test_step_def.java",
		plugin={"html:target/cucumber-html-report","json:target/cucumber-report.json",
				"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml","pretty"},
		dryRun=true,
		strict=false,
		monochrome=true
		//the path where you want report under target folder in framework
		)


public class runner 
{
	

}
