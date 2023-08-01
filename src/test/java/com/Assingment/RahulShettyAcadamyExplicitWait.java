package com.Assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcadamyExplicitWait 
{
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

		//Enter Valid Promo Code add Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement promoCodeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoCode")));
		//valid coupn
		promoCodeElement.sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
	
		WebElement text=driver.findElement(By.xpath("//span[@class='promoInfo']"));
		System.out.println(text.getText());


		//Enter InValid Promo Code add Explicit Wait

	/*	WebElement cod1=driver.findElement(By.cssSelector(".promoCode"));
		cod.sendKeys("komal08");

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoBtn")));

		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebElement text1=	driver.findElement(By.xpath("//span[contains(text(),'Invalid code ..!')]"));
		System.out.println(text1.getText());
		*/

		driver.close();
	}

}

