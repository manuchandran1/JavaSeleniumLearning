package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tooltip 
{
	WebDriver driver;
	
	@Test
	public void testTooltip() 	
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		//driver.manage().window().maximize();
		
		String actualREsult = driver.findElement(By.xpath("//li[@id='menu_download']/a")).getAttribute("title");
		System.out.println("Tooltip is: " + actualREsult);
		SoftAssert sassert = new SoftAssert();
		
		sassert.assertEquals(actualREsult, "xxx");
		
		driver.quit();
		
		System.out.println("Test Ended");
		
		sassert.assertAll();
	}
	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.quit();
//	}

}
