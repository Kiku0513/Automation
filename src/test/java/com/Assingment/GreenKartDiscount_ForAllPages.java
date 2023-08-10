package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GreenKartDiscount_ForAllPages 
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

	@Test

	public void page1()

	{
		ArrayList<String> fruits=new ArrayList<String>();

		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		for (int i = 1; i <= veggies.size(); i++) {
			String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
			String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);

			// Calculate the discount percentage
			double orgdiscount=(discountedPrice/originalPrice)*100;

		//	System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f/n", orgdiscount);

			if(orgdiscount>50)
			{
				fruits.add(vegName);
			}

		}
		System.out.println("Fruits Hvaing more than 50% in page1----"+fruits);



	}
	@Test

	public void page2() 
	{
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		ArrayList<String> fruits=new ArrayList<String>();
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		for (int i = 1; i <= veggies.size(); i++) {
			String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
			String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);
			double orgdiscount=(discountedPrice/originalPrice)*100;

		//	System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f", orgdiscount);
			if(orgdiscount>50)
			{
				fruits.add(vegName);
			}

		}
		System.out.println("Fruits Hvaing more than 50% in page2----"+fruits);


	}

	@Test
	public void page3()

	{

		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		ArrayList<String> fruits=new ArrayList<String>();
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		for (int i = 1; i <= veggies.size(); i++) {
			String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
			String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);
			double orgdiscount=(discountedPrice/originalPrice)*100;

			//System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f", orgdiscount);
			if(orgdiscount>50)
			{
				fruits.add(vegName);
			}

		}
		System.out.println("Fruits Hvaing more than 50% in page3----"+fruits);


	}
	@Test
	public void page4()

	{

		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		ArrayList<String> fruits=new ArrayList<String>();
		List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));

		for (int i = 1; i <= veggies.size(); i++) {
			String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
			String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
			String discount=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

			double originalPrice=Double.parseDouble(Price);
			double discountedPrice=Double.parseDouble(discount);
			double orgdiscount=(discountedPrice/originalPrice)*100;

			//System.out.printf("Vegetable name=  "+ vegName  +  "  with "+"discount of : %.2f", orgdiscount);
			if(orgdiscount>50)
			{
				fruits.add(vegName);
			}

		}
		System.out.println("Fruits Hvaing more than 50% in page4----"+fruits);


	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
/*

public class Gc {
 static WebDriver driver;
	ArrayList<String> vegetableNames= new ArrayList<String>();
	int discountPercentage=50;

	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testcase1()
	{
	   String isNext = "false";
	    
	   while(isNext.equals("false")) {
			

	        List<WebElement> veggies = driver.findElements(By.xpath("//tbody/tr"));
	        
	        for (int i=1; i<=veggies.size();i++) {
	            String vegName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).getText();
	            String Price = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	            String discountt = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();
	            
	            double originalPrice = Double.parseDouble(Price);
	            double discountedPrice = Double.parseDouble(discountt);
	            
	            double discount = (discountedPrice / originalPrice) * 100;
	            System.out.printf("Vegetable name: %s Discount Percentage: %.2f\n", vegName, discount);
	            
	            if (discount > discountPercentage) {
	                vegetableNames.add(vegName);
	            }
	    	   
		}
		
            WebElement nextPageButton = driver.findElement(By.xpath("//a[@aria-label='Next']"));
            isNext =nextPageButton.getAttribute("aria-disabled");
            if(isNext.equals("false"))
            	nextPageButton.click();

	    
	    }
       System.out.println("Vegetables which have discount percentage greater than " + discountPercentage + " are " + vegetableNames.toString());

	    
	}

	@AfterMethod
	public void aftermethod()
	{
		//driver.quit();
	}
	
}*/