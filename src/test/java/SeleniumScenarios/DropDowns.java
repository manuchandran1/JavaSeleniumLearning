package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {

	@Test
	public void TestDropDowns() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement month_dropdown = driver.findElement(By.id("month"));

		Select select_month = new Select(month_dropdown);

		select_month.selectByIndex(7);

		Thread.sleep(2000);

		select_month.selectByVisibleText("Dec");

		Thread.sleep(2000);

		driver.quit();
	}

}
