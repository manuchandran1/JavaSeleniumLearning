package SeleniumScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestFirefox 

{
	public static void main(String[] args) 
	{
		WebDriver driver = new SafariDriver();
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
//		driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	 

}
