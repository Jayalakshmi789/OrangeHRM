package com.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Register_Country_Select {

	
		
		// Global Declaration
				WebDriver driver = null;
				String url="http://newtours.demoaut.com";
				
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
				public void register()
				{
					// <a href="mercuryregister.php">REGISTER</a>
					WebElement register=driver.findElement(By.linkText("REGISTER"));
					register.click();
				
				}
			
				@Test(priority=2)
				public void countryDropDown() throws IOException
				{
					// Country Element property - name="country"
					
					WebElement countryDropDown=driver.findElement(By.name("country"));
					
					// Select - its a class in WEbDriver
					
					Select selection = new Select(countryDropDown);
					
					selection.selectByIndex(12);
					selection.selectByValue("251");
					selection.selectByVisibleText("INDIA");
					
					
				}

	}


