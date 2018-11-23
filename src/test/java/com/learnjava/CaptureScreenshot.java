package com.learnjava;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot 
{
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File screenshotAs = screenShot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		String date1= sdf.format(date) + ".png";
	
		FileUtils.copyFile(screenshotAs,new File(System.getProperty("user.dir")+"/Screenshots/Screen" + date1 + ".png"));
		
		driver.quit();
		
	}

}
