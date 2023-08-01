package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnHoWtoEnter 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		driver =new ChromeDriver();

		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		//1st way		
		WebElement wb=driver.findElement(By.cssSelector("textarea#APjFqb"));
		wb.sendKeys("Selenium ide");
		wb.sendKeys(Keys.ENTER);


		//2nd way
		//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

		
		//1stLink
		//driver.findElement(By.xpath("//h3[contains(text(),'Open source record and playback test automation for the web')]")).click();
		
		
		//5th Link
		driver.findElement(By.xpath("(//h3[contains(text(),'Selenium IDE Tutorial : Definition, Features, Benefits')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Free Trial')]")).click();
		
		//driver.close();
	}

}
