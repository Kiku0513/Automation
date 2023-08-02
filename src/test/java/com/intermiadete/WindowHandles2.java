package com.intermiadete;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 
{
	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{

		driver =new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
    	String parentWin=driver.getWindowHandle();
    	
    	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
    	
    	Set<String> allWindows = driver.getWindowHandles();
    	for(String childWin:allWindows)
    	{
    		if(!(parentWin.equalsIgnoreCase(childWin)))
    		{
    			driver.switchTo().window(childWin);
    		String text=	driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
    		System.out.println(text);
    		
    		driver.switchTo().window(parentWin);
    		
    		//	driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
}
}
	}
}