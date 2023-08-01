package com.intermiadete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommnads {

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card']/div[1]")).click();

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.navigate().to("https:///www.google.com");
		Thread.sleep(2000);

		driver.quit();



	}

}
