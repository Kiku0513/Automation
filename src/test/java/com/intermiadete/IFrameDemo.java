package com.intermiadete;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrameDemo 
{

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			driver=new ChromeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/iframe");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			/*
			 *
			 * 1. frame name or id
			 * 2. frame webelement
			 * 3. index
			 * 
			 */
			
			WebElement frame= driver.findElement(By.id("mce_0_ifr"));
			
			driver.switchTo().frame("mce_0_ifr");
			//driver.switchTo().frame(frame);
			//driver.switchTo().frame(0);
			
			
			driver.findElement(By.id("tinymce")).clear();
			driver.findElement(By.id("tinymce")).sendKeys("Checking frames");
			
			//switching the control to the main html page
			driver.switchTo().defaultContent();
			
			System.out.println(driver.findElement(By.tagName("h3")).getText());

		}

	}



