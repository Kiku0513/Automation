package com.Assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyTotalAmountCheck {

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{

		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		//sendKeys ber
		WebElement ber=driver.findElement(By.xpath("//input[@class='search-keyword']"));
		ber.sendKeys("ber");
		ber.click();
		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.className("product")); 

		//add to cart the products
		for(int i=1;i<list.size();i++)
		{

			list.get(i).findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
			//Thread.sleep(1000);
		}

		//click on cart-icon

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		List<WebElement> amount = driver.findElements(By.xpath("//table[@class='cartTable']/tbody/tr/td[5]"));
     for(int i=1;i<amount.size();i++)
     {
    	String rupees= amount.get(i).getText();
    	System.out.println(rupees);
     }
}
}
