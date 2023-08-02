package com.intermiadete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class ActionClassDrag_Drop
{

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,400)");
		
		
		Actions act=new Actions(driver);
		WebElement src= driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable'][1]"));
		Thread.sleep(2000);
		act.dragAndDrop(src,target).release().build().perform();
		
}
}