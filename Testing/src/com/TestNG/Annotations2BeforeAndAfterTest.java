package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2BeforeAndAfterTest 

{
	@BeforeTest
	public void gmailLaunch()
	{
		System.out.println("Launching gmail Application");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login Success  ");
	}
	
     @Test (priority=2)
     public void  inbox()
   {
	System.out.println("Testing Inbox Functionality");
	}

    @Test (enabled=false) 
   public void composeMail()
  {
	System.out.println("Testing composeMail Functionality");
   }
    
    @AfterClass
    public void applicationClose()
    {
    	System.out.println("Application close");
    }
}
