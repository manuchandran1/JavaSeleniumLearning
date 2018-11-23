package SeleniumScenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns2 
{
	
	@Test
	public void TestDropDowns() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select select_month = new Select(month_dropdown);
		WebElement firstSelectedOption = select_month.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		
		
		select_month.selectByIndex(7);
		
		Thread.sleep(2000);
		
		select_month.selectByVisibleText("Dec");
		WebElement firstSelectedOption2 = select_month.getFirstSelectedOption();

		String text = firstSelectedOption2.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		List<WebElement> totaloptions = select_month.getOptions();
		int size = totaloptions.size();		
		
		System.out.println(size);
		
		Iterator<WebElement> it = totaloptions.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next().getText());
			
		}
		
		
		driver.quit();
	}

}
