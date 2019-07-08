package quickLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class Reusable {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeWebDriver() throws IOException
	{
		 prop = new Properties();
		
		FileInputStream fis = new FileInputStream("/Users/vineethmenon/E2EFrameWork/src/main/java/quickLearn/GlobalTestData");
		
		prop.load(fis);
		
		String broswerName =prop.getProperty("Browser");
		
		if(broswerName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/vineethmenon/Desktop/chromedriver");
			driver = new ChromeDriver();
			
		}
		
		else if(broswerName.equals("Firefox"))
		{
			//System property need to set for Firefox browser also now. Check and write the code for the same
			driver = new FirefoxDriver();
		}
		
		else 
		{
			driver = new SafariDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void takeScreenshots() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("/Users/vineethmenon/Documents/AutomationScreenshots/screenshot.png"));
		
	}

}
