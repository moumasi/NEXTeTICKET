package Next_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Next_Utility.next_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/next_featureFolder"},
plugin = {"json:target/cucumber.json"},
glue = "Next_Stepdefinition",

//tags = {"@tag1"})
//tags = {"@tag2"})
//tags = {"@tag3"})
//tags = {"@tag4"})
tags = {"@tag5"})

public class next_Testrunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void nextStartURL() {
		next_Base next = new next_Base();
		next.nextBrowser();
		
	}
	@AfterTest
	public void nextCloseURL() throws Exception {
		Thread.sleep(2000);
		next_Base next = new next_Base();	
		next.driver.quit();
		
		
	}

}
