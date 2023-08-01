package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{

		driver =new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);	
		
		//Email
		//input#userId
		//input[title='Email']
		
		driver.findElement(By.cssSelector("input#userId")).sendKeys("komaldhumale9333@gmail.com");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input#pass")).sendKeys("komal");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your company']")).sendKeys("komaldhumale");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='mobile number']")).sendKeys("933399999");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
	}

}
