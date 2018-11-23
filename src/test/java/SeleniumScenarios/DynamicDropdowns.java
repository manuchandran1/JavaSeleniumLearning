package SeleniumScenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropdowns {
	@Test
	public void TestDynamicDropdowns() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement menu1 = driver.findElement(By.id("menu1"));

		menu1.click();

		List<WebElement> dropdown_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

		// Iterator<WebElement> it = dropdown_menu.iterator();

		for (WebElement next : dropdown_menu) {
			String href = next.getAttribute("href");
			String text = next.getText();
			String innerhtml = next.getAttribute("innerHTML");
			System.out.println(href + "  " + text + "   " + innerhtml);

			if (innerhtml.contentEquals("JavaScript")) {
				next.click();
				break;
			}
		}

		// Example of Stale Element Exception
		// menu1.click();

//		while(it.hasNext()) 
//		{
//			WebElement next = it.next();
//			String href = next.getAttribute("href");
//			String text = next.getText();
//			String innerhtml = next.getAttribute("innerHTML");
//			System.out.println(href+"  " +text+"   "+innerhtml);
//			
//			if(innerhtml.contentEquals("JavaScript"))
//			{
//				next.click();
//				break;
//			}
//		}

		Thread.sleep(1500);
		driver.quit();
	}
}
