package com.basics.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Assertions
{
	static WebDriver driver;
	@BeforeMethod

	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window,scrollTo(0,200)");
	}

	@Test(enabled=false)
	
	public void assEqual()
	{
		String expected="Google";
		Assert.assertEquals(driver.getTitle(), expected);
		driver.findElement(By.name("q")).sendKeys("Selenium Learning");
	}
	
	@Test(enabled=false)
	public void assNotEquals()
	{

		String expected="Google";
		Assert.assertNotEquals(driver.getTitle(), expected);
		driver.findElement(By.name("q")).sendKeys("Selenium Learning");
	}
	
	@Test
	
	public void assTrueCon() 
	{
		String expected="Google";
		Assert.assertTrue(driver.getTitle().equals(expected));
		driver.findElement(By.name("q")).sendKeys("Selenium Learning");	
	}
	
@Test
	
	public void assFlaseCon() 
	{
		String expected="Google";
		Assert.assertFalse(driver.getTitle().equals(expected));
		driver.findElement(By.name("q")).sendKeys("Selenium Learning");	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}
	
	
}
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssertions {

	WebDriver driver=null;


	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
	}

	//@Test
	public void testCase1()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google1";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	//@Test
	public void testCase2()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		Assert.assertNotEquals(driver.getTitle(), expectedTitle);
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	//@Test
	public void testCase3()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google1";
		Assert.assertTrue(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	@Test
	public void testCase4()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		Assert.assertFalse(driver.getTitle().equals(expectedTitle));
		driver.findElement(By.name("q")).sendKeys("TestNg Assertions");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}

}
*/
