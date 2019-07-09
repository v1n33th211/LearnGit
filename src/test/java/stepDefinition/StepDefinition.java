package stepDefinition;

import org.junit.runner.RunWith;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinition {
	
	@Given("^user is in the landing page$")
	    public void user_is_in_the_landing_page() throws Throwable {
		 System.out.println("This is the code for validating--user is in the landing page");
	    }

	    @When("^entered userName \"([^\"]*)\" and passWord \"([^\"]*)\" and clicked on sign-in$")
	    public void entered_username_something_and_password_something_and_clicked_on_signin(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("This is the code for validating--entered userName and passWord and clicked on sign-in");
			System.out.println(strArg1);
			System.out.println(strArg2);
	    }

	    @Then("^user is navigated to the home page$")
	    public void user_is_navigated_to_the_home_page() throws Throwable {
	    	System.out.println("Code for validating --- user is navigated to the home page");
	    }

	    @And("^various contents are displayed$")
	    public void various_contents_are_displayed() throws Throwable {
	    	System.out.println("Code for validating -- various_contents_are_displayed");
	   } 
	

}
	        
	        
	
	

