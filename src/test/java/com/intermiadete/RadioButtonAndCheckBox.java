package com.intermiadete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
         driver.manage().window().maximize();
		
		//selecting the first radio button value
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();
		Thread.sleep(1000);
		
		//selecting the second radio button option
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		Thread.sleep(1000);
		
		//checkbox
		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
		Thread.sleep(1000);
		
		WebElement thirdCheckbox=driver.findElement(By.xpath("//input[@value='checkbox3']"));
		thirdCheckbox.click();
		Thread.sleep(1000);
		
		if(thirdCheckbox.isSelected())
		{
			System.out.println("Third check box selection validated");
		}
		else
		{
			System.out.println("Validation failure for third checkbox selection");
		}
		driver.close();
	}
}