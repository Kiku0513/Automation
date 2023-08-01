package com.intermiadete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	
		Select sc=new Select(driver.findElement(By.id("oldSelectMenu")));
		
		sc.selectByIndex(2);
		Thread.sleep(2000);
		
		sc.selectByValue("5");
		Thread.sleep(2000);
		
		sc.selectByVisibleText("Aqua");
		Thread.sleep(2000);
		
	List<WebElement> option = sc.getOptions();
	for(WebElement res:option)
	{
		System.out.println(res.getText());
	}
	

}
}