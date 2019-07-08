package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Email field
	By emailField = By.id("user_email");
	
	//Password field
	
	By passWord = By.id("user_password");
	
	//sign-in button
	By signIn = By.name("commit");
	
	
	//method for email field
	public WebElement getEmail()
	{
		return driver.findElement(emailField);
	}
	
	//method for password
		public WebElement getPassword()
		{
			return driver.findElement(passWord);
		}
		
		//method for login button
		public WebElement gesignInButton()
		{
			return driver.findElement(signIn);
		}
		
		
}
