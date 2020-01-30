package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_RadioButtonsTesting {
	
	// Global Declaration
			WebDriver driver = null;
			String url="http://www.echoecho.com/htmlforms10.htm";
			
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
			public void radioButtonsTesting() throws InterruptedException
			{
				// identifying the radioButtons block
				
	WebElement radioButtonsBlock=driver.findElement(By.xpath
("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span"
		+ "/form/table[3]/tbody/tr/td/table"));
				
				// identifying the radio Buttons Property
				// <input type="radio" name="group1" value="Milk">
				// <input type="radio" name="group1" value="Butter" checked="">
				// <input type="radio" name="group1" value="Cheese">
				
				// <input type="radio" name="group2" value="Water">
				
		List<WebElement>radioButtons=radioButtonsBlock.findElements(By.name("group1"));
				
				int radioButtonsCount=radioButtons.size();
				
	System.out.println(" The total number of Radio buttons are : "+radioButtonsCount);
				
				for(int i=0;i<radioButtonsCount;i++)// perform a click on a radio button
				{
					radioButtons.get(i).click(); //
					
			for(int j=0;j<radioButtonsCount;j++) // to get the status if the radio buttons
					{
					
//System.out.println(radioButtons.get(j).getAttribute("value")+" - "
				//  +radioButtons.get(j).getAttribute("checked"));
					
				// OR
System.out.println(radioButtons.get(j).getAttribute("value")+" - "
				+radioButtons.get(j).isSelected());
					}
			
			Thread.sleep(10000);
				}
					 	
			}
	
	@AfterTest
			public void tearDown()
			{
				driver.quit();
			}
	}
