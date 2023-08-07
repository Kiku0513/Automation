package com.basics.testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Calender
{
	static WebDriver driver;

	@Test
	public  void calender()throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,1000)");

		Thread.sleep(2000);

		String month="sept";
		String year="2024";
		String bdate="5";
		//April 23
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();


		while(true)
		{
			String mon=driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText();
			System.out.println("Month----"+mon);


			if((mon.equalsIgnoreCase(month)))

				break;

			else

				driver.findElement(By.xpath("//span[contains(@class,'flatpickr-next-month')]")).click();
			break;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flatpickr-innerContainer'] //div[@class='flatpickr-days']/div"));

		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='dayContainer'] //span[@class='flatpickr-day ']"));
		//Grab common attribute//Put into list and iterate
		int count=dates.size();
		System.out.println(count);

		for(WebElement date:dates)
		{
			String daate=date.getText();
			System.out.println(daate);

			if(daate.equalsIgnoreCase(bdate))
			{
				date.click();
				break;
			}

		}

	}

}
