package com.intermiadete;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class JavaScriptExecutor1
{
	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Scroll Down
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,500)");
		
		//Scroll Top of the page
		
		js.executeScript("window,scrollTo(0,0);");
		
		
		//for Scroll up
		
		js.executeAsyncScript("window,scrollTo(0,-500);");
		
		
		//Scroll into View
		
		WebElement footerText= driver.findElement(By.xpath("//strong[text()='GreenKart']"));
		js.executeScript("argument[0],scrollIntoView(true);",footerText );
		
		
		//Scroll Bottom of the WebPage
		
		js.executeAsyncScript("window,scrollTo(0,document.body.scrollHeight);");
		
		//Title of the webpage
	System.out.println(	js.executeAsyncScript("return document.title"));

}
}
/*
public class JavascriptExecutorDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//JavascriptExecutor is used to execute javascript commands in Selenium
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolldown by 1000
		js.executeScript("window.scrollTo(0,1000);");
		
		Thread.sleep(2000);
		
		//vertical scroll up by 500
		js.executeScript("window.scrollTo(0,-500);");
		
		//title of the webpage
		System.out.println(js.executeScript("return document.title;"));
		
		//scroll down to the bottom of the webpage
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		Thread.sleep(2000);
		
		//scroll to the top of the page
		js.executeScript("window.scrollTo(0,0);");
		
		Thread.sleep(2000);
		
		//ScrollIntoview of a webelement
		WebElement footerText= driver.findElement(By.xpath("//strong[text()='GreenKart']"));
		js.executeScript("arguments[0].scrollIntoView(true);", footerText);
		
	}

}
*/