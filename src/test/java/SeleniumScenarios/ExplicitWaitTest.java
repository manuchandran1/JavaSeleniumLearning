package SeleniumScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.au/");

		WebDriverWait wait = new WebDriverWait(driver, 6000);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));

		alert.accept();

	}

}
