package quickLearn;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class TestCaseThree extends Reusable{
	
	private static Logger log = LogManager.getLogger(TestCaseThree.class.getName());
	
	@Test(dataProvider="getData")
	public void multipleRun(String uName, String pwd) throws IOException
	{
		driver=initializeWebDriver();
		driver.get(prop.getProperty("Url"));
		System.out.println("Login page displayed successfully");
		
		LandingPage lp = new LandingPage(driver);
		lp.login().click();
		
		LoginPage log = new LoginPage(driver);
		log.getEmail().sendKeys(uName);
		log.getPassword().sendKeys(pwd);
		log.gesignInButton().click();
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
				
				data[0][0] = "vm@gmail.com";
				data[0][1] = "abc@123";
				data[1][0] = "vn@yahoo.com";
				data[1][1] = "bcd@123";
		return data;
		
	}

}
