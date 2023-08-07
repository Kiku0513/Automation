package com.Assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart_ToGetAllVegiesNamerom_ParentPage
{
	static WebDriver driver;
     public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.className("products"));

		List<WebElement> veggies = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int count=veggies.size();
		System.out.println("Count of Vegetables in list is----->"+count);


		for(WebElement vegName:veggies)
		{
			String vegetableName=vegName.getText();
			System.out.println("Name of Vegetable----->"+vegetableName);
		}
		driver.close();
	}
}