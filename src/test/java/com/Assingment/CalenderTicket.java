package com.Assingment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTicket 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pune (PNQ)')]")).click();


		//Select Arraival City

		driver.findElement(By.xpath("(//a[contains(text(),'Mumbai (BOM)')])[2]")).click();
		while(true) {
			String mon_year=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			System.out.println(mon_year);
			String arr[]=mon_year.split(" ");
			String mon=arr[0];
			String year=arr[1];
			if(mon_year.equalsIgnoreCase("August 2023"))
			{
				break;

			}
		}
			List<WebElement> date = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr/td/a"));
			System.out.println("Dates count---"+date.size());
			for(int i=0;i<date.size();i++)
			{
				String text=date.get(i).getText();
				System.out.println("text-"+text);
				if(text.equalsIgnoreCase("23"));
				{
					driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr/td/a")).get(i).click();
					Thread.sleep(2000);
					break;
				}
			}

		}
	}
