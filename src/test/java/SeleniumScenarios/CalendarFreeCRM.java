package SeleniumScenarios;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class CalendarFreeCRM {
	public void TestCalendar() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("manuchandran");
		driver.findElement(By.name("password")).sendKeys("1313Man.");

		WebElement login_button = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", login_button);

	

			driver.switchTo().frame("mainpanel");
			String date1 = "31-September-2017";

			String[] date_array = date1.split("-");
			String day1 = date_array[0];
			String month1 = date_array[1];
			String year1 = date_array[2];

			Select month = new Select(driver.findElement(By.name("slctMonth")));
			// month.selectByVisibleText(month1);

			// System.out.println((driver.findElement(By.name("slctMonth"))).getText());

			Select year = new Select(driver.findElement(By.name("slctYear")));
			// year.selectByVisibleText(year1);

			// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]

			String beforeXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
			String afterXpath = "]/td[";
			boolean flag = false;
			String dateValue="";
			for (int rowNum = 2; rowNum <= 7; rowNum++) {
				for (int colNum = 1; colNum <= 7; colNum++) {
					try {	
						dateValue = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getText();
					}catch(org.openqa.selenium.NoSuchElementException e) 
					{
						System.out.println("Please Enter a Correct Date Value");
						flag = true;
						break;
					}
					System.out.println(dateValue);
					if (dateValue.equals(day1)) {
						driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
						System.out.println("Date Selected is: " + dateValue);
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}

		
			driver.quit();

	}

}
