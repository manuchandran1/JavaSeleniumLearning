package SeleniumScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorSample 
{
	@Test
	public void testMethod() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");			
		WebElement button_login = driver.findElement(By.name("btnLogin"));
		
		//button_login.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].click();", button_login);
        
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
        

		Thread.sleep(2000);
		driver.quit();

	}

}
