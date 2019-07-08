package quickLearn;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCaseOne extends Reusable{
	
	private static Logger log = LogManager.getLogger(TestCaseOne.class.getName());

	
	@Test
	public void launchUrl() throws IOException
	{
		
		Reusable r = new Reusable();
		//driver = r.initializeWebDriver();
	driver=initializeWebDriver();
	driver.get("https://www.qaclickacademy.com/");
	log.info("Site is launched");
		
		driver.close();
		log.info("browser is closed");
	}

}
