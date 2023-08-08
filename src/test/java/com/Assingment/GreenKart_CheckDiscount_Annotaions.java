package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreenKart_CheckDiscount_Annotaions 
{
	static WebDriver driver;
	@BeforeClass

	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window,scrollTo(0,200)");
	}
	@Test

	public void dicount()

	{
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 1; i <= veggies.size(); i++) {
			String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
			String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText().replace("₹", "");
			String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText().replace("₹", "");


			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);

			// Calculate the discount percentage
			double discountText=(discountedPrice/originalPrice)*100;

			System.out.printf("Vegetable name=  "+ vegName  +"with "+discountText);
			System.out.println("-----------------------------");

			
				if(discountText<20)	
				System.out.println("Vegetable with more than 20% discount: " + vegName);
				System.out.println("-----------------------------");
			
		}


	}

}
