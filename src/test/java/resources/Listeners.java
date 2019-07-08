package resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import quickLearn.Reusable;

public class Listeners implements ITestListener{
	

	public void onTestStart(ITestResult result) {
		System.out.println("What the!!");
		
	/*	System.setProperty("webdriver.chrome.driver", "/Users/vineethmenon/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileHandler.copy(src, new File("/Users/vineethmenon/Documents/AutomationScreenshots/screenshot.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} */

	}

	public void onTestSuccess(ITestResult result) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vineethmenon/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try {
		FileHandler.copy(src, new File("/Users/vineethmenon/Documents/AutomationScreenshots/screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("webdriver.chrome.driver", "/Users/vineethmenon/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try {
		FileHandler.copy(src, new File("/Users/vineethmenon/Documents/AutomationScreenshots/screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
