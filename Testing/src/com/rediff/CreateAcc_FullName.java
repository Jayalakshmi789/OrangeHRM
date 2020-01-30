package com.rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAcc_FullName 

{

	WebDriver driver=null;
	
	String url="https://www.rediff.com/";
	
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void cilckCreateAccountin_Rediff() 
	{
		WebElement createAccount=driver.findElement(By.linkText("Create Account"));
		
		createAccount.click();
		
	}
	
	@Test(priority=2)
	public void enterFirstName()
	{
		WebElement firstName=driver.findElement(By.name("name34483243"));
		
           firstName.sendKeys("Jaya Lakshmi");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
