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
	    
	    
	    
	    /*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class VegetableDiscountTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set up WebDriver (Assuming ChromeDriver is used)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testVegetableDiscount() {
        // Navigate to the provided URL
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // Get all rows of the table
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));

        // Skip the header row (first row)
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> columns = rows.get(i).findElements(By.cssSelector("td"));

            // Get vegetable name and discount percentage
            String vegetableName = columns.get(0).getText();
            String discount = columns.get(2).getText();

            // Convert discount percentage to numeric value
            double discountValue = Double.parseDouble(discount.replace("%", ""));

            // Check if discount is more than 20%
            if (discountValue > 20) {
                System.out.println("Vegetable with discount > 20%: " + vegetableName);
            }
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
*/
}