package org.stepdef;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeScenario() {
		getBrowser("chrome");
		driver.manage().window().maximize();
		launchUrl("https://adactinhotelapp.com/");
		

	}
	@After
	public void afterScenario(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, s.getName() + ".png");
			
		}
		driver.close();
		

	}

}
