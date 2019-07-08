package stepDefinition;

import org.junit.runner.RunWith;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import quickLearn.Reusable;


@RunWith(Cucumber.class)
public class StepDefinition extends Reusable{
	
	@Given("^user is in the landing page$")
	    public void user_is_in_the_landing_page() throws Throwable {
		driver=initializeWebDriver();
		driver.get("https://www.qaclickacademy.com/");
		//log.info("Site is launched");
		LandingPage lp = new LandingPage(driver);
			lp.login();
			//driver.close();
			//log.info("browser is closed");
		 
	    }
	
	 @When("^entered \"([^\"]*)\" and \"([^\"]*)\" and clicked on sign-in$")
	    public void entered_something_and_something_and_clicked_on_signin(String strArg1, String strArg2) throws Throwable {
		 LoginPage log = new LoginPage(driver);
			log.getEmail().sendKeys(strArg1);
			log.getPassword().sendKeys(strArg2);
			log.gesignInButton().click();
	    }
	 
	/*@When("^entered (.+) and (.+) and clicked on sign-in$")
    public void entered_and_and_clicked_on_signin(String username, String password) throws Throwable {
		LoginPage log = new LoginPage(driver);
		log.getEmail().sendKeys(username);
		log.getPassword().sendKeys(password);
		log.gesignInButton().click();
    } */
	

	    @Then("^user is navigated to the home page$")
	    public void user_is_navigated_to_the_home_page() throws Throwable {
	    	System.out.println("Code for validating --- user is navigated to the home page");
	    	System.out.println("This is the Git commit");
	    }

	    @And("^various contents are displayed$")
	    public void various_contents_are_displayed() throws Throwable {
	    	System.out.println("Code for validating -- various_contents_are_displayed");
	   } 
	

}
	        
	        
	
	

