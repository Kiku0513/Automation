package com.Assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart5Ass {

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{

		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();

		WebElement list = driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
		System.out.println(list.getText());
		int res=Integer.parseInt(list.getText());
		System.out.println(res);
		driver.close();
	}

}
