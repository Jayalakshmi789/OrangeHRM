package com.TestNG;

import org.testng.annotations.Test;

public class Annotation1Test 

{
	// A Class May have any no of Testcases(@Test)
	//test case ----@Test
	//if we are not giving PRIORITY it will excute based on alphabets
	//if we want to comment or skip any test we have to give(enabled=false),by default (enable=[true)
	
	@Test  (priority=1)             
	public void gmailLaunch()
	{
		System.out.println("Gmail Application Launching");
	}
	
	@Test (priority=2) 
	public void logIn()
	{
		System.out.println("LogIn successfully");
	}
	
	@Test (priority=3) 
	public void inbox()
	{
		System.out.println("Testing Inbox Functionality");
	}
	
	@Test (priority=4) 
	public void composeMail()
	{
		System.out.println("Testing ComposeMail Functionality");
	}

}
