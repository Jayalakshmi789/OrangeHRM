package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println(" Gmail application Launch ");
	}
	
	@Test(priority=1)
	public void inBox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	
	
	@Test(priority=2)
	public void composeMail()
	{
		System.out.println(" Testing ComposeMail Functionality ");
	}
	
	@Test(enabled=false)
	public void sentMail()
	{
		System.out.println(" Testing Sent Mail functionality ");
	}
	
	
	@AfterTest
	public void applicationClose()
	{
		System.out.println(" Gmail application Close ");
	}

}
