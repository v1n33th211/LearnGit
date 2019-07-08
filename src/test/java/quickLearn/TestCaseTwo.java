package quickLearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class TestCaseTwo extends Reusable {
	
	private static Logger log = LogManager.getLogger(TestCaseTwo.class.getName());
	@BeforeMethod
	public void launchUrl() throws IOException
	{
		driver=initializeWebDriver();
		driver.get(prop.getProperty("Url"));
		System.out.println("Login page displayed successfully");
	}
	
	
	@Test
	public void loginTestCase() throws IOException
	{
		
		//Creating an object for Landing Page class to access its methods
		
		LoginPage log = new LoginPage(driver);
		log.getEmail().sendKeys(prop.getProperty("userName"));
		log.getPassword().sendKeys(prop.getProperty("passWord"));
		log.gesignInButton().click();
		

	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	

}
