package com.Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,300)");


		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
		WebElement res=driver.findElement(By.tagName("body"));
		System.out.println(res.getText());

		driver.switchTo().parentFrame();
		WebElement res1=driver.findElement(By.tagName("body"));
		System.out.println(res1.getText());

		driver.quit();
	}

}
