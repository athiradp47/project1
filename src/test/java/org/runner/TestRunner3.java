package org.runner;


import org.baseclass.Report;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\adactinlogin.feature"},glue = {"org.stepdef"},monochrome = true,dryRun=false,plugin = {"pretty",
"html:C:\\Users\\user\\eclipse-workspace\\AcatinCucumber\\target",
"json:C:\\Users\\user\\eclipse-workspace\\AcatinCucumber\\target\\sample.json",
"junit:C:\\Users\\user\\eclipse-workspace\\AcatinCucumber\\target\\sample.xml"})


public class TestRunner3 {
	
	@AfterClass
	public static void afterclass() {
		Report.JVMReport("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\AcatinCucumber\\\\target\\\\sample.json");

	}

}
