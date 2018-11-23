package SeleniumScenarios;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.au/");
		driver.manage().window().maximize();
		
		List<WebElement> anchor_tags = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Anchor Tags : "+ anchor_tags.size());
		
		//Find out the active aTags with href
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(WebElement x:anchor_tags) 
		{
			if(x.getAttribute("href")!=null) 
			{
				activeLinks.add(x);
			}
		}
		int size = activeLinks.size();
		System.out.println("Total Number of Active Links : "+ activeLinks.size());
		
		for(WebElement aTag:activeLinks) 
		{
			String link = aTag.getAttribute("href");
			System.out.println(size + " : Link : "+link);
			size--;
			verifyBrokenLinks(link);
		
		}
		
		
	}
	
	
	public static void verifyBrokenLinks(String link) throws IOException
	{
		try {
				URL url = new URL(link);
		
				HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
				
				urlConnect.setConnectTimeout(3000);
				
				urlConnect.connect();
				
				if(urlConnect.getResponseCode() == 200) 
				{
					System.out.println(urlConnect.getResponseMessage());
				}
				else if(urlConnect.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND) 
				{
					System.out.println("Page URL is: "+link+" Response Code is: "+ urlConnect.getResponseMessage());
				}
		} catch(Exception e) 
		{
			System.out.println(e);
		}
		

	}


}
