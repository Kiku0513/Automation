package com.testNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Parallel1 
{
	WebDriver driver=null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test
	public void launchLambdatest() throws InterruptedException
	{
		driver.get("https://www.lambdatest.com/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Login']"))));
		String expectedTitle="Next-Generation Mobile Apps and Cross Browser Testing Cloud | LambdaTest";
		String actualTitle= driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test
	public void launchSaucelabs()
	{
		driver.get("https://saucelabs.com/");
		String expectedTitle="Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
		Assert.assertTrue(driver.getTitle().equals(expectedTitle));
		
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
