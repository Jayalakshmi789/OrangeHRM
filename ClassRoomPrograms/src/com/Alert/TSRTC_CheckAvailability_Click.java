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

public class TSRTC_CheckAvailability_Click {
	
	// Global Declaration
			WebDriver driver = null;
			String url="https://www.tsrtconline.in/oprs-web/";
			
			@BeforeTest
			public void setUp()
			{		
				System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.navigate().to(url);
				driver.manage().window().maximize();
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			@Test(priority=1)
			public void handlingAlert() throws InterruptedException
			{
				// id="searchBtn" - property of Check Availabillity button
			WebElement checkAvailability=driver.findElement(By.id("searchBtn"));
				checkAvailability.click();
				
				Thread.sleep(10000);
			
				Alert alert = driver.switchTo().alert();
				
				String alertTextMessage=alert.getText();
				System.out.println(" The text of an alert window is : "+alertTextMessage);
				
				alert.accept(); // accepts the OK button in the alert window
			//	alert.dismiss(); // performs operation on cancel button
			//	alert.sendKeys("Selenium"); // sending text into an alert
								
			}
			
			@AfterTest
			public void tearDown()
			{
				driver.quit();
			}
}
