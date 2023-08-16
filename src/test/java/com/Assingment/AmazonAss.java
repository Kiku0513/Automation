package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonAss 
{
	WebDriver driver=null;

	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
	}

	@Test

	public void searchMob() throws InterruptedException 
	{
		String parent=	driver.getWindowHandle();
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]")).sendKeys("mobile phones");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='s-suggestion-container'][1]")));
		driver.findElement(By.xpath("//div[@class='s-suggestion-container'][1]")).click();


		Set<String> all = driver.getWindowHandles();

		for(String child:all)
		{
			if(!(parent.equalsIgnoreCase(child)))
			{
				driver.switchTo().window(child);

				
			}

		}
	}
}