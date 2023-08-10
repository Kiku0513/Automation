package com.testNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization 
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
	@Parameters({"url","searchTerm"})
	public void dataParamerizationUsingParameter(String urlName, String searchValue) throws InterruptedException
	{
		driver.get(urlName);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(searchValue);
	}

}
