package com.intermiadete;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown_TicketBOOKING
{static WebDriver driver;
public static void main(String[] args) throws InterruptedException {

	driver=new ChromeDriver();
	driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	String parenWindow=driver.getWindowHandle();

	driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();

	Set<String> allWind = driver.getWindowHandles();

	for(String childWind:allWind)
	{
		if(!(parenWindow.equalsIgnoreCase(childWind)))
		{

			driver.switchTo().window(childWind);

			driver.findElement(By.id("autosuggest")).sendKeys("Aus");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@id='ui-id-1']"));

			List<WebElement> auto = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

			for(WebElement suggestive:auto)
			{

				if( suggestive.getText().equalsIgnoreCase("Austria"))
				{
					Thread.sleep(2000);
					suggestive.click();
					break;

				}


			}
		}
	}
}
}