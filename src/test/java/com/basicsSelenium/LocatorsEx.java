package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatorsEx {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.className("gLFyf")).sendKeys("Java");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		//driver.findElement(By.linkText("Images")).click();
		
		driver.findElement(By.partialLinkText("Imag")).click();

		
		
		
		//driver.close();
	}

}
