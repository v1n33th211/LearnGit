package quickLearn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshto {

	public static WebDriver  driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vineethmenon/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("/Users/vineethmenon/Documents/AutomationScreenshots/screenshot.png"));

	}

}
