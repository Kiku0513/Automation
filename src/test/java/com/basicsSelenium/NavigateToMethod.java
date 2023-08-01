package com.basicsSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateToMethod {

	
		static WebDriver driver;
		
	
		private static String[] links = null;
		private static int linksCount = 0;
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
			
			System.out.println("Count of Links ------->"+linksCount);
			 for (WebElement link : links)
			 {
		            String url = link.getAttribute("href");
				 if (url != null && url.startsWith("http")) 
				 {
		                // Navigate to the link's URL using driver.navigate().to()
		                driver.navigate().to(url);
		                
		                // Optional: Wait for some time or perform other actions after navigating to the link
		                
		                // Go back to the previous page after visiting the link (if desired)
		                driver.navigate().back();
		
				}
			 }
			 driver.quit();

}
}