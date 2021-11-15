package com.runner.com;


  import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helper.com.FileReaderManager;
import com.sampleprojectbaseclass.Samplebase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com", glue = "com.Stepdefenition.com", monochrome = true,
								plugin = {"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" })


public class AdactinRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		
		String browser = FileReaderManager.getInstanceCR().getBrowser();
		
		driver = Samplebase.browserLaunch(browser);

	}

}
