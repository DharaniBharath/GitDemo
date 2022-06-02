package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="C:\\eclipsework05aprl2022\\CucumberUdemyAutomation\\src\\test\\java\\featurefile\\login.feature",
		glue="stepdefinitions",
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:C:\\eclipsework05aprl2022\\CucumberUdemyAutomation\\target\\login.html"}
		)



public class LoginTestNgTestRunner extends AbstractTestNGCucumberTests {
	

}
