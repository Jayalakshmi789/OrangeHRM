package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Logout_OHRM {

	public static void main(String[] args) throws InterruptedException
	
	{
		String url="https://opensource-demo.orangehrmlive.com/";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		String expected_LoginPageText="LOGIN Panel";
		
		System.out.println("The Expected OHRM LoginPage Text is :"+expected_LoginPageText);
		
		String actual_WebPageText=driver.findElement(By.id("logInPanelHeading")).getText();
		
		System.out.println("The Actual OHRM LoginPage Text is :"+actual_WebPageText);
		
		if(actual_WebPageText.equals(expected_LoginPageText))
		{
			System.out.println("Expected LoginPage Text is Matched with Actual WebPage Text - PASS");
		}
		
		else
		{
			System.out.println("Expected LoginPage Text is Not Matched with Actual WebPage Text - FAIL");
		}
		
		
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        
	      WebElement password=driver.findElement(By.name("txtPassword"));
			
		password.sendKeys("admin123");
			
	     WebElement login=driver.findElement(By.name("Submit"));
			
			login.click();
			
		String	expected_AdminpageText="Admin";
		
		System.out.println("The Expected OHRM Admin Page Text is :"+expected_AdminpageText);
		
		WebElement actual_AdminPageText=driver.findElement(By.id("welcome"));
		
		String actual_HomePageText=actual_AdminPageText.getText();
		
		System.out.println("The Actual OHRM Admin Page Text is :"+actual_HomePageText);
		
		if(actual_HomePageText.contains(expected_AdminpageText))
		{
			System.out.println("Login Sucess - PASS");
		}
		else
		{
			System.out.println("Login fail - FAIL");
		}
		
		//<a href="/index.php/auth/logout">Logout</a>
		
		actual_AdminPageText.click();
		
		Thread.sleep(10000);
		
		WebElement logout_Link =driver.findElement(By.linkText("Logout"));
		
		logout_Link.click();
		
		driver.quit();
	
	}

}
