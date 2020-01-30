package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableData {
	
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
	public void capturingCompleteWebTableData()
	{
		// First Row of First Column xpath
// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// Last Row of Last Column xpath
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++) // to goto every Row
		{			
			for(int j=1;j<=8;j++) // to goto every row of all the columns
			{
String data=driver.findElement(By.xpath
("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+
		"]/td["+j+"]")).getText();
System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
