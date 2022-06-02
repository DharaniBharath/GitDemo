package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	
	@Before("@RegTest")
	public void mobilevalidation()
	{
		System.out.println("Before regtest");
		
	}
	
	@After("@RegTest")
	public void mobilevalidation1()
	{
		System.out.println("After regtest");
	}

}
