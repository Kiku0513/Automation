package com.Assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCart_Valid_Invalid_Coupoun {

	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		WebElement add=driver.findElement(By.xpath("//input[@class='search-keyword']"));
		add.sendKeys("ber");
		add.click();
		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.className("product"));


		List<WebElement> veggies= driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		for(WebElement veggie:veggies)
		{
			veggie.click();
		}

		//click on cart-icon

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();


		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		WebElement code=driver.findElement(By.xpath("//input[@placeholder='Enter promo code']"));
		
		//valid coupon
		//code.sendKeys("rahulshettyacademy");		

		//invalid coupon
		 code.sendKeys("KOmal05");

		//click on apply button-Explicit wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Apply')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	
		
		WebElement text=driver.findElement(By.xpath("//span[@class='promoInfo']"));
		System.out.println(text.getText());
		
			}
	
}
