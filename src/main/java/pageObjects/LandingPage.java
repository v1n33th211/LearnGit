package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Login button 
	By loginButton = By.cssSelector("a[href*='sign_in']");
	
	//Feature Courses text
	By featuredCourses = By.cssSelector(".text-center>h2");
	
	//method for login button using By
	public WebElement login()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(featuredCourses);
	}
	
	
	

}
