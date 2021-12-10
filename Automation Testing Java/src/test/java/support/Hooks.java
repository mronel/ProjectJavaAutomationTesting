package support;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import configuration.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	private String folder = "target/cucumber-report/";
	
	@Before
	public void InitializeTest() {
		DriverFactory.InitializeWebDriver();
	}
	
	@AfterStep
	public void Steps(Scenario scenario) {
		if(DriverFactory.Screenshot().equals("all")) {
			 final byte[] screenshot = ((TakesScreenshot) DriverFactory.GetDriver()).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot, "image/png",folder+"screenshot"+ new Date().getTime());
		}
	}
		
	@After
	public void TearDownTest(Scenario scenario) {
		if(DriverFactory.Screenshot().equals("error")) {
			if(scenario.isFailed()) {
				 final byte[] screenshot = ((TakesScreenshot) DriverFactory.GetDriver()).getScreenshotAs(OutputType.BYTES);
				 scenario.attach(screenshot, "image/png",folder+"screenshot"+ new Date().getTime());
			}
		}
		DriverFactory.QuitDriver();
	}
	
	
}