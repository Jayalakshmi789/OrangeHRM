package com.TestAllLinksinLoginPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLoginPageLinksTest 

{
       WebDriver driver=null;
       
       String url="http://www.newtours.demoaut.com/";
       
       @BeforeTest
       public void setUP()
       {
    	   System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	   
    	   driver=new ChromeDriver();
    	   
    	   driver.navigate().to(url);
    	   
    	   driver.manage().window().maximize();
       }
       
       @Test
       public void newtoursLinks() throws IOException, InterruptedException
       {
    	 List <WebElement> links=driver.findElements(By.tagName("a"));
    	 
    	 int linksCount=links.size();
    	 
    	 System.out.println("Links Count :"+linksCount);
    	 
    	 for(int i=0;i<linksCount;i++)
    	 {
    		 String linksName=links.get(i).getText();
    		 
    		 System.out.println(i + "  "+ linksName);
    		 
    		 links.get(i).click();
    		 
    		 Thread.sleep(10000);
    		 
             System.out.println(driver.getTitle());
    		 
    		 System.out.println(driver.getCurrentUrl());
    		 
    		 System.out.println();
    		 
    		 driver.navigate().back();
    		 
    		 links=driver.findElements(By.tagName("a"));
    		 
    		
    	
    	 }
       }
       
       
       @AfterTest
       public void tearDown()
       {
    	   driver.quit();
       }
}
