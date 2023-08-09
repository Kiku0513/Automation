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
	}
	@Test

	public void dicount()

	{
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		  for (int i = 1; i <= veggies.size(); i++) {
	          String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
	          String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	          String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);

			// Calculate the discount percentage
			double orgdiscount=(discountedPrice/originalPrice)*100;

			System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f", orgdiscount);
			System.out.println("-----------------------------");


			if(orgdiscount>20)	
				System.out.println("Vegetable with more than 20% discount: " + vegName);
			System.out.println("-----------------------------");

		}


	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}





/*

public class GreenCartDiscountPercentage {
 WebDriver driver=null;
 double discount1;
 String vegName;
 List<String> veggiesName=new ArrayList<String>();
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void testcase1()
	{
		  List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));
	      for (int i = 1; i <= veggies.size(); i++) {
	          String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
	          String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	          String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();


	          double originalPrice=Double.parseDouble(Price);
	          double discountedPrice=Double.parseDouble(discount);

	          // Calculate the discount percentage
	          double discount1=(discountedPrice/originalPrice)*100;
	          System.out.printf("Vegetable name: %s, Discount Percentage: %.2f%%\n", vegName, discount1);

	          if(discount1>20)
	          {
	        	  veggiesName.add(vegName);
	          }

	      }


	}

	      @Test(priority=2)
	      public void testcase2()
	      {
	    	  for(String vegname:veggiesName)
	    	  {
	    		  System.out.println("more than 20%-->"+vegname);
	    	  }
	    	//  int checkdiscount=20;
	    	//  Assert.assertFalse(discount1>checkdiscount,"more than 20% " +vegName);

	      }
 */