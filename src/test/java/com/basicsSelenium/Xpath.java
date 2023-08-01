package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{

		//driver =new ChromeDriver();
		driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//By Atrribute
	/*	driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("komaldhumale9333@gmail.com");
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//input[@id='pass'][1]")).sendKeys("kiku@0513");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='company'][1]")).sendKeys("XYZ");
	
	    Thread.sleep(4000);
	    
		driver.findElement(By.xpath("//input[@name='mobile number'][1]")).sendKeys("9421991883");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@value='Submit'][1]")).click();
		Thread.sleep(4000);
	
	*/
		//By Contains method
		
	driver.findElement(By.xpath("//input[contains(@title,'Email')]")).sendKeys("komaldhumale9333@gmail.com");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//input[contains(@name,'Password')]")).sendKeys("kiku@0513");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[contains(@name,'company')][1]")).sendKeys("XYZ");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[contains(@name,'mobile number')][1]")).sendKeys("9421991883");
	Thread.sleep(4000);
	
	//OR
	//input[contains(@value,'Submit') or //input[@value='Submit'][1]][3]
	
	//AND
	//input[contains(@value,'Submit') and //input[@value='Submit'][1]]
	
	//logical or
	//input[contains(@value,'Submit') ]| //input[@value='Submit'][1]
	driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
