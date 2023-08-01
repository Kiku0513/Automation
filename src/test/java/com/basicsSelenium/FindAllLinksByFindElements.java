package com.basicsSelenium;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class FindAllLinksByFindElements 
{
	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement wb=driver.findElement(By.cssSelector("textarea#APjFqb"));
		wb.sendKeys("Selenium ide");
		wb.sendKeys(Keys.ENTER);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of Links ------->"+links.size());
		//System.out.println(links.size());
		List<String> urls = new ArrayList<String>();
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");

			if(url!=null && !url.isEmpty()&& url.startsWith("https"))
			{
				System.out.println(url);
				urls.add(url);
			}
		}
		for(String url:urls)
		{
			driver.navigate().to(url);
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}

		driver.quit();
	}
}
