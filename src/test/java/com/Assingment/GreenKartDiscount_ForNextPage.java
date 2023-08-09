package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GreenKartDiscount_ForNextPage 
{
	static WebDriver driver;
	@BeforeClass

	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	}
	
	
	int discount=50;
	static String vegName;
	@Test
	
	public void page2()
	{
		ArrayList<String> fruits=new ArrayList<String>();
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		  for (int i = 1; i <= veggies.size(); i++) {
	          String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
	          String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	          String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);
			double orgdiscount=(discountedPrice/originalPrice)*100;

			System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f", orgdiscount);
			
			if(orgdiscount>50)
			{
				fruits.add(vegName);
			}
		}
		  
		  System.out.println("Fruits Hvaing more than 50%----"+fruits);
		  driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		  
	}
}
