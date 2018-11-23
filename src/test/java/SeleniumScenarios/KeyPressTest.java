package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyPressTest {

	@Test
	public void testKeyPresses() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");

		// driver.findElement(By.id("content")).sendKeys(Keys.SPACE);

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.SPACE).build().perform();

		String text = driver.findElement(By.id("result")).getText();

		System.out.println(text);

		Thread.sleep(2000);
		driver.quit();
	}

}
