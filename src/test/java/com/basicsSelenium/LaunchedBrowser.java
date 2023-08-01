package com.basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchedBrowser {

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		 driver =new ChromeDriver();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
	driver.get("http://www.google.com");


		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
