package com.HeaderBlockLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTCHeaderBlockLinks 

{
	
     WebDriver driver=null;
    
    String url="https://www.tsrtconline.in/oprs-web/";
    
    @BeforeTest
    public void setUP()
    {
    	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.navigate().to(url);
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void headerBlock()
    {
    	WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
    	
    	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
    	
    	int headerBlocklinksCount=headerBlockLinks.size();
    	
    	System.out.println("The total number of links are "+headerBlocklinksCount);
    	
    	for(int k=0;k<headerBlocklinksCount;k++)
    	{
    		String headerBlockLinksName=headerBlockLinks.get(k).getText();
    		
    		System.out.println(k +"  "+headerBlockLinksName);
    	}
    }
    	
    	@AfterTest
        public void tearDown()
        {
        	driver.quit();
        }
    }


