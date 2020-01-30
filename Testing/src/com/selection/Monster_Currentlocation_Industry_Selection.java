package com.selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Monster_Currentlocation_Industry_Selection 

{
      WebDriver driver=null;
      
      String url="https://my.monsterindia.com/sponsered_popup.html";
      
      @BeforeTest
      public void signUP()
      {
    	  System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	  
    	  driver=new ChromeDriver();
    	  
    	  driver.navigate().to(url);
    	  
    	  driver.manage().window().maximize();
      }
      
      @Test(priority=1)
      public void currentLocation_Selection()
      {
    	  WebElement currentLocation=driver.findElement(By.className("border_grey1"));
    	  
    	  Select selection=new Select(currentLocation);
    	  
    	  selection.selectByIndex(2);  //by index value
    	  
    	  selection.selectByValue("10");  //byvalue
    	  
    	  selection.selectByVisibleText("Hyderabad / Secunderabad");   //visibletext
    	  
    	  //if we write three here all are overwrite and only last one is came.because select only one case here.
      }
      
      @Test(priority=2)
      public void industry_Selection() throws InterruptedException
      {
    	 WebElement industrySelection= driver.findElement(By.id("id_industry"));
    	 
    	 Select selection=new Select(industrySelection);
    	 
    	 selection.selectByIndex(1);
    	 
    	 selection.selectByValue("4");
    	 
    	 selection.selectByVisibleText("Banking/Accounting/Financial Services");
    	 
    	 selection.selectByIndex(0);
    	 
    	 Thread.sleep(10000);
    	 
    	 selection.deselectByIndex(1);
    	 
    	 selection.deselectByValue("5");
    	 
    	 Thread.sleep(10000);
    	 
    	 selection.deselectAll();
      }
      
      @AfterTest
      public void tearDown()
      {
    	  driver.quit();
      }
      
      
    		  






}
