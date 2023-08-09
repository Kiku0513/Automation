package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotations
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite will Execute only once");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test will Execute only once");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class will Execute only once");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method will Execute Every Time depend on methods");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite will Execute only once");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test will Execute only once");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class will Execute only once");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method will Execute Every Time depend on methods");
	}

	@Test
	public void Method1()
	{
		System.out.println("Method 1");
	}
	
	@Test
	public void Method2()
	{
		System.out.println("Method 2");
	}
	
	@Test
	public void Method3()
	{
		System.out.println("Method 3");
	}
}
