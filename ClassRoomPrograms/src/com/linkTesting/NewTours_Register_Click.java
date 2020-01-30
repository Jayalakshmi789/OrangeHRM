package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_Click {

	public static void main(String[] args) {
		
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);

		
		/*
		
 <a href="mercuryregister.php">REGISTER</a>

  a - an achor tag
 
  href - attribute 

 Element Type - link

 locator - linkText
 Selector - REGISTER
		 
		 */
		
		//WebElement register=driver.findElement(By.linkText("REGISTER"));
		                // OR
		WebElement register =driver.findElement(By.partialLinkText("REGI"));
		
		register.click();
		
		String registerWebPageTitle=driver.getTitle();
		
	System.out.println(" The title of the Register Webpage is : "+registerWebPageTitle);
		
	// write the validation for the register Webpage - based on a text	
		
	}
}
