package com.Assingment;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMulipleDropdown
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='cars']")));

		sel.selectByIndex(1);
		Thread.sleep(2000);

		sel.selectByValue("opel");
		Thread.sleep(2000);

		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);

		List<WebElement> res = sel.getOptions();
		for(WebElement option:res)
		{
			System.out.println(option.getText());
		}
			
	    sel.deselectByIndex(1);
		sel.deselectAll();
		
		driver.quit();
	}
}