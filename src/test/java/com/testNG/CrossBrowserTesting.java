package com.testNG;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{
	WebDriver driver=null;
	@BeforeClass
	@Parameters({"browser"})
	public void crossBrowserTest(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@Test
	public void verifyTitle()
	{
		try
		{
			driver.get("https://www.google.com");	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));

			Assert.assertEquals(driver.getTitle(), "Google");

			driver.findElement(By.name("q")).sendKeys("Cross browser Testing");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}


	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
}
