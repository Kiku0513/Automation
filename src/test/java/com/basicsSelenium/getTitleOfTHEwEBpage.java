package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleOfTHEwEBpage
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium Ide");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Open source record and playback test automation for the web')]")).click();
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
