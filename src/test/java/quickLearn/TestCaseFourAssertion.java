package quickLearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;


public class TestCaseFourAssertion extends Reusable {
	
	private static Logger log = LogManager.getLogger(TestCaseFourAssertion.class.getName());	
	
	@BeforeMethod
	public void launchUrl() throws IOException
	{
		driver=initializeWebDriver();
		driver.get(prop.getProperty("Url"));
		System.out.println("Login page displayed successfully");
	}
	
	
	@Test
	public void assertValidations() throws IOException

	{
		
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertEquals(lp.getTitle().getText(), "FEATUREDs COURSES");
		AssertJUnit.assertTrue(lp.getTitle().isDisplayed());
		System.out.println("Featured Courses is displayed");	
		

				
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	
	

}
