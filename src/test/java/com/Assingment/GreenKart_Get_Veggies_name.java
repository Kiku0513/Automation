package com.Assingment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart_Get_Veggies_name {

	static WebDriver driver;

	public static void main (String []args)throws InterruptedException 
	{

		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();


		Set<String> allWindows = driver.getWindowHandles();

		for(String childWindow:allWindows)
		{
			if(!(parentWindow.equalsIgnoreCase(childWindow)))
			{

				driver.switchTo().window(childWindow);
				
				
				//Vegetable name Page 1
				List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				for(WebElement veggiesName:list)
				{
					String res1=	veggiesName.getText();
					System.out.println("Vegetable name page 1--------"+res1);
				}

				System.out.println("------------------------------------------");


				//For Price page 1
				List<WebElement> price = driver.findElements(By.xpath("//tbody/tr/td[2]"));
				for(WebElement actualPrice:price)
				{
					String  cnvPrice=actualPrice.getText();
					int realPrice=Integer.parseInt(cnvPrice);
					System.out.println("Actual Price page 1---->"+realPrice);
				}

				System.out.println("---------------------------------");

				//Discount Price page1
				List<WebElement> dprice = driver.findElements(By.xpath("//tbody/tr/td[3]"));
				for(WebElement actualPrice1:dprice)
				{
					String  cnvPrice=actualPrice1.getText();
					int disPrice=Integer.parseInt(cnvPrice);
					System.out.println("Discount Price page 1---->"+disPrice);
				}

				

				System.out.println("------------------------------------------");
			

				//Click On nextButton

				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
				
				
				//Vegetable names page 2
				List<WebElement> list1 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				for(WebElement veggiesName:list1)
				{
					String res2=	veggiesName.getText();
					System.out.println("Vegetable name page 2--------"+res2);
				}

				System.out.println("------------------------------------------");
				
				
				//For Price page2
				List<WebElement> price1 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
				for(WebElement actualPrice:price1)
				{
					String  cnvPrice1=actualPrice.getText();
					int realPrice1=Integer.parseInt(cnvPrice1);
					System.out.println("Actual Price page 2---->"+realPrice1);
				}

				System.out.println("---------------------------------");

				//Discount Price page 2
				List<WebElement> dprice1 = driver.findElements(By.xpath("//tbody/tr/td[3]"));
				for(WebElement actualPrice1:dprice1)
				{
					String  cnvPrice1=actualPrice1.getText();
					int disPrice1=Integer.parseInt(cnvPrice1);
					System.out.println("Discount Price page 2---->"+disPrice1);
					
				}
				

				System.out.println("------------------------------------------");
			
				//Click On nextButton

				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
				//Vegetable names page 3
				List<WebElement> list2 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				for(WebElement veggiesName:list2)
				{
					String res3=	veggiesName.getText();
					System.out.println("Vegetable name page 3--------"+res3);
				}

				System.out.println("------------------------------------------");
				
				
				//For Price page3
				List<WebElement> price2 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
				for(WebElement actualPrice:price2)
				{
					String  cnvPrice2=actualPrice.getText();
					int realPrice2=Integer.parseInt(cnvPrice2);
					System.out.println("Actual Price page 3---->"+realPrice2);
				}

				System.out.println("---------------------------------");

				//Discount Price page 3
				List<WebElement> dprice2 = driver.findElements(By.xpath("//tbody/tr/td[3]"));
				for(WebElement actualPrice1:dprice2)
				{
					String  cnvPrice2=actualPrice1.getText();
					int disPrice2=Integer.parseInt(cnvPrice2);
					System.out.println("Discount Price page 3---->"+disPrice2);
					
				}
				
				System.out.println("---------------------------------");
				//Click On nextButton

				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
				
				
				//Vegetable names page 4
				List<WebElement> list3 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				for(WebElement veggiesName:list3)
				{
					String res4=	veggiesName.getText();
					System.out.println("Vegetable name page 4--------"+res4);
				}

				System.out.println("------------------------------------------");
				
				
				//For Price page3
				List<WebElement> price3= driver.findElements(By.xpath("//tbody/tr/td[2]"));
				for(WebElement actualPrice:price3)
				{
					String  cnvPrice3=actualPrice.getText();
					int realPrice2=Integer.parseInt(cnvPrice3);
					System.out.println("Actual Price page 4---->"+realPrice2);
				}

				System.out.println("---------------------------------");

				//Discount Price page 3
				List<WebElement> dprice3 = driver.findElements(By.xpath("//tbody/tr/td[3]"));
				for(WebElement actualPrice1:dprice3)
				{
					String  cnvPrice3=actualPrice1.getText();
					int disPrice3=Integer.parseInt(cnvPrice3);
					System.out.println("Discount Price page 4---->"+disPrice3);
					
				}
				
                  driver.findElement(By.xpath("//a[@aria-label='Previous']")).click();
                  
                  driver.findElement(By.xpath("//a[@aria-label='First']")).click();
			}
		}
		
		driver.close();
	}
}
