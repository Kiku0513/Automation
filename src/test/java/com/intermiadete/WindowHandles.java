package com.intermiadete;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandles 
{
	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{

		driver =new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,400)");

		String parenWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();


		Set<String> allWindows = driver.getWindowHandles();

		for(String childWindow:allWindows)
		{
			if(!(parenWindow.equalsIgnoreCase(childWindow)))
			{
				driver.switchTo().window(childWindow);
				driver.switchTo().window(parenWindow);
				driver.findElement(By.id("tabButton")).click();

			}
		}
		driver.close();

	}
}
/*package com.selenium.intermediate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle(); //it will the win handle or window id for the current window
		
		driver.findElement(By.id("windowButton")).click();
		
		//getWindowHandle()
		//getWindowHandles()
		
		Set<String> allWindows=driver.getWindowHandles(); //it will return all the window handles opened by the driver instance. In this case, it will return 2 window handles
		
		for (String childWindow:allWindows)
		{
			if(! (parentWindow.equalsIgnoreCase(childWindow)))
			{
				driver.switchTo().window(childWindow);
				String childWindowText= driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(childWindowText);
				driver.switchTo().window(parentWindow);
				String parentWindowText=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
				System.out.println(parentWindowText);
			}
			
		}
		*/