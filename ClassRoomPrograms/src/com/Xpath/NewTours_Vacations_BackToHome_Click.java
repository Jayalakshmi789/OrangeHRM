package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Vacations_BackToHome_Click {
	
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
		
// Implicit wait - will be applicable to all the elements of every Webpage under test
		// if an element is found within the time declared then webDriver will not wait for
 // the rest of the time - it automates the element immediately
	// ImplicitlyWait is a global wait	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void vacations()
	{
		// <a href="mercuryunderconst.php">Vacations</a>
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		vacations.click();
	}
	
	@Test(priority=2)
	public void backToHome() throws InterruptedException
	{
		/*
	     <img src="/images/forms/home.gif" width="118" height="23" border="0">
	     
		     xpath Expression - //img[@src='/images/forms/home.gif']
		     
		 */
	//Thread.sleep(10000);
	
//Element backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		backToHome.click();
		
	}
	
  /*@AfterTest
  public void tearDown()
  {
	  driver.quit();
  }*/
}
