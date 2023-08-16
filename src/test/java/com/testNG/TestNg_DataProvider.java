package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_DataProvider
{

	WebDriver driver=null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
	//@Test(dataProvider="Test")
	@Test(dataProvider="testdata")
	
	public void fetchDATA(String url,String search) throws InterruptedException
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(search);;
		Thread.sleep(2000);
	}
	
	//@DataProvider(name="Test")
	@DataProvider
	public Object[][] testdata()
	{
		
		Object [][] data=new Object[][] {
			
				{"https://www.google.com","Guvi"},
				{"https://www.google.com","Data Provider in TestNg"},
				{"https://www.google.com","Parameter annotation"}
				
			
		};
		return data;
		
		
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		driver.quit();
	}
}
/*public class ParameterizationUsingDataProvider {

WebDriver driver=null;

@BeforeMethod
public void launchBrowser()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

//@Test(dataProvider="testdata")
@Test(dataProvider="dataSet")
public void fetchData(String url, String searchTerm) throws InterruptedException
{
	driver.get(url);
	driver.findElement(By.name("q")).sendKeys(searchTerm);
	Thread.sleep(2000);
}

//@DataProvider(name="testdata")
@DataProvider
public Object[][] dataSet()
{
	/*One way of declaring the Object[][] with size
	Object[][] data = new Object[3][2];
	
	return data;
	
	*/
/*	
	Object[][] data =new Object[][] {
		{"https://www.google.com","Guvi"},
		{"https://www.google.com","Data Provider"},
		{"https://www.google.com","Parameter annotation"}
		
	};
	

	/*
	return new Object[][] {
		{"https://www.google.com","Guvi"},
		{"https://www.google.com","Data Provider"},
		{"https://www.google.com","Parameter annotation"}
		
	};
	*/
	/*return data;
	

	
	
	
}


@AfterMethod
public void closeBrowsers()
{
	driver.quit();
}

}
*/