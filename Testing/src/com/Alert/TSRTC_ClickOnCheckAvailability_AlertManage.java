package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTC_ClickOnCheckAvailability_AlertManage 

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
    public void checkAvailability() throws InterruptedException
    
    {
    	WebElement checkAvailability_Button=driver.findElement(By.id("searchBtn"));
    	
    	checkAvailability_Button.click();
    	
    	Thread.sleep(1000);
    	
    	Alert alert=driver.switchTo().alert();
    	
    	String alertMessage=alert.getText();
    	
    	System.out.println("The Alert Message is :"+alertMessage);
    	
    	alert.accept();
    	
    }
    
    @AfterTest
    public void tearDown()
    {
    	driver.quit();
    }
}
