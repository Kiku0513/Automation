package com.Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAss 
{

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,500)");

		driver.switchTo().frame("frame1");
		WebElement text=	driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());

		driver.switchTo().defaultContent();


		driver.switchTo().frame("frame2");
		WebElement text1=	driver.findElement(By.id("sampleHeading"));	
		System.out.println(text1.getText());
		driver.close();
	}
}