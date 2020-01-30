package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingFirstColumnCityNames {
	

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
			
			
			@Test
			public void capturingFirstColumnCityNames()
			{
				// First Row of First Column xpath
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]			
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

				for(int i=1;i<=36;i++)
				{
					WebElement city=driver.findElement(By.xpath
	("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]"));
				String cityName=city.getText();
				System.out.println(cityName);
				}

							
			}
			
			@AfterTest
			public void tearDown()
			{
				driver.quit();
			}

}
