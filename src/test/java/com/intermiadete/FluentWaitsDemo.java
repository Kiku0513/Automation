package com.intermiadete;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class FluentWaitsDemo {


	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		
		driver =new ChromeDriver();
		driver.get("http://www.google.com");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		         .pollingEvery(Duration.ofSeconds(1));
	          	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
	
	}

}
