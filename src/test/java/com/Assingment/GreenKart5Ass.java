package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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
		
	String parentWindow=	driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String childWindow:allWindows)
		{
			if(!(parentWindow.equalsIgnoreCase(childWindow)))
			{

			driver.switchTo().window(childWindow);
		     List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		    for(WebElement veggiesName:list)
		    {
		    String res1=	veggiesName.getText();
		    System.out.println("Vegetable name--------"+res1);
		    }
		    
		    System.out.println("------------------------------------------");
		    
		    
		    //For Price
		 List<WebElement> price = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		 for(WebElement actualPrice:price)
		 {
			String  cnvPrice=actualPrice.getText();
			int realPrice=Integer.parseInt(cnvPrice);
			System.out.println("Actual Price---->"+realPrice);
		 }
		 
		 System.out.println("---------------------------------");
		 
		 //Discount Price
		 List<WebElement> dprice = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		 for(WebElement actualPrice1:dprice)
		 {
			String  cnvPrice=actualPrice1.getText();
			int disPrice=Integer.parseInt(cnvPrice);
			System.out.println("Discount Price---->"+disPrice);
		 }
		 
		 
		 //Click On nextButton
		 
		 driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
	}
	}
}
