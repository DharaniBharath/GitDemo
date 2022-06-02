package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\eclipsework05aprl2022\\CucumberUdemyAutomation\\src\\test\\java\\featurefile\\login.feature",
		glue="stepdefinitions",
		monochrome=true,
		dryRun=false,
		stepNotifications=true,
		plugin= {"pretty","html:C:\\eclipsework05aprl2022\\CucumberUdemyAutomation\\target\\login.html"}
		)
















public class Login {

}
