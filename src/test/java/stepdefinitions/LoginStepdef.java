package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
	
	 @Given("^validate the brwoser$")
	    public void validate_the_brwoser() throws Throwable {
	      System.out.println("validate the brwoser");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	      System.out.println("Browser is triggered");
	    }

	    @Then("^check if the browser is started$")
	    public void check_if_the_browser_is_started() throws Throwable {
	       System.out.println("browser is started behin");
	       System.out.println("browser is started begin");
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 @Given("^user in landing page$")
	    public void user_in_landing_page() throws Throwable {
	      System.out.println("user in landing page");
	    }

	    @When("^user login with userid and password$")
	    public void user_login_with_userid_and_password() throws Throwable {
	    	
	    	System.out.println("user login with userid and password");
	    	
	      
	    }

	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	
	    	System.out.println("home page is populated");
	   
	    }

	    
	    @Then("cards displayed are {string}")
	    public void cards_displayed_are(String string) {
	    	System.out.println("cards are displayed are ::::::"+string);
	    }
	    
	    @When("^user login with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_with_and(String string, String string2) throws Throwable {
	       
	    	System.out.println("The user name is "+string+" Password is  :"+string2);
	    	
	    	
	    }

	    @Then("^cards are not displayed$")
	    public void cards_are_not_displayed() {
	      System.out.println("cards are not displayed");
	    }
	    
	    
	    
	    @When("^user in signup with following details$")
	    public void user_in_signup_with_following_details(DataTable data) throws Throwable {
	     List<List<String>> add=  data.asLists();
	     System.out.println(add.get(0).get(0));
	     System.out.println(add.get(0).get(1));
	     System.out.println(add.get(0).get(2));
	     System.out.println(add.get(0).get(3));
	     System.out.println(add.get(0).get(4));
	    }
	    
	    @When("^user login with the (.+) and (.+)$")
	    public void user_login_with_theand(String username, String password) throws Throwable {
	    	System.out.println("The user name is "+username+" Password is  :"+password);
	    }

	}