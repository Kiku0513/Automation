package com.intermiadete;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitsDemo 
{
	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("q")));
		
		
}
}