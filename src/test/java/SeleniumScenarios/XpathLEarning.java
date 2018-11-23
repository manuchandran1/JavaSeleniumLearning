package SeleniumScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathLEarning 
{
	@Test
	public void XpathTests()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		
		
		//a[text()='Features']
		//a[contains(text(),'Features')] - recommended
		
		//a[(text()='Alerts')]
		
		// PRECEDING  & FOLLOWING Sibling
		
		//a[text()='Minerva McGonagal']//parent::td[@class='datalistrow']//preceding-sibling::td//input
		//a[text()='Minerva McGonagal']//parent::td[@class='datalistrow']//following-sibling::td
		
		// URL: https://v4-alpha.getbootstrap.com/components/dropdowns/
		
		//div[@class='dropdown']/button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']
		//a[text()= 'Bootstrap']
		
		
				driver.quit();

	}
	
	
}
