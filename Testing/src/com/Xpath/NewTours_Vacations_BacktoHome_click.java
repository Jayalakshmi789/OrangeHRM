package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Vacations_BacktoHome_click 

{
	WebDriver driver=null;
	
	String url="http://newtours.demoaut.com/";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test  (priority=1)   //if you are not giving here it doesn't run based on alphabet it will run
	public void vacations()
	{
		WebElement vacations_link=driver.findElement(By.linkText("Vacations"));
		
		vacations_link.click();
	}
	
	@Test  (priority=2)
	public void backtoHome()
	{
		//<img src="/images/forms/home.gif" width="118" height="23" border="0">
		
		// ----------   //img[@src='/images/forms/home.gif']   ----RelativeXpath
		
		WebElement backtoHome_button=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
		
		backtoHome_button.click();
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
