package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Group2 
{
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will get executed only once before the entire Test (Sanity Test, Regression Test etc)");
	}
	
	@BeforeMethod (alwaysRun=true)
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test annotated method");
	}
	
	
	@Test(groups= {"sanity"})
	public void testCase5()
	{
		System.out.println("Test case 5");
	}
	
	@Test (groups= {"smoke"})
	public void testCase6()
	{
		System.out.println("Test case 6");
	}
	
	@Test (groups= {"regression"})
	public void testCase7()
	{
		System.out.println("Test case 7");
	}
	
	@Test (groups= {"regression"})
	public void testCase8()
	{
		System.out.println("Test case 8");
	}
	
	
	
	
	@AfterMethod (alwaysRun=true)
	public void afterMethod()
	{
		System.out.println("This will get executed  after each @Test annotated method");
	}
	
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will get executed only once after the entire Test (Sanity Test, Regression Test etc)");
	}
	

	
	
	
	
	
	

}
