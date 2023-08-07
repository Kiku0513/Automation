package com.intermiadete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ashis\\Downloads\\JavScriptExecutor");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("File uploaded successfully");
		}
    }	
}
/*package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Guest User\\Downloads\\javaatsyllabus.pdf");
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("File Upload Successful");
		}
		else
		{
			System.out.println("File Upload not successful");
		}
	}

}
*/