package SeleniumScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWaitTest 
{
	@Test
	public void ExplicitWaitTesting() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		clickOn(driver, driver.findElement(By.xpath("//input[@value='Log In']")), 10);
		
		

	}
	
	public static void clickOn(WebDriver driver, WebElement locator,int timeout) 
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	

}
