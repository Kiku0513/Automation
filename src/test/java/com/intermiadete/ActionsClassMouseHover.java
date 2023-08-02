package com.intermiadete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class ActionsClassMouseHover 
{

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		WebElement dbClick=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dbClick).build().perform();
		 
		WebElement mess=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(mess.getText());
		
		
		
		
		WebElement rghtClick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rghtClick).build().perform();
		
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(click).build().perform();
		
		
		
}
}