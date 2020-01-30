package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	// Global Declaration
				WebDriver driver = null;
				String url="https://www.timeanddate.com/worldclock/";
				
				@BeforeTest
				public void setUp()
				{		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
					driver = new ChromeDriver();
					
					driver.navigate().to(url);
					driver.manage().window().maximize();
			
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}


}
