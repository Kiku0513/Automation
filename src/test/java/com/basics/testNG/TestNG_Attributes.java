package com.basics.testNG;

import org.testng.annotations.Test;

public class TestNG_Attributes
{
	@Test(priority=2,alwaysRun=true)

	public void login()  //2

	{
		System.out.println("If we Already have an account thn Login");
	}
	@Test(priority=1)

	public void signup()//4

	{
		System.out.println("We are new thn SignUp ");
	}
	@Test(dependsOnMethods="login")

	public void sendmail() //3

	{
		System.out.println("After Login SendMail");
	}
	@Test(enabled=false)

	public void inbox() //1

	{
		System.out.println("Recevide mail in Inbox");
	}
}
/*
 * priority
 * enabled
 * dependsOnMethods
 * alwaysRun
 

@Test (priority=3, dependsOnMethods="atestCase4")
public void testCase1()
{
	System.out.println("Test case 1");
}

@Test (priority=2, alwaysRun=true)
public void testCase2()
{
	System.out.println("Test case 2");
}

@Test (priority=1, enabled=false)
public void testCase3()
{
	System.out.println("Test case 3");
}

@Test (priority=4)
public void atestCase4()
{
	System.out.println("Test case 4");
}



*/