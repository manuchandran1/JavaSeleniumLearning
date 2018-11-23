package com.learnjava;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumCode 
{
	
	public static void main(String[] args) throws Exception 
	{
		//WebDriver driver = new SafariDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("chandran.manu85@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1313Man.");
		driver.findElement(By.id("Login")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("phSearchInput")).sendKeys("TestAsset1");
		driver.findElement(By.id("phSearchButton")).click();
		
		driver.findElement(By.linkText("TestAsset1")).click();
		
		WebElement productLink = driver.findElement(By.linkText("GenWatt Diesel 1000kW"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(productLink).build().perform();
		
		driver.findElement(By.xpath("//div[@class='individualPalette lookupHoverDetail lookupHoverDetailOverridable']//input[@class='btn']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.dismiss();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("test"))));
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		
		List<WebElement> list_elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("id")));
		
		String currentUrl = driver.getCurrentUrl();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		js.executeScript("arguments[0].scrollntoView()", element);
		
		element.getText();
		driver.navigate().refresh();
		
//		String text = driver.findElement(By.xpath("//table[@class=detailList]/td[text()='Product']")).getText();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	

}
