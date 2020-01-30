package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3BeforeAndAfterMethod

{
        @BeforeMethod
        public void gmailLaunch()
        {
        	System.out.println("Gmail Application Launch");
        }
        
        @Test  (priority=1)
        public void login()
        {
        	System.out.println("Login success");
        }
        
        @Test  (priority=2)
        public void inbox()
        {
        	System.out.println("Testing Inbox Functionality");
        }
        
        @Test  (enabled=false)
        public void composeMaiL()
        {
        	System.out.println("Testing ComposeMail Functionality");
        }
        
        @AfterMethod
        public void applicationClose()
        {
        	System.out.println("Application close");
        }
}
