package com.intermiadete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {
	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement wb=driver.findElement(By.cssSelector("textarea#APjFqb"));
		wb.sendKeys("Selenium ide");
		wb.sendKeys(Keys.ENTER);

}
}