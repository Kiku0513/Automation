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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreenKart_CheckDiscount1_BySir 
{
	static WebDriver driver;
	@BeforeClass

	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void testcase1()
	{
		ArrayList<String> vegetableNames= new ArrayList<String>();
		
		  List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));
		  int discountPercentage=50;
	      for (int i = 1; i <= veggies.size(); i++) {
	          String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
	          String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	          String discountt=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

	        
	          double originalPrice=Double.parseDouble(Price);
	          double discountedPrice=Double.parseDouble(discountt);

	          // Calculate the discount percentage
	          double discount=(discountedPrice/originalPrice)*100;
	          System.out.printf("Vegetable name:"+vegName+" Discount Percentage: %.2f\n", discount);
	        
	          if(discount>discountPercentage)
	          {
	        	  vegetableNames.add(vegName);
	        	  //System.out.println("more than 20%-->"+vegName);
	        	  
	          }
	          
	         // Assert.assertTrue(discount>50);
	          
	      }  
	      
	      System.out.println("Vegatbles which has discount percentage greater than "+discountPercentage+" are "+vegetableNames.toString());
			
	}
	    
	
	@AfterMethod
	public void aftermethod()
	{
		//driver.quit();
	}
	

	}