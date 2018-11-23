package SeleniumScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {

	@Test
	public void TestRadioButtons() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromdriver");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
//		
//		List<WebElement> radio_lang = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
//		
//		for(WebElement radio:radio_lang)
//		{
//			String attribute = radio.getAttribute("value");
//			System.out.println(attribute);
//			
//			if(attribute.equalsIgnoreCase("C#")) 
//			{
//				radio.click();
//				break;
//			}
//		}

		List<WebElement> checkbox_list = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkboxes : checkbox_list) {
			if (checkboxes.getAttribute("id").equalsIgnoreCase("code")) {
				checkboxes.click();
				break;
			}

		}

		Thread.sleep(1500);

		for (WebElement checkboxes : checkbox_list) {
			if (checkboxes.isSelected()) {
				checkboxes.click();
			} else
				checkboxes.click();

		}

		Thread.sleep(1500);
		driver.quit();
	}
}
