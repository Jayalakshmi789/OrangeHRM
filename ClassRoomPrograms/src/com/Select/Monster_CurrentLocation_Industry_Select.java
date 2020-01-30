package com.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Monster_CurrentLocation_Industry_Select {
	

	// Global Declaration
			WebDriver driver = null;
			String url="https://my.monsterindia.com/sponsered_popup.html";
			
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
			public void currentLocation_Select()
			{
		 // class="border_grey1" - property of Current Location
				
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
				
				Select selection = new Select(currentLocation);
				selection.selectByVisibleText("Yemen");
			
			}
			
			@Test(priority=2)
			public void industry_Select() throws InterruptedException
			{
				// id="id_industry" - industry Element property
				
				WebElement industry=driver.findElement(By.id("id_industry"));
				Select selection = new Select(industry);
				
				selection.selectByIndex(1); // index starts with 0
	selection.selectByValue("4"); // take the value number from the element property
selection.selectByVisibleText("Banking/Accounting/Financial Services"); // text of element
				selection.selectByIndex(0);
	
				Thread.sleep(10000);
			
			selection.deselectByIndex(1);
			selection.deselectByValue("5");
				
				Thread.sleep(10000);
			
		selection.deselectAll();
			}
			
			/*@AfterTest
			public void tearDown()
			{
				driver.quit();
			}
			*/
	
}
