package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseHover {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Automation Tools')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hover).perform();

		Thread.sleep(1500);

		driver.quit();

	}

}
