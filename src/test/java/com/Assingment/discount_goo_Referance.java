package com.Assingment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
public class discount_goo_Referance
{

	    private WebDriver driver;
	    private final String websiteUrl = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get(websiteUrl);
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testVegetableDiscount() {

	        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='ng-scope']"));

	        for (WebElement row : rows) {
	            String vegetableName = row.findElement(By.xpath("td[1]")).getText();
	            String discountPercentage = row.findElement(By.xpath("td[2]")).getText();

	            // Remove '%' and convert to integer
	            int discount = Integer.parseInt(discountPercentage.replaceAll("[^0-9]", ""));

	            if (discount > 20) {
	                System.out.println("Vegetable with discount > 20%: " + vegetableName);
	            }
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
}