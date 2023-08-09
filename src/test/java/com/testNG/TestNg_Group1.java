package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Group1 
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
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test (groups= {"smoke"})
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test (groups= {"regression"})
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	@Test (groups= {"regression"})
	public void testCase4()
	{
		System.out.println("Test case 4");
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
