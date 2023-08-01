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

public class sad
{
	 
			static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {

				driver=new ChromeDriver();
				driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
				driver.manage().window().maximize();

				WebElement add=driver.findElement(By.xpath("//input[@class='search-keyword']"));
				add.sendKeys("ber");
				add.click();
				Thread.sleep(1000);

				List<WebElement> list = driver.findElements(By.className("product")); 

				//add to cart the products
				for(int i=1;i<list.size();i++)
				{

					list.get(i).findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
					//Thread.sleep(1000);
				}
				//click the icon 

				driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

				//promocode -explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				WebElement promoCodeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoCode")));
				//valid coupn
				promoCodeElement.sendKeys("rahulshettyacademy");
				//invalid coupon
				// promoCodeElement.sendKeys("sadhana20");

				//click on apply button
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				System.out.println("code applied");
				//System.out.println("invalid code");
				
				

				int totPrice=0;
				//price -
				List<WebElement> list1=driver.findElements(By.xpath("//*[@id='productCartTables']/tbody/tr/td[5]"));
				for(int i=0;i<list1.size();i++)
				{
					String p=list1.get(i).getText();
					//convert string to integer
					int price=Integer.parseInt(p);
					totPrice+=price;
					System.out.println(price);
				}

				System.out.println("total price---"+totPrice);

				//total amount
				WebElement ele=driver.findElement(By.xpath("//span[@class='totAmt']"));
				String tm=ele.getText();
				int Totam=Integer.parseInt(tm);
				if(totPrice==Totam)
				{
					System.out.println("validated");
				}
				else
				{
					System.out.println("price is not equal");
				}
				//discount
				int discount=10;
				int fp=100-discount;
				float n=100.0f;
				float finPrice=(fp*Totam)/n;
				System.out.printf("Total after discount--> %.2f",finPrice);



				//	driver.quit();
			
}
}