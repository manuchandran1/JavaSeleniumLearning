package SeleniumScenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BackForwardNavigate 
{

	@Test
	public void NavigateMethods() throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
	
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("/Users/shify/Documents/Workspace2/learnjava/Screenshots/Screenshot1.png"));
		driver.quit();
		
		

		

	}
	

}
