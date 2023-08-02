package com.Assingment;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCart_Discount_sad
{

	static WebDriver driver;
	static int sum=0;

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

		//click the icon 

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();


		//promocode -explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement promoCodeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoCode")));

		List<WebElement> totalAmount= driver.findElements(By.xpath("//tbody/tr/td[5]"));

		for(WebElement amount:totalAmount)
		{
			System.out.println(amount.getText());
			int price= Integer.parseInt(amount.getText());
			sum=sum+price;
		}
		System.out.println("Sum after adding:"+sum);


		WebElement totalPriceFromPortal=driver.findElement(By.xpath("//span[@class='totAmt']"));
		int totalPrice=Integer.parseInt(totalPriceFromPortal.getText());
		System.out.println("Total sum from webpage:"+totalPrice);

		if(sum==totalPrice)
		{
			System.out.println("Both the sums are same");
		}
		else
		{
			System.out.println("Both the sums are not same");
		}

		//discount
		int discount=10;
		int fp=100-discount;
		float n=100.0f;
		float finPrice=(fp*totalPrice)/n;
		System.out.printf("Total after discount--> %.2f",finPrice);



		//	driver.quit();

	}
}