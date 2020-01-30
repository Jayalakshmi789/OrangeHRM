package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_GetTheHrefAttributeValue {

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
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		String registerText=register.getText();
		System.out.println(registerText);
		
		String expected_Url=register.getAttribute("href");
		System.out.println(expected_Url);
		
	register.click();
	
	String actual_WebPageURl=driver.getCurrentUrl();
	System.out.println(actual_WebPageURl);
	
	// validating the URL
	
	if(actual_WebPageURl.equals(expected_Url))
	{
		System.out.println(" Successfully landed at Register WebPage - PASS");
	}
	else
	{
		System.out.println(" Failed to launch Register Webpage - FAIL");
	}
			driver.quit();
}
}
