package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GettingCityName {
	

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
			
			@Test(priority=1)
			public void cityName()
			{
				// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
				
				WebElement city=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
				String cityName=city.getText();
				
				System.out.println(" The city Name is : "+cityName);
				
			}
			
			@AfterTest
			public void tearDown()
			{
				driver.quit();
			}

}
