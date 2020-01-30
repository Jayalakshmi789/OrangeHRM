package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	// Test Case
	@Test (priority=1)
	public void gmailLaunch()
	{
		 System.out.println(" Gmail application launch ");
	}
	
	// Test Case
	@Test (priority=2)
	public void logIn()
	{
		System.out.println(" Gmail LogIn Successfull ");
	}
	
@Test(enabled=false)//current test case will be ignored by the TestNG at the time of execution 
	public void inBox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	
	@Test (priority=3)
	public void composeMail()
	{
		System.out.println(" Testing composeMail Functionality ");
	}
	
}
